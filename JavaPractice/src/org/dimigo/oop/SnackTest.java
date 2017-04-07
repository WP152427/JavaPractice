/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ SnackTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 6.
 * </pre>
 *
 * @author      : 정유정
 * @version     : 1.0
 *
 */
public class SnackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Snack snack = new Snack("새우깡", "농심", 1100, 2);
		System.out.println(snack.toString() + "\n");
		Snack snack2 = new Snack("콘칲", "크라운", 1200, 1);
		System.out.println(snack2.toString() + "\n");
		Snack snack3 = new Snack("허니버터칩", "해태", 1500, 4);
		System.out.println(snack3.toString() + "\n");
		
		System.out.println("총 구매 금액 : " + String.format("%,d", snack.calcPrice() + snack2.calcPrice() + snack3.calcPrice()) + "원");
		
		
	}

}
