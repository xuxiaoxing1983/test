
public class Test {

	
	public static void main(String[] args){
		System.out.println(func("Gameloft"));
		
		System.out.println(a(5));
		
		int a[] = {1,2,3};
		System.out.println(sum(a,3));
	}
	
	private static String func(String s){
		return s.length()>0 ? func(s.substring(1))+s.charAt(0) : "";
	}

	
	private static int a(int b){
		int c = 1;
		int d = 2;
		b = c+=d+=b+++b;
		return d+=b;
	}
	
	private static int sum(int a[], int n){
		return n>0 ? a[n-1]+sum(a,n-1) : 0;
	}
}
