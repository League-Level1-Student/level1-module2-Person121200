package _03_tea_maker;

import _03_tea_maker.Kettle.Water;

public class TeamakerRunner {
	public static void main(String[] args) {
		TeaBag teabag = new TeaBag("Green Tea");
		Kettle kettle = new Kettle();
		Water water = kettle.getWater();
		Cup cup = new Cup();
		System.out.println(teabag.getFlavor());
		kettle.boil();
		water.isHot();
		cup.makeTea(teabag, water);
		
	}
}
