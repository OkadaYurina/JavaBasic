package practice10;

public class a {
	
	int move = 0;
	int count = 0;
	while (distance - move > 0) {
		int ret = car.run();
		if (ret == -1) {
			break;
		}

		move += ret;
		count++;

		// 表示用
		int disp = (distance - move) < 0 ? 0 : distance - move;
		System.out.println((count) + "時間で" + ret + "km進みました。残り：" + disp + "km");
		System.out.println();
	}

	if (distance - move > 0) {
		System.out.println("目的地に到達できませんでした");
	} else {
		System.out.println("目的地にまで" + count + "時間かかりました。残りのガソリンは、" + car.gasolin + "リットルです");
	}
}
}

}
