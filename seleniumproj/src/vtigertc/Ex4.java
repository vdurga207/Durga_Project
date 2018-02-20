package vtigertc;

import pack1.Inter2;


 class Ex4 extends  Inter2{
	
	 public void show(){
		// new Ex4().mn();//this is not working throws compilation error that display() from the type Base is not visible
		// new Derived().display();//is working
		 //display();//is working
		 }
	public static void main(String[] args) {
		
		new Ex4().mn();;
		
	}

}
