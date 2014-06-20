
public class Person {

	private int a;
	
	public int change(int m){
		return m;
	}
	
	public class Teacher extends Person{
		public int b;
		public void main(String[] args){
			Person p = new Person();
			Teacher t = new Teacher();
			int i;
			i = t.b;
		}
	}
}
