/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.basic
 *   |_ Loop
 *
 * 1. 개요 : 초간단 게임프로그램
 * 2. 작성일 : 2017. 3. 15.
 * </pre>
 *
 * @author : 정유정
 * @version : 1.0
 *
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] c = { "마법사", "영주", "기사", "농민" };
		int n = 100;
		int choice;

		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("--------------------");
			System.out.println("<< 게임 메뉴 >>");
			System.out.println("1. 공격력 증가");
			System.out.println("2. 공격력 감소");
			System.out.println("3. 캐릭터 설정");
			System.out.println("9. 종류");
			System.out.println("--------------------");
			System.out.println("메뉴 입력 => ");

			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				n += 10;
				System.out.println("공격력이 증가되었습니다. 현재공격력:" + n);
				break;
			case 2:
				n -= 10;
				System.out.println("공격력이 감소되었습니다. 현재공격력:" + n);
				break;
			case 3: {
				int num = new Random().nextInt(4);
				System.out.println("" + c[num] + "으로 설정 되었습니다.");
				break;
			}
			case 9:
				System.out.println("이제 공부하세요!");
				scanner.close();
				break;
			default:
				System.out.println("없는 메뉴입니다!!");
			}

		} while (choice != 9);

	}

}
