/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player> list = new ArrayList<Player>();

        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] array = line.split(",");
                Player player = new Player();
                player.setPosition(array[0]);
                player.setName(array[1]);
                player.setCountry(array[2]);
                player.setTeam(array[3]);
                list.add(player);

                }

        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }


		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
            int gk = 0;
            int df = 0;
            int mf = 0;
            int fw = 0;
            for(Player player : list) {

			switch(player.getPosition()) {
			case "GK":
				if(gk < 1) {
					System.out.println(player);

					gk++;
				}
				break;

			case "DF":
				if(df < 4) {
					System.out.println(player);

					df++;
				}
				break;
			case "MF":
				if(mf < 4) {
					System.out.println(player);

					mf++;
				}
				break;
			case "FW":
				if(fw < 2) {
					System.out.println(player);

					fw++;
				}
				break;
			}


		}

	}
}
