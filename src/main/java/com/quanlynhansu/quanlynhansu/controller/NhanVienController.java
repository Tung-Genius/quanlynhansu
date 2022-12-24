package com.quanlynhansu.quanlynhansu.controller;

import com.quanlynhansu.quanlynhansu.services.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NhanVienController {
    @Autowired
    NhanVienService nhanVienService;

//    @RequestMapping("/admin")
//    public String getAllNhanvien(Model model){
//        model.addAttribute("nhanvienList", nhanVienService.findAll());
//        return "home";
//    }
}
