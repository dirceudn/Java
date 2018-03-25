package effective.builders;

import effective.builders.MyPizza.Size;
import effective.builders.Pizza.Topping;

public class TestBuilder {

	private static final Topping SAUSAGE = null;
	private static final Size SMALL = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyPizza pizza = (MyPizza) new MyPizza.Builder(SMALL).addTopping(SAUSAGE).build();
	}

}
