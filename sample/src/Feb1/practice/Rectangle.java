package Feb1.practice;

public class Rectangle {
	
	public int height = 0;
	public int width = 0;
	public Point origin;
	
	//four constructors
	
	public Rectangle() {
		
		origin = new Point(0,0);
	}
	
	public Rectangle(Point p) {
		
		origin = p;
	}
	
	public Rectangle(int h, int w) {
		
		origin = new Point(0,0);
		height = h;
		width = w;
	}
	
	public Rectangle(Point p, int h, int w) {
		
		origin = p;
		height = h;
		width = w;
	}
	
	//a method for moving the rectangle..
	
	public void move(int x, int y) {
		
		origin.x = x;
		origin.y = y;
		
	}
	//a method for computing the area of rectangle..
	
	public int getArea() {
		
		return width * height;
	}
	
	

}
