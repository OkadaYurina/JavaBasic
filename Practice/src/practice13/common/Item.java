package practice13.common;

public class Item {
	String name;
	int additionalDamage;

	public Item(String name, int additionalDamage) {
		this.name = name;
		this.additionalDamage = additionalDamage;
	}


    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
    	return this.name;
    }

    public void setAdditionalDamage(int additionalDamage) {
    	this.additionalDamage = additionalDamage;
    }
    public int additionalDamage() {
    	return this.additionalDamage;
    }




}
