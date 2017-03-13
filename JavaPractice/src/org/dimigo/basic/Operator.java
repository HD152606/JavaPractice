/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *     |_Operator
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 13.
 * </pre>
 * @author      : Kimminhyeong
 * @version     : 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("<<디미벤 연간 인건비>>");
		int ave = 1700000;
		int people = 3;
		int store = 1500;
		
		System.out.println("월 평균 급여 : "+String.format("%,d", ave)+"원");
		System.out.println("점포 내 직원 수 : "+people+"명");
		System.out.println("점포 수 : "+String.format("%,d",store)+"개");
		System.out.println("연간 인건비 : "+String.format("%,d",(long)ave*12*people*store)+"원");
		

	}

}
