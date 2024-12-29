package Day2;

public class this_keyword3 {

	int x,y;//instance variable

	void setData(int x, int y) {
		this.x=x;
		this.y=y;
		
	}
	void display() {
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
this_keyword3 obj=new this_keyword3();
obj.setData(10,100);
obj.display();  //0 0

	}
}
