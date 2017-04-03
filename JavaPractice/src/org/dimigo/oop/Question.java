/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *     |_Question
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 28.
 * </pre>
 * @author      : Kimminhyeong
 * @version     : 1.0
 */
public class Question {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1.");
		StringBuilder sb = new StringBuilder("가장 좋아하는 가수는? ");
		System.out.println(sb);
		String answer = scanner.nextLine();
		System.out.println((answer.equals("빅뱅"))?"정답입니다!":"틀렸습니다!");
		sb.append("빅뱅");
		
		System.out.print("1.");
		StringBuilder sb2 = new StringBuilder("가장 좋아하는 배우는? ");
		System.out.println(sb2);
		String answer2 = scanner.nextLine();
		System.out.println((answer2.equals("원빈"))?"정답입니다!":"틀렸습니다!");
		sb2.append("원빈");
		
		System.out.print("1.");
		StringBuilder sb3 = new StringBuilder("가장 좋아하는 과목은? ");
		System.out.println(sb3);
		String answer3 = scanner.nextLine();
		System.out.println((answer3.equals("응용 프로그래밍"))?"정답입니다!":"틀렸습니다!");
		sb3.append("응용 프로그래밍");
		
		System.out.println("<<결과 출력>>");
		System.out.println(sb.toString()+"입니다.");
		System.out.println(sb2.toString()+"입니다.");
		System.out.println(sb3.toString()+"입니다.");
		
	}

}
