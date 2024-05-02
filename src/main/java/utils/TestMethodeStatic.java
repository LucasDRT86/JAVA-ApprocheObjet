package utils;

public class TestMethodeStatic {

	public static void main(String[] args) {
		String chaine = "12";
		
		int num = Integer.parseInt(chaine);

		System.out.println(num);
		
		int a =55;
		int b =8;
		
		int res = Integer.compare(a, b);
		
		if (res == 0) {
			System.out.println(a + " et " + b + " sont égal");
		}else if(res < 0) {
			System.out.println(a + " < " + b);
		}else {
			System.out.println(a + " > " + b);
		}
	}

}
