package com.quanlynhansu.quanlynhansu.services;

import com.quanlynhansu.quanlynhansu.models.User;
import com.quanlynhansu.quanlynhansu.repositorys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    UserRepository userRepository;
    public String checkId(User user){
        String email = user.getEmail();
        String password = user.getPassword();
        String manv = userRepository.getIdByEmailAndPassword(email,password);
        if(manv != null){
            return manv;
        }
        return null;
    }
}
