package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {
	static ArrayList <Animal> animals = new ArrayList();
	Farm(){
	
		Pig p1 = new Pig();
		Pig p2 = new Pig();
		Dog d1 = new Dog();
		Cat ca1 = new Cat();
		Cow co1 = new Cow();
		Cow co2 = new Cow();
		animals.add(p1);
		animals.add(p2);
		animals.add(d1);
		animals.add(ca1);
		animals.add(co1);
		animals.add(co2);
	}
	public static void main(String[] args) {
		Farm f = new Farm();
		for (int i = 0; i < animals.size(); i++) {
			animals.get(i).makeNoise();
			animals.get(i).foodFed();
		}
		
	}
}
