package com.elsoproject.model;


import javax.validation.constraints.Min;

public class User {
	 Integer id;
	 String name;
	 @Min(value = 18, message = "Age should not be less than 18")
	 int age;
	 String neptunKod;



	public boolean isNew() {
		return (this.id == null);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNeptunKod() {
		return neptunKod;
	}

	public void setNeptunKod(String neptunKod) {
		this.neptunKod = neptunKod;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", neptunKod=" + neptunKod + "]";
	}

}
