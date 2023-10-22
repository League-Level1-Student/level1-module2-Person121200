package _02_smurf;

public class SmurfRunner {
	public static void main(String[] args) {
		Smurf smurf = new Smurf("Smurf");
		Smurf Papa = new Smurf("Papa");
		Smurf Smurfette = new Smurf("Smurfette");
		System.out.println(smurf.getName());
		System.out.println(Papa.getName());
		System.out.println(Papa.getHatColor());
		System.out.println(Papa.isGirlOrBoy());
		System.out.println(Smurfette.getName());
		System.out.println(Smurfette.getHatColor());
		System.out.println(Smurfette.isGirlOrBoy());
	}
}
