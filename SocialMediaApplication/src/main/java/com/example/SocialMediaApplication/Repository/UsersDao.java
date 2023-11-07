package com.example.SocialMediaApplication.Repository;

import com.example.SocialMediaApplication.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersDao extends JpaRepository<Users,Integer> {

}
