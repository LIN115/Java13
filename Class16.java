package Java13;

import java.io.*;
import java.math.*;

class ArgumentOutOfBound extends Exception {
}

public class Class16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader buf;
		String str;
		int num;
		try {
			buf = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("請輸入大於0的整數:");
			str = buf.readLine();
			num = Integer.parseInt(str);
			mySqrt(num);
		} catch (IOException e) {
		}
	}

	private static void mySqrt(int n) {
		// TODO Auto-generated method stub
		try {
			if (n < 0)
				throw new ArgumentOutOfBound();
			else {
				System.out.println("sqrt(" + n + ")=" + Math.sqrt(n));
			}
		} catch (ArgumentOutOfBound e) {
			System.out.println(n + "小於0");
		}
	}

}
