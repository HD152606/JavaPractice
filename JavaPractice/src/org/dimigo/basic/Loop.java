/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

/**
 * <pre>
 * org.dimigo.basic
 *     |_Loop
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 14.
 * </pre>
 * @author      : Kimminhyeong
 * @version     : 1.0
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String arr[]={"마법사", "영주", "기사", "농민"};
		int attack = 100;
		int menu;
		Scanner scanner = new Scanner(System.in);
		do{
			System.out.println("--------------------");
			System.out.println("<< 게임 메뉴 >>");
			System.out.println("1. 공격력 증가 ");
			System.out.println("2. 공격력 감소 ");
			System.out.println("3. 캐릭터 설정 ");
			System.out.println("9. 종료 ");		
			System.out.println("--------------------");
			System.out.print("메뉴 입력 => ");
			menu=scanner.nextInt();
			int random = new Random().nextInt(4);
			switch(menu){
			case 1:
				attack=attack+10;
				System.out.println("공격력이 증가되었습니다. 현재 공격력 : "+attack);
				break;
			case 2:
				attack=attack-10;
				System.out.println("공격력이 증가되었습니다. 현재 공격력 : "+attack);
				break;
			case 3:
				System.out.println(arr[random]+"(으)로 설정되었습니다.");
				break;
			case 9:
				System.out.println("이제 공부하세요!");
				break;
			default:
				System.out.println("없는 메뉴입니다!!");
			}
			
		}while(menu!=9);

	}

}

