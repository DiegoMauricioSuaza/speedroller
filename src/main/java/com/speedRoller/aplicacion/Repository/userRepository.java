package com.speedroller.aplicacion.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.speedroller.aplicacion.Model.userModel;

@Repository
public interface UserRepository extends JpaRepository<userModel, Long>{
    
}
