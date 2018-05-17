/*
 Inheritance in Java
 * Super Class: 
     The class whose features are inherited is known as super class(or a base class or a parent class).
  * Sub Class: 
     The class that inherits the other class is known as sub class(or a derived class, extended class, or child class).
     The subclass can add its own fields and methods in addition to the superclass fields and methods.
 */
package webDriver;

 class Doctor {
	void Doctor_Details(){
		System.out.println("Doctor details..");
	}
}
class Surgeon extends Doctor{
	void Surgeon_Details(){
		System.out.println("Surgeon details..");
	}
}





