package com.speedRoller.aplicacion.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Model.userModel;


@Repository
public interface userRepository extends JpaRepository<userModel, Long>
{

    
}
