package com.rnd.aws.configuration;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AWSCredentialsConfiguration {

    @Value("${aws.es.accessKey:}")
    private String esAccessKey;

    @Value("${aws.es.secretKey:}")
    private String esSecretKey;

    @Bean
    public AWSStaticCredentialsProvider awsDynamoCredentialsProviderDevelopment() {
        return new AWSStaticCredentialsProvider(new BasicAWSCredentials(
                esAccessKey, esSecretKey));
    }
}