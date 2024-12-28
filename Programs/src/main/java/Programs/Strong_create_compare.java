package Programs;

public class Strong_create_compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		 //-----Example 1--------------		
		String str="Swaroop";
		String str1="Swaroop";
		System.out.println(str==str1); //True

		//-----Example 2--------------	
		String str2="Swaroop";
		String str3="Swaroop1";
		System.out.println(str2==str3); //False

		//------Example3-------------
		String str4="Sakshi";
		String str5= new String("Sakshi1");
		System.out.println(str4==str5);  //False


		System.out.println(str4.equals(str5));//False
		

	}

}
