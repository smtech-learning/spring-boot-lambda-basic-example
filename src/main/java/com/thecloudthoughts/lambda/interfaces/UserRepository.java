package com.thecloudthoughts.lambda.interfaces;

import java.util.List;

import java.util.UUID;

import com.thecloudthoughts.lambda.entity.User;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan()
public interface UserRepository extends CrudRepository<User, UUID> {

}