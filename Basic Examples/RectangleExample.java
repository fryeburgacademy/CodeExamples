
public class RectangleExample {
    
    public static void main(String[] args){
		
		// create a Rectangle object
		Rectangle rect1 = new Rectangle();
		rect1.setWidth(5);
		rect1.setHeight(3);
		
		Rectangle rect2 = new Rectangle(15,9);
		
		
		System.out.println("Rect 1: " + rect1.getWidth() + "x" + rect1.getHeight());
		System.out.println("\tPerimeter: " + rect1.getPerimeter() );
		System.out.println("\tArea: " + rect1.getArea() );
		System.out.printf("\tDiagonal: %.2f\n", rect1.getDiagonal() );
		
		System.out.println("Rect 2: " + rect2.getWidth() + "x" + rect2.getHeight());
		System.out.println("\tPerimeter: " + rect2.getPerimeter() );
		System.out.println("\tArea: " + rect2.getArea() );
		System.out.printf("\tDiagonal: %.2f\n", rect2.getDiagonal() );
		
    }
	
	// this class would normally be in another file (and not static)
	// so we could use it in any program
	public static class Rectangle{
		
		// we set fields to private visibility to protect our data.
		// we can use the variables via getters and setters
		private int width;
		private int height;
		
		// default no argument constructor
		public Rectangle(){
			// set default values of all fields
			width = 0;	
			height = 0; 
		}
		
		// alternate constructor with arguments
		// to set width and height when instantiating
		public Rectangle(int w, int h){
			width = w;
			height = h;
		}
		
		// custom methods for a rectangle
		public int getPerimeter(){
			return (height + width) * 2;
		}
		
		public int getArea(){
			return height * width;
		}
		
		public double getDiagonal(){
			return Math.sqrt(height*height + width*width);
		}
		
		
		// basic getters (accessors) and setters (mutators)
		public void setHeight(int h){
			height = h;
		}
		
		public int getHeight(){
			return height;
		}
		
		public void setWidth(int w){
			width = w;
		}
		
		public int getWidth(){
			return width;
		}
	}

}