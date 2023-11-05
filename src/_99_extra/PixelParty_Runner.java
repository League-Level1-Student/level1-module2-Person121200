package _99_extra;

public class PixelParty_Runner {
	public static void main(String[] args) {
		PixelParty party = new PixelParty();
		party.setColor(0, 128, 0);
		party.drawCircle(26, 72, 20);
		party.drawCircle(200, 72, 20);
		party.drawRectangle(70, 187, 93, 58);
		party.drawTriangle(10, 10, 10, 10, 10, 10);
		party.drawLine(3, 3, 50, 50);
		party.drawLine(3, 3, 40, 20);
		party.drawLine(3, 400, 50, 50);
		party.drawLine(3, 400, 40, 20);
		party.saveImage();
		party.displayImage();

		


	}
	
}
