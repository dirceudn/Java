package effective.builders;

//JavaBeans Pattern - allows inconsistency, mandates mutability
public class NutritionFactsJavaBeans {
	private final int servingSize = -1;
	private final int servings = 0;
	private final int calories = 0; 
	private final int fat = 0;
	private final int sodium = 0;
	private final int carbohydrate = 0;
	
	public int getServingSize() {
		return servingSize;
	}

	public int getServings() {
		return servings;
	}

	public int getCalories() {
		return calories;
	}

	public int getFat() {
		return fat;
	}

	public int getSodium() {
		return sodium;
	}

	public int getCarbohydrate() {
		return carbohydrate;
	}


	public NutritionFactsJavaBeans() {}
}
