package com.quanlynhansu.quanlynhansu.controller;

import com.quanlynhansu.quanlynhansu.models.User;
import com.quanlynhansu.quanlynhansu.repositorys.UserRepository;
import com.quanlynhansu.quanlynhansu.services.LoginService;
import com.quanlynhansu.quanlynhansu.services.NhanVienService;
import com.quanlynhansu.quanlynhansu.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
    @Autowired
    LoginService loginService;
    @Autowired
    UserService userService;
    @Autowired
    NhanVienService nhanVienService;
    @RequestMapping(value = {"/","/login"})
    public String loginPage(Model model){
        model.addAttribute("user", new User());
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@ModelAttribute("user") User user, Model model){
        String manv = loginService.checkId(user);
        if(manv != null){
            int quyen = userService.getQuyenById(manv);
            if(quyen == 1){
                model.addAttribute("user", userService.findById(manv));
                model.addAttribute("nhanvienList", nhanVienService.findAll());
                return "home";
            } else if(quyen == 2){
                model.addAttribute("user", userService.findById(manv));
                model.addAttribute("hoten", nhanVienService.getHotenById(manv));
                model.addAttribute("nhanvienList", nhanVienService.findAll());
                return "home";
            }
            model.addAttribute("message", "Bạn không có quyền đăng nhập!");
            return "login";

        }
        model.addAttribute("message", "Đăng nhập thất bại!");
        return "login";
    }
}
