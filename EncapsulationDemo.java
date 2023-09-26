//java program to demonstrate Encapsulation 
//EncapsulationDemo.java
//12.09.23
//kavya
class Student {
	public String sname;
	private String sphone;  //access restrictor
	public String getsphone() {
		return sphone;
	}
                public void setsphone(String ph) {
	this.sphone=ph;
                }
}
class EncapsulationDemo {
	public static void main(String args[]) {
		Student s=new Student();
		s.sname="Auxa";
		s.setsphone("9876543210");
		System.out.println("Student name is "+s.sname);
		System.out.println("Student ph.no is "+s.getsphone());
	}
}
