package _01_sea_creature;

public class SeaCreatureRunner {
	public static void main(String[] args) {
		SeaCreature Spongebob = new SeaCreature("Spongebob");
		SeaCreature Patrick = new SeaCreature("Patrick");
		SeaCreature Squidward = new SeaCreature("Squidward");
		
		System.out.println(Spongebob.getName());
		Spongebob.showButton();
		
		System.out.println(Patrick.getName());
		Patrick.showButton();
		
		System.out.println(Squidward.getName());
		Squidward.showButton();



	}
}
