package practice14.common;

public class JavaCourse implements Course{
	String PREFIX = "【Eラーニング】Java";

	public String getCourseName() {
		return this.PREFIX;
	}


	public String[] getCourseUnit() {
		return new String[] {
				"式と演算"
				,"制御構文"
				,"メソッド"
				,"配列"
				,"オブジェクト指向"
				,"継承"
				,"高度な継承"
		};
	}



}
