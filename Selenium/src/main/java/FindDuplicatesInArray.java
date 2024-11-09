
public class FindDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] arr= {"C", "C++","Java","C","python"};
for(int i=0;i<arr.length;i++) {
	for(int j=i+1;j<arr.length;j++) {
		if(arr[i].equals(arr[j])) {
			System.out.println("Found duplicate elements:"+ arr[i]);
			
		}
	}
}
	}

}
