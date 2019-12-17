package paul.projects.firstjavaangularprogram.repositories;

import paul.projects.firstjavaangularprogram.entities.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {}
