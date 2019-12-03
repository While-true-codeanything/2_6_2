
public class Rectangle extends Figure implements Moveable {
	private float height;
	private float  width;
	public Rectangle(float x1, float y1, float height1, float width1) {
		super(x1, y1);
		this.height=height1;
		this.width=width1;
	}

	@Override
	public float getArea() {
		return (this.height * this.width);
	}

	@Override
	public float getPerimeter() {
		return (2*this.height+2*this.width);
	}

	@Override
	public void move(float dx, float dy) {
		this.x+=dx;
		this.y+=dy;
		
	}

	@Override
	public void resize(float koeff) {
		this.height*=koeff;
		this.width*=koeff;
	}
	public String  toString() {
		String h="Rectangle"+"\nCenter: ("+this.x+","+this.y+")\n"+"Height: "+this.height+"\nWidth: "+this.width;
		return h;
	}

}
