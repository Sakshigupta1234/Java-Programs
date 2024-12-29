package Day2;

public class Variable_type {

	
	int x, y;  //instance variable
	
	// there are 2 types of variables in java
	
	// 1. Instance Variable - related to object memory (once object is created it will allocate some memory where these variables will get stored)
			
	// Local variables - related to methods
	
	
	//Parameterized constructor
	Variable_type(int a, int b) {
		x=a;   //a and b are local variable
		y=b;	
	}
	void display() {
		System.out.println(x);
		System.out.println(y);
	}
			
	public static void main(String[] args) {
		Variable_type obj=new Variable_type(10,20);
		obj.display();
		
		
	}

}
