package com.quanlynhansu.quanlynhansu.controller;

import com.quanlynhansu.quanlynhansu.models.NhanVien;
import com.quanlynhansu.quanlynhansu.services.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NhanVienController {
    @Autowired
    NhanVienService nhanVienService;

//    @RequestMapping("/admin")
//    public String getAllNhanvien(Model model){
//        model.addAttribute("nhanvienList", nhanVienService.findAll());
//        return "home";
//    }

    @RequestMapping("/nhanvien/add")
    public String addnhanvienPages(){
        return "add-nhanvien";
    }
    @RequestMapping(value = "/nhanvien/add", method = RequestMethod.POST)
    public String add(@ModelAttribute NhanVien nhanVien){
        nhanVienService.save(nhanVien);
        return "add-nhanvien";
    }
}
