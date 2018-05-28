package com.silvio.pocmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.silvio.pocmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
