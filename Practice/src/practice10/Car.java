package practice10;

public class Car {
	int serialNo;
	String color;
	int gasoline;


	int run() {

		if (gasoline == 0) {
			return -1;
		}

		gasoline -= 1;

		int advance =new java.util.Random().nextInt(16);
		//0～15の数をランダム生成

		return advance;
	}
}
