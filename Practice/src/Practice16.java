
public class Practice16 {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		System.out.println("年齢を入力して下さい");
		String line = scanner.nextLine();
		int age = Integer.parseInt(line);

		boolean result = practice.logics.PracticeLogic16.checkChild(age);

		if(result) {System.out.println("子供");

		} else {
			System.out.println("大人");
		}



	}

}
