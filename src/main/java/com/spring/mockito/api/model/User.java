package com.spring.mockito.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.ToString;

@Document(collection = "users")
@ToString
public class User {

	@Id
	private int id;
	private String name;
	private int age;
	private String address;

	public User() {
	}

	public User(int id, String name, int age, String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}

}
