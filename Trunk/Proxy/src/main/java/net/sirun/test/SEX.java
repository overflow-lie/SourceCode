package net.sirun.test;

public enum SEX {

	MALE("male"),FEMALE("female");
	
	private SEX(String sex){
		this.sex = sex;
	}
	
	private String sex;

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String toString(){
		return "asd";
	}
}
