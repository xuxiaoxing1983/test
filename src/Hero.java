
public class Hero extends Actor {

	int hp = 1;
	
	public Hero(int i){
		hp = i;
		System.out.println("Hero.Hero(),hp="+hp);
	}
	
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Hero.draw(),hp="+hp);
	}

}
