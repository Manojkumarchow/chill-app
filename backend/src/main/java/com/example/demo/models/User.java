package com.example.demo.models;

public class User {

	private Long id;
	private String name;
	private String hierarchyLevel;

	public User(Long id, String name, String hierarchyLevel) {
		this.id = id;
		this.name = name;
		this.hierarchyLevel = hierarchyLevel;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHierarchyLevel() {
		return hierarchyLevel;
	}

	public void setHierarchyLevel(String hierarchyLevel) {
		this.hierarchyLevel = hierarchyLevel;
	}

}
