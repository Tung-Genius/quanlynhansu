package com.quanlynhansu.quanlynhansu.repositorys;

import com.quanlynhansu.quanlynhansu.models.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface NhanVienRepository extends JpaRepository<NhanVien, String> {
    @Query(value = "select hoten from nhanvien nv where nv.manv = ?1", nativeQuery = true)
    String getHotenById(String manv);
}
