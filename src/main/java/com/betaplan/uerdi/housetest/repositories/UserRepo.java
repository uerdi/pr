package com.betaplan.uerdi.housetest.repositories;

import com.betaplan.uerdi.housetest.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepo extends CrudRepository<User, Long> {
    Optional<User> findByEmail(String email);
}

