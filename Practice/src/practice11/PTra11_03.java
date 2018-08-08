package practice11;
/*
 * PTra11_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra11_03 {


	/*
	 * ★ PTra11_03クラスに、クラスフィールドでint型のnumberを定義してください
	 */
	int number;

	/*
	 * ★ PTra11_03クラスのコンストラクタを引数なしで定義してください
	 */
	PTra11_03(){
	/* ★ 処理は、クラスフィールドnumberに1を加算してください
	 */

	number ++;
	}


	public static void main(String[] args) {
		PTra11_03 ptra11_03 = new PTra11_03();
		int x = 7;
		int y = 3;

		//staticがついていない時はインスタンス.（メソッド等）で呼び出す = インスタンスの生成が必須
		//ついていないときはクラス.（メソッド等）で呼び出す
		//static = クラス側にデータを保存　staticなし = インスタンス内にデータを保存
		ptra11_03.sum(x,y);


		// ★ sumメソッドを呼び出してください

	}

	public void sum(int x, int y) {
		System.out.println("sumメソッドを呼び出しました。" + x + "＋" + y + "＝" + (x + y));

		System.out.println("クラスフィールドnumber：" + number);
		/* + ★ クラスフィールドnumberの出力をしてください */
	}
}
