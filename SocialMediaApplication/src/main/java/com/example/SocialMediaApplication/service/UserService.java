package com.example.SocialMediaApplication.service;

import com.example.SocialMediaApplication.Repository.UsersDao;
import com.example.SocialMediaApplication.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UsersDao userdao;
    public List<Users> finAllUsers(){
        return  userdao.findAll();
    }
    public Users findUserById(int id)
    {
        return userdao.findById(id).get();
    }

    public Users save(Users user)
    {
        return userdao.save(user);
    }
    public Users updateUser(Users user,int id)
    {
         Users olduser =userdao.findById(id).get();

        olduser.setName(user.getName());
        olduser.setBirthday(user.getBirthday());
        return userdao.save(olduser);

        //return null;

    }
     public boolean deleteUserById(int id)
     {
          userdao.deleteById(id);
          return true;
     }

}
