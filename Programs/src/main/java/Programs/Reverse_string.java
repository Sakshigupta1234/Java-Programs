package Programs;

public class Reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //String is immutable class, constant in nature we can't change the value directly
		
	//Using StringBuffer & StringBuilder class , directly we can use reverse() method.
		StringBuilder strb=new StringBuilder("Swaroop Naralla");
		System.out.println(strb);
		
		System.out.println(strb.reverse());
		
		
		
		//StringBuffer and StringBuilder both are mutable class
		StringBuilder strb1=new StringBuilder("Swaroop Naralla");
		System.out.println(strb1);
		System.out.println(strb1.reverse());
		
		
		
	}

}
