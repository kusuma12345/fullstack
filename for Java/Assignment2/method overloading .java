package assignment2;
public class JavaMethodOverloading {
	public static void area(float r)
	{
	   System.out.println("Area of a circle :"+(3.14f*r*r));
	}
	public static void area(int l,int b)
	{
	   System.out.println("Area of a rectangle :"+(l*b));
	}
	public static void area(int r)
	{
	   System.out.println("Area of a square :"+(r*r));
	}
	
	public static void main(String[] args) {
		JavaMethodOverloading.area(10);
		JavaMethodOverloading.area(10,20);	
		JavaMethodOverloading.area(10.0f);	
	}

}



/*****************OUTPUT OF THE PROGRAM***********************/
/*****************    Area of a square :100         **********/
/*****************    Area of a rectangle :200         *******/
/*****************    Area of a circle :314.0         ********/
/*************************************************************/