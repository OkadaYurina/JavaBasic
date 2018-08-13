/*
 * PTra13_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Hero;
import practice13.common.Slime;

public class PTra13_04 {

	/*
	 * ★ PTra13_02, PTra13_03で作成した、Hero/Slimeクラスを使用します
	 */

	public static void main(String[] args) {

		// ★ HeroインスタンスとSlimeインスタンスを作成し、それぞれの名前に"勇者", "スライム"を設定してください
		Hero hero = new Hero();
		Slime slime = new Slime();
		hero.setName ("勇者");
		slime.setName("スライム");


		/*
		 * ★ HeroとSlimeを、どちらかが体力０になるまで戦わせます
		 *
		 * 	●Heroの攻撃 -> ダメージ判定 -> Slimeの攻撃 -> ダメージ判定
		 * 上記を繰り返し行います
		 */
		/*
		public boolean damage(int attack) {
			// ダメージ計算
			int calc = attack - this.endurance;
			if (calc <= 0) {
				// 必ず1ダメージは入るようにする
				calc = 1;
			}

			// ダメージ分体力を減らす
			this.hp -= calc;

			// 体力がなくなったかどうかの判定
			if (this.hp <= 0) {
				this.hp = 0;
				return true;
			}

			return false;
		};*/

boolean winOrLose = true;
while(true) {
	int heroattack = hero.attack();
	if(slime.damage(heroattack) ){
		System.out.println(hero.getName() + "は体力が０になった");
		break;
	}
	int slimeattack = slime.attack();
	if(hero.damage(slimeattack)) {
		System.out.println(slime.getName() + "は体力が０になった");
		winOrLose = false;
		break;
	}
}



		// ★ 勝利した方の出力を行ってください。「○○は■■との戦闘に勝利した」

	}
}
