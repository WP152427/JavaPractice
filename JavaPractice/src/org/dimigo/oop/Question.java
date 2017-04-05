/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Question
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 31.
 * </pre>
 *
 * @author      : 정유정
 * @version     : 1.0
 *
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] questions = {"1. 가장 좋아하는 가수는?", "2. 가장 좋아하는 배우는?", "3. 가장 좋아하는 과목은?"};
		String[] answers = {"엑소", "공유", "응용 프로그래밍"};   
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			System.out.println(questions[i]);
			System.out.println((answers[i].equals(scanner.nextLine()))?"정답입니다":"틀렸습니다");
		}
		
		scanner.close();
		
		System.out.println("<< 결과 출력 >>");
		for(int i=0; i<3; i++) {
			StringBuilder str = new StringBuilder();
			System.out.println(str.append(questions[i]).append(' ').append(answers[i]) + "입니다.");
		}
		       
	}

}
