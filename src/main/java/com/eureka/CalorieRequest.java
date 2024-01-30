package com.eureka;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class CalorieRequest {
@Id
	private int age;
	private String gender;
	private double height;
	private double weight;
	private int activityLevel;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getActivityLevel() {
		return activityLevel;
	}
	public void setActivityLevel(int activityLevel) {
		this.activityLevel = activityLevel;
	}
	@Override
	public String toString() {
		return "CalorieRequest [age=" + age + ", gender=" + gender + ", height=" + height + ", weight=" + weight
				+ ", activityLevel=" + activityLevel + ", getAge()=" + getAge() + ", getGender()=" + getGender()
				+ ", getHeight()=" + getHeight() + ", getWeight()=" + getWeight() + ", getActivityLevel()="
				+ getActivityLevel() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public CalorieRequest(int age, String gender, double height, double weight, int activityLevel) {
		super();
		this.age = age;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.activityLevel = activityLevel;
	}
}