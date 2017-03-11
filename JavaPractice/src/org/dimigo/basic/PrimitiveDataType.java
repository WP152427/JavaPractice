/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   |_ PrimitiveDataType
 *
 * 1. 개요 : 아이유 프로필 출력하기
 * 2. 작성일 : 2017. 3. 9.
 * </pre>
 *
 * @author      : 정유정
 * @version     : 1.0
 *
 */
public class PrimitiveDataType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name = "아이유";
	    boolean ismale = false;
	    int age = 25;
	    double height = 161.8;
	    float weight = 44.3f;
	    char bloodType = 'A';
	    
	    System.out.println("<< 아이유 프로필 >>");
	    System.out.println("이름 : " +  name);
	    if (ismale) {
	       System.out.println("성별 : 남자");
	    }
	    else{
	       System.out.println("성별 : 여자");
	    }
	    System.out.printf("나이 : %d세\n", age);
	    System.out.printf("키 : %.1fcm\n",  height);
	    System.out.printf("몸무게 : %.1fkg\n", weight);
	    System.out.printf("혈액형 : %c형\n", bloodType);

	}

}
