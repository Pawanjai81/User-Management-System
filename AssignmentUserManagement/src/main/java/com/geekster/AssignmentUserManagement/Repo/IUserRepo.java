package com.geekster.AssignmentUserManagement.Repo;

import com.geekster.AssignmentUserManagement.Modal.User;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepo extends CrudRepository<User, Integer> {

}
