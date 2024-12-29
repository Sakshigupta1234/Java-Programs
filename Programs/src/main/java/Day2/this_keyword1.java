package Day2;

public class this_keyword1 {

int x,y;  //instance variable
	
	//This keyword is used to invoke current class object it is a predefined keyword in java.
	//it can be used to invoke current class method/refer to current class instance variable.
	this_keyword1(int x, int y){
		this.x=x;
		this.y=y;
	}
	void display() {
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
this_keyword1 obj=new this_keyword1(10,20);
obj.display();  //10,20
}
}
