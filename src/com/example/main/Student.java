package com.example.main;

import java.util.Objects;

public record Student(String name, String address, int postcode) {
	
	public Student{
		Objects.requireNonNull(name);
		Objects.requireNonNull(address);
		Objects.requireNonNull(postcode);
	}
}
