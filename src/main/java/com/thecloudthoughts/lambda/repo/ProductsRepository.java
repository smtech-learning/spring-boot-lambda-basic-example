package com.thecloudthoughts.lambda.repo;

import java.util.List;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import com.thecloudthoughts.lambda.model.Product;

@EnableScan
public interface ProductsRepository extends CrudRepository<Product, String> {

    List<Product> findByProductShortName(String productShortName);
}
