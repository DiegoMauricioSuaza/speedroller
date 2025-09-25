package com.speedRoller.aplicacion.Repository;

package com.speedroller.aplicacion.Repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.speedroller.Model.userModel;

import Model.userModel;

@Repository
public interface UserRepository extends JpaRepository<userModel, Long> {
}
