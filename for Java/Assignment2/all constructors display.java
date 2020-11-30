package assignment2;
class complexno{
	private int x,y;
//	Default constructor
	public complexno() {
		x=0;y=0;
	}
//	Parameterized constructor
	public complexno(int x ,int y) {
		this.x=x;this.y=y;
	}
//Copy constructor
	public complexno(complexno c) {
		x=c.x;y=c.y;
	}
	public void display() {
		System.out.println("x="+x+" y="+y);
	}
}
public class JavaAllConstructorsDisplay {
	
	public static void main(String[] args) {
		
		complexno c1 = new complexno();
		c1.display();
		complexno c2 = new complexno(10,20);
		c2.display();
		complexno c3 = new complexno(c2);
		c3.display();
	}

}

/*****************OUTPUT OF THE PROGRAM***********************/
/*****************     x=0 y=0           *********************/
/*****************     x=10 y=20         *********************/
/*****************     x=10 y=20         *********************/
/*************************************************************/

