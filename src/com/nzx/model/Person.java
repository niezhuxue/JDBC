package com.nzx.model;

/**
 * 数据库对应实体对象
 * */
public class Person {

	private String id;//用户id
	private String userName;//用户名
	private String sex;//性别
	private int age;//年龄
	private String nation;//民族
	private String address;//家庭住址
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString(){
		return "Person:[id="+this.id+",userName="+this.userName+",sex="+this.sex
				+",age="+this.age+",nation="+this.nation+",address="+this.address+"]";
	}
}
