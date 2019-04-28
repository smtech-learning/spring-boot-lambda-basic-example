package com.thecloudthoughts.lambda.config;

import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.util.StringUtils;

@Configuration
@EnableDynamoDBRepositories(basePackages = "com.thecloudthoughts.lambda.repo")
public class DynamoDBConfig {

    @Value("${amazon.dynamodb.endpoint}")
    private String dBEndpoint;

    @Value("${my-accesskey}")
    private String accessKey;

    @Value("${my-secretkey}")
    private String secretKey;

    @Bean
    public AmazonDynamoDB amazonDynamoDB() {
        AmazonDynamoDB dynamoDB = new AmazonDynamoDBClient(amazonAWSCredentials());

        if (!StringUtils.isNullOrEmpty(dBEndpoint)) {
            dynamoDB.setEndpoint(dBEndpoint);
        }

        return dynamoDB;
    }

    @Bean
    public AWSCredentials amazonAWSCredentials() {
        return new BasicAWSCredentials(accessKey, secretKey);
    }
}
