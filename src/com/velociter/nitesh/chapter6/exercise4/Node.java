package com.velociter.nitesh.chapter6.exercise4;

public class Node {
	private String token;

	public Node(String token) {
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void print() {
		System.out.println(token);
	}
}
