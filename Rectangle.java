public class Rectangle{
	private int length;
	private int width;
	
	public Rectangle(){
		length = 0;
		width = 0;
	}
	
	public int clacPerimeter(int length , int width){
		return 2 * (length + width);
	}
	
	public int calcArea(int length , int width){
		return (length*width);
	}
}


