package com.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pet.ApiClient;
import com.pet.handler.PetApi;
import com.pet.handler.StoreApi;
import com.pet.handler.UserApi;

@Configuration
public class ExampleConfig {

	// @Value("${pet.profiles.host.uri}")
	// private String hostBasePath = "http://localhost:9090";

	@Bean
	public ApiClient apiClient() {
		return new ApiClient();
	}

	@Bean
	public PetApi petsApi() {
		return new PetApi(apiClient());
	}
	
	@Bean
	public StoreApi storeApi() {
		return new StoreApi(apiClient());
	}
	
	
	@Bean
	public UserApi userApi() {
		return new UserApi(apiClient());
	}

}
