package practice.Practice18;

public class Employee {
	private String company;
	private String name;
	private int age;

	//getter
	//public 値を取り出すフィールドの型 getフィールド名() {
	    //return this.フィールド名;
	//}
	//setter
	//public void setフィールド名(フィールドの型 任意の変数名) {
	//    this.フィールド = 任意の変数;
	//}


    public void setCompany(String company) {
        this.company = company;

    }
	public String getCompany() {
	    return this.company;
	}
    public void setName(String name) {
        this.name = name;

    }
	public String getName() {
	    return this.name;
	}
    public void setAge(int age) {
        this.age = age;

    }
	public int getAge() {
	    return this.age;
	}
}


