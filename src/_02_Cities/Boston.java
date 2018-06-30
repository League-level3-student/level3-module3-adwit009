package _02_Cities;

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double x = population * growthRate;
		Double y = (double) (population/2);
		
		x = x+y;
		return x;
	}

}
