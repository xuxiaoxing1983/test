
public abstract class Actor {

	abstract void draw();
	
	public Actor(){
		System.out.println("Actor() before draw()");
		draw();
		System.out.println("Actor() after draw()");
	}
}
