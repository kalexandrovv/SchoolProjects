package temi12do14;

public class RegularPolygon {
	private int n = 3;
	private double sideLength = 1;
	private double x = 0;
	private double y = 0;
	RegularPolygon() {
		//default values
	}
	RegularPolygon(int num, double dylj){
//		this.n = num;
//		this.sideLength = dylj;
		setN(num);
		setDyljinaStrana(dylj);
	}
	RegularPolygon(int num, double dylj, double localParameterZaX, double localParameterZaY) {
//		this.n = num;
//		this.sideLength = dylj;
//		this.y = localParameterZaY;
//		this.x = localParameterZaX;
		setN(num);
		setDyljinaStrana(dylj);
		setX(localParameterZaX);
		setY(localParameterZaY);
	}
	public void setBrojStrani(int newBrojStrani) {
		this.n = newBrojStrani;
	}
	public void setDyljinaStrana(double newDyljinaStrana) {
		this.sideLength = newDyljinaStrana;
	}
	public void setX(double localParameter) {
		this.x = localParameter;
	}
	public void setY(double localParameter) {
		this.y = localParameter;
	}
	public int getN() {
		return this.n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public double getSideLength() {
		return this.sideLength;
	}
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
	public double getPerimeter() {
		return n*sideLength;
	}
	public double getArea() {
		double a = Math.toRadians(180/n);
		return (n*sideLength*sideLength)/(4*Math.tan(a));
	}
}
