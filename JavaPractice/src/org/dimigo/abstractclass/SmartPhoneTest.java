/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 *    |_SmartPhoneTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 16.
 * </pre>
 *
 * @author    : Kimminhyeong
 * @version   : 1.0
 */
public class SmartPhoneTest {
	public static void main(String[] args) {
	
		SmartPhone[] sp ={ 
			new IPhone("iPhone 7","애플", 900000),
			new Galaxy("갤럭시 S8","삼성", 800000)
			
		};
		for(int i=0; i<2; i++){
			System.out.println(sp[i]);
			sp[i].turnOn();
			sp[i].pay();
			sp[i].useSpecialFunction();
			sp[i].turnOff();
		
		}
	}

}
