package test;

public class Test {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();

		s1.setGender("male");
		s1.setAddress("Street 2");
		s1.setIncome(2000.05);
		s1.setAge(20);

		s2.setGender("female");
		s2.setAddress("Flat 1");
		s2.setIncome(8000.90);
		s2.setAge(30);

		s3.setGender("male");
		s3.setAddress("Route 2");
		s3.setIncome(10000.05);
		s3.setAge(25);

		System.out.println("Student 1: Info:" + s1.getGender() + s1.setAddress() + s1.getIncome() + s1.getAge());
		System.out.println("Student 2: Info:" + s2.getGender() + s2.setAddress() + s2.getIncome() + s2.getAge());
		System.out.println("Student 3: Info:" + s3.getGender() + s3.setAddress() + s3.getIncome() + s3.getAge());
	}

	String gender;
	String address;
	double income;
	int age;

	public String getGender() {
		return gender;
	}

	public String getAddress() {
		return address;
	}

	public double getIncome() {
		return income;
	}

	public int getAge() {
		return age;
	}

	public void setGender(String gen) {
		gender = gen;
	}

	public void setAddress(String addr) {
		address = addr;
	}

	public void setIncome(double i) {
		income = i;
	}

	public void setAge(int a) {
		age = a;
	}
}
