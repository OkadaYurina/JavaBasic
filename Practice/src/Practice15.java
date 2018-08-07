


public class Practice15 {
	public static void main(String[] args) {
		double bmi = getBmi(1.7,60);
		checkBmi(bmi);


}
	public static double getBmi(double height,int weight) {
		double result = weight / (height * height);
		return result;

	}
	public static void checkBmi(double bmi) {
		if(bmi < 18) {
			System.out.println("低体重");
		} else if(bmi >= 18 && bmi <25) {
			System.out.println("普通体重");
		} else if(bmi >= 25) {
			System.out.println("肥満");
		}

	}

}
