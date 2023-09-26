//java program to demonstrate abstract classes
//AbstractionDemo.java
//12.09.23
//kavya
import java.io.*;
abstract class Animal {
	public abstract void animalSound();  //abstract method
	public void sleep() {
		System.out.println("zzzzzzz");  //concrete method
	}
}
class Cow extends Animal {
	public void animalSound() {
		System.out.println("The cow sounds-mao");
	}
}
class AbstractionDemo {
	public static void main(String args[]) {
		Cow c=new Cow();
		c.animalSound();
		c.sleep();  
	}
}
