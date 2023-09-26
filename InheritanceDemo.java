//java program to demonstrate Inheritance
//InheritanceDemo.java
//12.09.23
//kavya
class Animal {
	String name;
	public void eat() {
		System.out.println("I can eat");
	}
}
class JerryMouse extends Animal {
	public void display() {
		System.out.println("My name is "+name);
	}
}
class InheritanceDemo {
	public static void main(String args[]) {
		JerryMouse jm=new JerryMouse();
		jm.name="Jerry-The Mouse";
		jm.display();
		jm.eat();  //with the help of child class object we are accessing parent class
	}
}
