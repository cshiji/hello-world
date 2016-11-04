package test;

public class ff {
	public static void main(String[] args) {
		int a=150;
		for (int i = 1; i <=150; i++) {
			if ((i%5==0||i%3==0)&&i%15!=0) {
				a--;
			}
		}
		System.out.println(a);
	}
}
