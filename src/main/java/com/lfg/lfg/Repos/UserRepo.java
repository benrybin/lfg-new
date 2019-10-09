package com.lfg.lfg.Repos;

import com.lfg.lfg.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {

    boolean existsByuserName(String username);
    boolean existsByemailAddress(String emailAddress);
    User findByuserName(String username);

}
