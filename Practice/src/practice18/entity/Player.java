package practice18.entity;

public class Player {
	String position;
	String name;
	String country;
	String team;

	public void getPosition(String position) {
		this.position = position;
	}
	public String setPosition() {
		return this.position;
	}

	public void getName(String name) {
		this.name = name;
	}
	public String setName() {
		return this.name;
	}

	public void getCountry(String country) {
		this.country =country;
	}
	public String setCountry() {
		return this.country;
	}

	public void getTeam(String team) {
		this.team = team;
	}
	public String setTeam() {
		return this.team;
	}

	public String toString() {
		return this.position + "," +  this.name + "," + this.country + "," + this.team;

		}



}
