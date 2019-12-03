
public class Circle extends Figure implements Moveable {
	private float radius;
	public  Circle(float x1, float y1, float radius1) {
		super(x1, y1);
		this.radius=radius1;
	}
	@Override
	public float getArea() {
		return (float) (Math.PI*this.radius*this.radius);
	}
	@Override
	public float getPerimeter() {
		return (float) (Math.PI*this.radius*2);
	}
	@Override
	public void move(float dx, float dy) {
		this.x+=dx;
		this.y+=dy;
		
	}

	@Override
	public void resize(float koeff) {
		this.radius*=koeff;
	}
	public String  toString() {
		String h="Circle"+"\nCenter: ("+this.x+", "+this.y+")\n"+"Radius: "+this.radius;
		return h;
	}

}
