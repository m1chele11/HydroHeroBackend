package com.HydroHero.HydroHero.repositories;


import com.HydroHero.HydroHero.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;




@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
