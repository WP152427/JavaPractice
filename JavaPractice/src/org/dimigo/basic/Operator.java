/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   |_ Operator
 *
 * 1. 개요 : 디미베네 연간 인건비
 * 2. 작성일 : 2017. 3. 14.
 * </pre>
 *
 * @author      : 정유정
 * @version     : 1.0
 *
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long num=3;
	    long gub=1700000;
	    long store=1500;
	    long ingwon = gub*12*num*store;
	    
	    System.out.println("<< 디미베네 연간 인건비 >>");
	    System.out.println("월 평균 급여 : " + String.format("%,d", gub)  + "원");
	    System.out.println("점포 내 직원 수 : " + num + "명");
	    System.out.println("점포 수 : " + String.format("%,d", store) + "개\n");
	    System.out.println("연간 인건비 : " + String.format("%,d", ingwon) + "원");

	}

}
