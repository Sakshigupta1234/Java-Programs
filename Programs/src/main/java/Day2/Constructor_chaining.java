package Day2;

public class Constructor_chaining {
	
	// Constructor Chaining:- calling one constructor inside another constructor of the same class.
	Constructor_chaining(){
		System.out.println("default constructor");
	}
	Constructor_chaining(String str){
		
		this();
		System.out.println(str);
	}
	Constructor_chaining(String str, int x){
		this(str);
		System.out.println(str + " "+ x);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor_chaining obj=new Constructor_chaining("xyz",12);
		//Output will be
		//default constructor
		//xyz
		//xyz 12
	}

}
