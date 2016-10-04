
public class MakeTwoRectangles {
    
    public static void main(String[] args){
		
		// create a Rectangle object
		Rectangle rect1 = new Rectangle();
		// set fields manually
		rect1.setWidth(5);
		rect1.setHeight(3);
		
		// create another Rectangle using 2 arg constructor to pass width and height
		Rectangle rect2 = new Rectangle(15,9);
		
		// output some info about the two rectangles
		System.out.println("Rect 1: " + rect1.getWidth() + "x" + rect1.getHeight());
		System.out.println("\tPerimeter: " + rect1.getPerimeter() );
		System.out.println("\tArea: " + rect1.getArea() );
		System.out.printf("\tDiagonal: %.2f\n", rect1.getDiagonal() );
		
		System.out.println("Rect 2: " + rect2.getWidth() + "x" + rect2.getHeight());
		System.out.println("\tPerimeter: " + rect2.getPerimeter() );
		System.out.println("\tArea: " + rect2.getArea() );
		System.out.printf("\tDiagonal: %.2f\n", rect2.getDiagonal() );
		
    }
	
	
}