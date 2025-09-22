package com.speedRoller.aplicacion.Repository;

import org.springframework.stereotype.Repository;

import com.speedroller.app_v1.Model.userModel;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<userModel, Long>
{
    
}
