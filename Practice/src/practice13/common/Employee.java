package practice13.common;

public class Employee extends Person{
	String depertmentNm;
	int depertmentCnt;

	public void setDepertmentNm(String depertmentNm) {
		this.depertmentNm = depertmentNm;
	}
	public String getDepertmentNm() {
		return depertmentNm;
	}

	public void setDepertmentCnt(int depertmentCnt) {
		this.depertmentCnt = depertmentCnt;
	}
	public int getDepertmentCnt() {
		return depertmentCnt;
	}

}
