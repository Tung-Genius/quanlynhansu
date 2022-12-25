package com.quanlynhansu.quanlynhansu.services;

import com.quanlynhansu.quanlynhansu.models.NhanVien;
import com.quanlynhansu.quanlynhansu.repositorys.NhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhanVienService {
    @Autowired
    NhanVienRepository nhanVienRepository;

    public List<NhanVien> findAll(){
        return (List<NhanVien>) nhanVienRepository.findAll();
    }
    public String getHotenById(String manv){
        return nhanVienRepository.getHotenById(manv);
    }
    public void save(NhanVien nhanVien){
        nhanVienRepository.save(nhanVien);
    }
}
