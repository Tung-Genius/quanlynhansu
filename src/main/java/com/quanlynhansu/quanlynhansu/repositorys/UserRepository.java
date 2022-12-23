package com.quanlynhansu.quanlynhansu.repositorys;

import com.quanlynhansu.quanlynhansu.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, String> {
    @Query(value = "select manv from users u where u.email = ?1 and u.password = ?2", nativeQuery = true)
    String getIdByEmailAndPassword(String email, String pass);
    @Query(value = "select Quyen from Users u where u.manv = ?1", nativeQuery = true)
    int getQuyenById(String manv);
}
