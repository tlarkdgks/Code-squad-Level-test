package LevelTest;

import java.util.Scanner;

public class LevelTest1 {
	public static void main(String[] args){
	StringBuffer sb = new StringBuffer();
	Scanner sc = new Scanner(System.in);
	System.out.print(" ");
	String str = sc.nextLine();
	sb.append(str);
	System.out.println(sb.reverse());
	System.out.print(str.length());
}
}