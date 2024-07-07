package com.te.addressapp.addressconfig;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AddressConfiguration {


    @Value("${aws.dynamodb.endpoint}")
    private String dynamoEndpoint;
    @Value("${aws.dynamodb.accesskey}")
    private String awsAccessKey;
    @Value("${aws.dynamodb.secretkey}")
    private String awsSecretKey;
    @Bean
    public ModelMapper modelMapper(){

        return new ModelMapper();
    }

    @Bean
    public DynamoDBMapper dynamoDBMapper(){

        return new DynamoDBMapper(amazonDynamoDb());
    }

    private AmazonDynamoDB amazonDynamoDb() {

        return AmazonDynamoDBAsyncClientBuilder.standard()
                .withEndpointConfiguration(
                       new AwsClientBuilder.EndpointConfiguration(dynamoEndpoint,"ap-southeast-2"))
                .withCredentials(amazonDynamoDpCredential()).build();
    }

    private AWSCredentialsProvider amazonDynamoDpCredential() {

        return new AWSStaticCredentialsProvider(
                new BasicAWSCredentials(awsAccessKey,awsSecretKey)
        );
    }

}
