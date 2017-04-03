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
		String[] questions = {"1. 가장 좋아하는 가수는?", "2. 가장 좋아하는 배우는?", "3. 가장 좋아하는 과목은?"};
		String[] answers = {"트와이스","원빈", "응용 프로그래밍"};
		
		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<3; i++){
			System.out.println(questions[i]);
			String answer = scanner.nextLine();
			System.out.println((answer.equals(answers[i]))?"정답입니다!":"틀렸습니다!");
		
			sb.append(questions[i]+" ").append(answers[i]).append(" 입니다.").append("\n");

		}
		
		System.out.println("<<결과 출력>>");
		System.out.println(sb.toString());
		
	}

}
