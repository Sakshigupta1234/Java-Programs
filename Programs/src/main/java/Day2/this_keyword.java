package Day2;

public class this_keyword {

	
	int x,y;  //instance variable
	
	
	this_keyword(int x, int y){
		x=x;
		y=y;
	}
	void display() {
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
this_keyword obj=new this_keyword(10,20);
obj.display();  //0 0
//it will print 0 ad 0 because in this case, both local and instance variable name are same so, compiler will not update the value of instance variable
// x and y in LHS and RHS are local variable . So, avoid this problem we are using he this keyword


	}

}
