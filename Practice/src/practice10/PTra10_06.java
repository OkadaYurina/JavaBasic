package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		// 目的地までの距離
		final int distance = 300;

		Car[] car = new Car[3];

		Car car1 = new Car();
		car1.color = "Orange";
		car1.gasoline = 10;

		Car car2 = new Car();
		car2.color = "Pink";
		car2.gasoline = 80;

		Car car3 = new Car();
		car3.color = "Black";
		car3.gasoline = 500;

		int rest = distance;
		int count = 0;
		int restGasoline = car1.gasoline;

		//繰り返しの中に書くと初期化されてしまうので最初に書く

		while(car1.gasoline > 0) {
			count ++;
			restGasoline -= count;

			rest -= car1.run();
			if(rest < 0) {
				System.out.println("目的地に到達できませんでした");
				break;

			}
		}


		if(car1.gasoline == 0) {
			System.out.println("目的地にまで" + count + "時間かかりました。");
		} else if(rest == 0) {
			System.out.println("残りのガソリンは" + restGasoline + "リットルです");
		}



	}
}
