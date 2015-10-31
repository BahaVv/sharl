package sharl;

public class Rect {
	protected Vector origin;
	protected Vector size;
	
	public Rect(Vector o, Vector s) {
		origin = o;
		size = s;
	}
	
	public static Rect fromOpposite(Vector or, Vector op) {
		return new Rect(or, op.sub(or));
	}
	
	public Rect(double x, double y, double w, double h) {
		origin = new Vector(x, y);
		size = new Vector(w, h);
	}
	
	public Rect() {
		origin = new Vector();
		size = new Vector();
	}
	
	public boolean isZero() {
		return size.isZero();
	}
	
	public Vector Origin() {
		return origin;
	}
	
	public Vector Size() {
		return size;
	}
	
	public Vector Opposite() {
		return origin.add(size);
	}
	
	public void setOrigin(Vector o) {
		origin = o;
	}
	
	public void setOpposite(Vector o) {
		origin = o.sub(size);
	}
	
	public void setSize(Vector s) {
		size = s;
	}
	
	public double area() {
		return size.X() * size.Y();
	}
	
	public Rect normalize() {
		Vector news = size, newo = origin;
		if(size.X() < 0) {
			news = news.mul(new Vector(-1, 1));
			newo = newo.setX(newo.sub(news).X());
		}
		if(size.Y() < 0) {
			news = news.mul(new Vector(1, -1));
			newo = newo.setY(newo.sub(news).Y());
		}
		return new Rect(newo, news);
	}
	
	public Rect norm_zero() {
		Vector news = size;
		if(news.X() < 0) {
			news = news.setX(0);
		}
		if(news.Y() < 0) {
			news = news.setY(0);
		}
		return new Rect(origin, news);
	}
	
	public Rect union(Rect other) {
		Vector mins = Origin().min(other.Origin());
		Vector maxs = Opposite().max(other.Opposite());
		return Rect.fromOpposite(mins, maxs).norm_zero();
	}
	
	public Rect intersect(Rect other) {
		Vector mins = Origin().max(other.Origin());
		Vector maxs = Opposite().min(other.Opposite());
		return Rect.fromOpposite(mins, maxs).norm_zero();
	}
	
}
