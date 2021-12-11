package main.mealplanner.repository;

import main.mealplanner.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {

    List <User> findAll() ;

}
