package com.webservicemongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.webservicemongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User,String> {

}
