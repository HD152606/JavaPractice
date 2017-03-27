/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *     |_CarTest2
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 24.
 * </pre>
 * @author      : Kimminhyeong
 * @version     : 1.0
 */
public class CarTest2 {
	public static void main(String[] args) {
		
		System.out.println("<<자동차 목록>>");
		
		Car2 car2 = new Car2();
		
		System.out.println("제조사명 : "+car2.getCompany());
		System.out.println("모델명 : "+car2.getModel());
		System.out.println("색상 : "+car2.getColor());
		System.out.println("최대속도 : "+String.format("%,d",car2.getMaxSpeed())+"km");
		System.out.println("가격 : "+String.format("%,d",car2.getPrice())+"원");
		System.out.println("");
		
		car2 = new Car2("기아자동차", "K7", "흰색", 246, 40000000);
		
		System.out.println("제조사명 : "+car2.getCompany());
		System.out.println("모델명 : "+car2.getModel());
		System.out.println("색상 : "+car2.getColor());
		System.out.println("최대속도 : "+String.format("%,d",car2.getMaxSpeed())+"km");
		System.out.println("가격 : "+String.format("%,d",car2.getPrice())+"원");
		System.out.println("");
		
		car2 = new Car2("삼성자동차", "SM7", "회색", 200, 38000000);
		
		System.out.println("제조사명 : "+car2.getCompany());
		System.out.println("모델명 : "+car2.getModel());
		System.out.println("색상 : "+car2.getColor());
		System.out.println("최대속도 : "+String.format("%,d",car2.getMaxSpeed())+"km");
		System.out.println("가격 : "+String.format("%,d",car2.getPrice())+"원");
		System.out.println("");
	}

}
