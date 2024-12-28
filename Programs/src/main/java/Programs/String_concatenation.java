package Programs;

public class String_concatenation {

	public static void main(String[] args) {
		
		
//String  = Sequence of characters
String s1= "Sakshi";


// Concatenation:- Joining two strings together
// 1 way :- Using +  operator
String s2="Gupta";
System.out.println(s1+s2);   //sakshigupta

//if you want to add more than 2 strings 
String s3 = "Saurabh";
System.out.println(s1+s2+s3);  //sakshiguptasaurabh


//2ndway using concat() method
System.out.println(s1.concat(s2)); //sakshigupta


//using concat() method we can't diectly add three strings
System.out.println(s1.concat(s2).concat(s3)); //sakshiguptasaurabh

 String s4 =s3+s2;
 String s5=s2.concat(s4);

	}

}
