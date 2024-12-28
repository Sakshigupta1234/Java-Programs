package Programs;

public class StringReverse_withoutinbuilt {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			// without using built in function
	String str="Swaroop Narala";
	System.out.println(str);
	String strRev="";
	for(int i=str.length()-1;i>=0;i--) {
		strRev=strRev+str.charAt(i);

		
	}
	System.out.println(strRev);

		}

}
