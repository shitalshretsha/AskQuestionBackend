package com.ask.questin.askquestion.Repository;

import com.ask.questin.askquestion.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {

    @Modifying
    @Query(value = "SELECT u FROM User u WHERE u.userName=?1 and u.password=?2 ")
    User findByUserNameAndPassword(String userName,String password);

}
