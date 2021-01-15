
import java.util.Scanner;
import java.io.*;
import java.util.*;

public class uppgift_3 {

	int n = 1;
	int A;
	int B;

	public void run() {
		
		Scanner scan = new Scanner(System.in);
		String result = "";
		int num = scan.nextInt();
		if(num>100 || num<1)
			return;
		while (num > 0) {
			A = scan.nextInt();
			B = scan.nextInt();
			if(A> Math.pow(10, 8) || A<1) 
				return;
			if(B> Math.pow(10, 8)|| B<1)
				return;
			recursive(0,0,1);
			num--;
			result += n +"\n";
			n = 1;
		}
		System.out.println(result);
		scan.close();
	}
	
	public void recursive(int x,int y, int testcase) {
		int steget = (int) Math.pow(2, testcase - 1);
		// recursive moving x-axis
		if (x + steget <= A) {
			n++;
			recursive(x + steget, y, testcase + 1);
		}
		// recursive moving y-axis
		if (y + steget <= B) {
			n++;
			recursive(x, y + steget, testcase+ 1);
		}
		return;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		uppgift_3 a = new uppgift_3();
		a.run();
	}



}
