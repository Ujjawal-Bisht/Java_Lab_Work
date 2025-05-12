package p1;
import java.util.* ;

public class Lab_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		float b = 2.3f;
		double c = 3.2;
		char d = 'A';
		String e = "Hello";
		
		int f[] = {1,2,3,4,5};
		System.out.println("Length of array f="+ f.length);
		
		int g[] = new int[5];
		System.out.println("Entering elements for array");
		for (int i=0 ; i<f.length ; i++) {
			System.out.print("Enter element-");
			g[i] = sc.nextInt();
		}
		
		System.out.print("Entered array is - ");
		for(int j=0 ; j<f.length ; j++) {
			System.out.print(g[j]+ " ");
		}
		
		String h = new String("UB");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		//System.out.println(f);
		//System.out.println(g);
		System.out.println(h);
		
		System.out.println("Length of string- " + h.length());
		
	}

}
