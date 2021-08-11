import com.hsbc.Box;

public class Passingargs {

	public void m1(int x) {
         x += 10;
         System.out.println("In m1 : " + x);
	}

	public void m2(String s) {
        s += " world";
        System.out.println(s);
	}

	public void m3(int[] arr) {
        /*for(int e : arr)
        	e += 10;*/
		for(int i=0; i< arr.length;i++)
			arr[0] = 1000;
	}
	
	public void m4(Box b) {
       b.setHeight(300);
	}

	
	public static void main(String[] args) {
		Passingargs pa1 = new Passingargs();
		int a = 10;
		pa1.m1(a);
		System.out.println(a);
		
		String str = "Hello";
		pa1.m2(str);
		System.out.println(str);
		
		int arr[] = {1,2,3,4,5};
		pa1.m3(arr);
		for(int e : arr) System.out.println(e);
		
		Box b1 = new Box(1,2,3);
		pa1.m4(b1);
		System.out.println(b1);
		
	}
}
