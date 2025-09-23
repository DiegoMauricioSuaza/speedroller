package com.speedroller.aplicacion.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class userModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;

	@Column(name = "Nombre", nullable = false, length = 50)
	String name;
    
	@Column(name = "e_mail", nullable = false, length = 40)
	String email;

	@Column(name = "password", nullable = false, length = 255)
	String password;
}