package sharl;

public class Vector {
	
	protected double x;
	protected double y;
	
	public Vector(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Vector(double v) {
		x = v;
		y = v;
	}
	
	public Vector() {
		x = 0.0;
		y = 0.0;
	}
	
	public double X() {
		return x;
	}
	
	public double Y() {
		return y;
	}
	
	public int iX() {
		return (int) x;
	}
	
	public int iY() {
		return (int) y;
	}
	
	public Vector setX(double x) {
		return new Vector(x, y);
	}
	
	public Vector setY(double y) {
		return new Vector(x, y);
	}
	
	public Vector add(Vector other) {
		return new Vector(x + other.x, y + other.y);
	}
	
	public Vector sub(Vector other) {
		return new Vector(x - other.x, y - other.y);
	}
	
	public Vector mul(Vector other) {
		return new Vector(x * other.x, y * other.y);
	}
	
	public Vector div(Vector other) {
		return new Vector(x / other.x, y / other.y);
	}
	
	public Vector add(double other) {
		return new Vector(x + other, y + other);
	}
	
	public Vector sub(double other) {
		return new Vector(x - other, y - other);
	}
	
	public Vector mul(double other) {
		return new Vector(x * other, y * other);
	}
	
	public Vector div(double other) {
		return new Vector(x / other, y / other);
	}
	
	public Vector max(Vector other) {
		return new Vector(Math.max(x, other.x), Math.max(y, other.y));
	}
	
	public Vector min(Vector other) {
		return new Vector(Math.min(x, other.x), Math.min(y, other.y));
	}
	
	public double dot(Vector other) {
		return x * other.x + y * other.y;
	}
	
	public double norm() {
		return Math.sqrt(dot(this));
	}
	
	public Vector unit() {
		if(isZero())
			return new Vector();
		return div(norm());
	}
	
	public boolean isZero() {
		return x == 0.0 && y == 0.0;
	}
	
	public boolean isUnit() {
		return dot(this) == 1.0;
	}
	
	public double angle(Vector other) {
		return Math.acos(dot(other) / (norm() * other.norm()));
	}
	
	public Vector projectionOn(Vector axis) {
		return axis.mul(dot(axis) / axis.dot(axis));
	}
	
	public Vector rejectionFrom(Vector axis) {
		return sub(projectionOn(axis));
	}
}
