/*
 * PTra16_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice16;

public class PTra16_02 {
	public static void main(String[] args) {

		boolean b = true;
		Boolean b2 = Boolean.valueOf(b);

		byte by = 100;
		Byte by2 = Byte.valueOf(by);

		short s = 300;
		Short s2 = Short.valueOf(s);

		char c = '日';
		Character c2 = Character.valueOf(c);

		int i = 1000;
		Integer i2 = Integer.valueOf(i);

		long l = 2000L;
		Long l2 = Long.valueOf(l);

		float f = 3.14F;
		Float f2 = Float.valueOf(f);

		double d = 453.592;
		Double d2 = Double.valueOf(d);

		//Double d2 = d;

		System.out.println(b2);
		System.out.println(by2);
		System.out.println(s2);
		System.out.println(c2);
		System.out.println(i2);
		System.out.println(l2);
		System.out.println(f2);
		System.out.println(d2);


		// ★ 上記基本型を、それぞれのラッパークラスに代入してください
	}
}
