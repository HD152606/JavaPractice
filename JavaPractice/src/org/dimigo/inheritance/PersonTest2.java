/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *    |_PersonTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 8.
 * </pre>
 *
 * @author    : Kimminhyeong
 * @version   : 1.0
 */
public class PersonTest2 {

	
	public static void main(String[] args) {
		Person[] p = {
			new Person("Tom"),
			new Korean("홍길동"),
			new Japanese("다나카"),
			new Chinese("왕밍")
		};
		for(Person i : p){
			PersonTest2.greeting(i);
			System.out.println();
		}
		

	}
	private static void greeting(Person p){
		System.out.println(p);
		p.sayHello();
		p.sayBye();
	}

}
