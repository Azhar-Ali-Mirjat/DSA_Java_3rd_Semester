package TASKS;

class Rectangle{
	
	private float length;
	private float width;
	
	Rectangle(){
		length = 1;
		width = 1;
	}
	public float Perimeter(){
		float p = 2*(length+width);
		return p;
	}
	public float Area(){
		float a = (length*width);
		return a;
	}
	public void setLength(float length){
		if(length>0.0&&length<20.0)
		this.length = length;

	}
	public float getLength(){
		return length;
	}
	public void setWidth(float width){
		if(width>0.0&&width<20.0)
		this.width = width;
	}
	public float getWidth(){
		return width;
	}
}

public class Lab2Task1{
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.setLength(12);
		r1.setWidth(10);
		
		System.out.println("Perimeter of Rectangle is : "+r1.Perimeter());
		
		System.out.println("Area of Rectangle is : "+r1.Area());

		
		
		
		
	}
}


