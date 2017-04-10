/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ IdolGroup
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 10.
 * </pre>
 *
 * @author      : 정유정
 * @version     : 1.0
 *
 */
public class IdolGroup {
	
	public static void main(String[] args) {
		String[] groupName = {"엑소", "레드벨벳", "마마무"};
		String[][] memberName = {
				{"시우민", "레이", "수호", "백현", "첸", "찬열", "디오", "카이", "세훈"},
				{"아이린", "슬기", "웬디", "조이", "예리"},
				{"솔라", "문별", "휘인", "화사"},
		};
		for(int i = 0; i < groupName.length; i++) {
			System.out.println("<< " + groupName[i] + " >>");
			for(int j = 0; j < memberName[i].length; j++) {
				System.out.println(memberName[i][j]);
			}
			System.out.println();
		}
	}
	
}
