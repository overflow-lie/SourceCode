package net.sirun.test;

class Person extends A {
	public Person() {
	}

	public Person(String name) {
		this.name = name;
	}

	public Person(int age) {
		this.age = age;
	}

	public void print(String s){
		System.out.println(s);
	}
	public Person(A a) {
		b = a;
	}

	public Person(B b) {
		this.b = b;
	}

	public String getName() {
		return name;
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
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

	@Override
	public String toString() {
		return "[" + this.name + "  " + this.age + "]";
	}

	private String name;
	private int age;
	private B b;
	
	
	public Enum<SEX> getSex() {
		return sex;
	}

	public void setSex(Enum<SEX> sex) {
		this.sex = sex;
	}

	private Enum<SEX> sex;
}

class A extends B {
	private String s;

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public A(String s) {
		this.s = s;
	}
	public A(String s,String t) {
		this.s = s;
		super.t = t;
	}

	public A() {
	}
}

class B {
	protected String t;

	public String getT() {
		return t;
	}

	public void setT(String t) {
		this.t = t;
	}

	public B(String t) {
		this.t = t;
	}

	public B() {
	}

}