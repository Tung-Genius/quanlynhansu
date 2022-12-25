package com.quanlynhansu.quanlynhansu.controller;

import com.quanlynhansu.quanlynhansu.models.NhanVien;
import com.quanlynhansu.quanlynhansu.models.NhanVienForm;
import com.quanlynhansu.quanlynhansu.services.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class NhanVienController {
    @Autowired
    NhanVienService nhanVienService;
    @Value("${upload.path}")
    private String fileUpload;

//    @RequestMapping("/admin")
//    public String getAllNhanvien(Model model){
//        model.addAttribute("nhanvienList", nhanVienService.findAll());
//        return "home";
//    }

    @RequestMapping("/nhanvien/add")
    public String addnhanvienPages(Model model){
        model.addAttribute("nhanvien", new NhanVienForm());
        return "add-nhanvien";
    }
    @RequestMapping(value = "/nhanvien/add", method = RequestMethod.POST)
    public String add(@ModelAttribute NhanVienForm nhanVienForm) throws IOException {
        NhanVien nhanVien = new NhanVien.NhanvienBuilder(nhanVienForm.getHoten())
                .manv(nhanVienForm.getManv())
                .ngaysinh(nhanVienForm.getNgaysinh())
                .quequan(nhanVienForm.getQuequan())
                .dantoc(nhanVienForm.getDantoc())
                .tongiao(nhanVienForm.getTongiao())
                .tinhtranghonnhan(nhanVienForm.getTinhtranghonnhan())
                .tinhtrangsuckhoe(nhanVienForm.getTinhtrangsuckhoe()).build();
        MultipartFile multipartFile = nhanVienForm.getImage();
        String fileName = multipartFile.getOriginalFilename();
        FileCopyUtils.copy(nhanVienForm.getImage().getBytes(), new File(this.fileUpload + fileName));
        nhanVien.setImage(fileName);
        nhanVienService.save(nhanVien);
        return "add-nhanvien";
    }
}
