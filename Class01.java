package Java13;

public class Class01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12, den = 0;
		int ans = num / den;
		System.out.println("end of main() method!!");
	}
}
//(a) 編譯時不會有錯誤訊息出現。
//(b) 這個例外是指發生在算術上的錯誤,由於程式中將 den 設值為 0,又將 den 放在除數,而在數學上,0 是不能當除數,因此 Java 在執行時拋出這個例外。
//(c) 第 8 行不會被執行。因為 Java 在執行時拋出例外,並暫停程式的執行,因此第8行還來不及執行即被停止。