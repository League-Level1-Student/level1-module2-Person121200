package _99_extra._05_minion;

public class Minion {
	private String name; 
	private int eyes; 
	private String color; 
	private String master;
	
	Minion(String name, int eyes, String color, String master) {
		this.name = name;
		this.eyes = eyes;
		this.color = color;
		this.master = master;
		
		
	}
	public String setName(String name) {
		return this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public int setEyes(int eyes) {
		return this.eyes = eyes;
	}
	public int getEyes() {
		return eyes;
	}
	
	public String setColor(String color) {
		return this.color = color;
	}
	public String getColor() {
		return color;
	}
	
	public String setMaster(String master) {
		return this.master = master;
	}
	public String getMaster() {
		return master;
	}
}
