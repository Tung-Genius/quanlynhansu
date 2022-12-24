package com.quanlynhansu.quanlynhansu.services;

import com.quanlynhansu.quanlynhansu.models.User;
import com.quanlynhansu.quanlynhansu.repositorys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public User findById(String id){
        return userRepository.findById(id).get();
    }
    public String getIdByEmailAndPassword(User user){
        return userRepository.getIdByEmailAndPassword(user.getEmail(), user.getPassword());
    }

    public int getQuyenById(String manv){
        return userRepository.getQuyenById(manv);
    }
}
