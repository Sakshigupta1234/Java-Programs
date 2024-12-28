package Programs;

public class mutablevsImutableObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Welcome";
String str1="to the java";
System.out.println(str1 + str); //to the javaWelcome
System.out.println(str1.concat(str));  //to the javaWelcome


//But 

String str4=str.concat("to the java");
System.out.println(str);   //Welcome
System.out.println(str4); //Welcometo the java

//But using string builder and string buffer we can change the string value
StringBuffer x=new StringBuffer("Sakshi");
x.append("gupta");
System.out.println(x);   //Sakshigupta





	}

}
