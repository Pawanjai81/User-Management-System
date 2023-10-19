package com.geekster.AssignmentUserManagement.Service;

import com.geekster.AssignmentUserManagement.Modal.User;
import com.geekster.AssignmentUserManagement.Repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    @Autowired
    IUserRepo userRepo;


    public String addUser(User newUser) {
        userRepo.save(newUser);
        return "user is added";

    }


    public List<User> getUsers() {
        return (List<User>) userRepo.findAll();
    }


    public String addUsers(List<User> newUsers) {
        userRepo.saveAll(newUsers);
        return newUsers.size()+" "+"Users were added";
    }


    public User getUserById(Integer id) {
        return userRepo.findById(id).get();
    }



    public String removeUser(List<Integer> ids) {
        userRepo.deleteAllById(ids);
        return ids.size()+" "+"Users were removed";
    }
}
