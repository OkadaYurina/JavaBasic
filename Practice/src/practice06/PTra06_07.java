package practice06;
/*
 * PTra06_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_07 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 * ■■■■■
		 * ■■■■□
		 * ■■■□□
		 * ■■□□□
		 * ■□□□□
		 */
		for(int i = 0; i < 5; i++ ) {
			for(int j = 0; j < i; j++) {
				System.out.print("■");
			}
			for(int k = i; k < 5; k++) {
				System.out.print("□");
			}
		System.out.println();
		}

		for(int l = 0; l < 5; l++ ) {
			for(int m = l ; m < 5 ; m++ ) {
				System.out.print("■");
			}
			for(int n = 0; n < l; n++ ) {
				System.out.print("□");
			}
		System.out.println();
		}

	}
}
