package by.htp.simple.bean;

public class Triangle {
	private double a;
	private double b;
	private double c;
	
	private double alpha;
	private double betta;
	private double gamma;
	
	public Triangle() {
		
	}

	public Triangle(double a, double b, double c, int alpha, int betta, int gamma) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.alpha = alpha;
		this.betta = betta;
		this.gamma = gamma;
	}
	
	public double Perimeter() {
		double per;
		
		per = this.a + this.b + this.c;
		
		return per;
	}
	
	
	
	
	public double Square() {
		double sq;
		double halfPer;
		
		halfPer = Perimeter() / 2;
		
		sq = Math.sqrt(halfPer * (halfPer - this.a) * (halfPer - this.b) * (halfPer - this.c));
		
		return sq;
	}
	
	
	
	

}
