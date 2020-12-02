import java.io.*;
import java.util.*;

public class factorial {
	
	public static void main(String args[]) throws FileNotFoundException {
		File file = new File("Result.txt");
		FileOutputStream fos = new FileOutputStream(file);
		PrintStream ps = new PrintStream(fos);
		System.setOut(ps);
		
		Scanner sc = new Scanner(System.in);
		MyBigInteger test = new MyBigInteger();
		int A;
		A = sc.nextInt();
		for(int i = test.factorial(A).size()-1 ; i>=0 ; i--) {
			System.out.print(test.factorial(A).get(i));
		}
	}
	
}
