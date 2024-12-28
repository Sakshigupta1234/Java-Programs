package Programs;

public class methods {

	public static void main(String[] args) {
		
//trim()  -  removing the spaces from both sides of the string
		
		String str= "   Sakshi Gupta   ";
		System.out.println(str.trim());
		System.out.println(str.trim().length());
//---------------------------------------------
	
		
		//charAt() -- returns an specified index in the string
		//it will return single character at the specified index
		//starting index will 0
		String str1="java Programming";
		System.out.println(str1.charAt(3));  //a
//----------------------------------------------------
		
		//contains()  -- it will return a boolean value
		//it is case sensitive method
		String s2= "Sakshi";
		String s3= "saurabh";
		String s4="Sak";   //part of s2 method
		System.out.println(s2.contains(s3));  //false
		System.out.println(s2.contains(s4));  //true
		
//-----------------------------------------------------
		//equals() -- compare strings return true/false
		System.out.println(s2.equals(s3));  //false
		String s5="sakshi";
		System.out.println(s4.equals(s5));   //false
//===========================================================
		//equalsIgnoreCase -- compare strings it will ignore case
		//return boolean value true/false
		System.out.println(s4.equalsIgnoreCase(s5));  //true
		
//----------------------------------------------------------------
		//contentEquals   --it will return boolean value  it is same as equals()\
		//either you can use equals() or contentEquals() method.
		
//======================================================================
		
		//replace()  --return single or multiple characters/strings it will replace in a string
		
		String st="JavaProgrammingPractice";
		System.out.println(st.replace('a', 'A'));
		
		String StrEx1= " Sakshi is QA of LHH Team";
		System.out.println(st.replace("LHH", "Adecco"));
		
//======================================================================
		//substring()  --retrive part of main string (it will take index zs it value)
		//substring(index1)  -- return index starting 1 to end of the string
		String example= "Swaroop";
		System.out.println(example.substring(0));  //waroop
		
		
		System.out.println(example.substring(0,2));  // it will not consider last position output will be Sw.

		
//==========================================================================
		
		//----------------toUpperCase()   method
		String e1="sonu";
		System.out.println(e1.toUpperCase());	  //SONU	
		
		
		//----------------toLowerCase()   method
				String e2="SOnu";
				System.out.println(e2.toLowerCase());	  //sonu	
				
//===========================================================================
				//====split() method- it will create multiple string based on delimiter
				String str8="Swaroop nadalla academy";
				String s[]=str8.split(" ");
				System.out.println(s[0]);
	}

}
