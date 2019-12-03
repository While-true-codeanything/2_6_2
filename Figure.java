
public abstract class Figure {
protected float x;
protected float y;
protected Figure(float x1, float y1){
	this.x=x1;
	this.y=y1;
}
abstract float getArea();
abstract float getPerimeter();
	
}
