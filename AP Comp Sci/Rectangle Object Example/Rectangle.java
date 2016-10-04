
public class Rectangle{
	
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
