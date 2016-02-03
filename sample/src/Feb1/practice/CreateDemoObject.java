package Feb1.practice;

public class CreateDemoObject {

	public static void main(String[] args) {

		Point originOne = new Point(25,50);
		
		Rectangle rectOne = new Rectangle(originOne, 40, 80);
		Rectangle rectTwo = new Rectangle(80, 160);
		
		//display width, height and area of rect one
		
		System.out.println("Height of Rectangle one is : " + rectOne.height);
		System.out.println("Width of Rectangle one is : " + rectOne.width);
		System.out.println("Area of Rectangle one is : " + rectOne.getArea());
		
		
		//Set the rectangle position...
		
		
		rectTwo.origin = originOne;
		System.out.println("Height of Rectangle one is : " + rectTwo.origin.x);
		System.out.println("Width of Rectangle one is : " + rectTwo.origin.y);
		System.out.println("Area of Rectangle one is : " + rectTwo.getArea());
		
		rectTwo.move(60, 120);
		System.out.println("Height of Rectangle one is : " + rectTwo.origin.x);
		System.out.println("Width of Rectangle one is : " + rectTwo.origin.y);


	}

}
