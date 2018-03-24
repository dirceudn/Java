package effective.builders;

import java.util.Objects;

public class MyPizza  extends Pizza{
	
	public enum Size {SMALL, MEDIUM, LARGE}
	private final Size size;
	
	public static class Builder extends Pizza.Builder<Builder>{
		private final Size size;
		
		public Builder(Size size) {
			this.size = Objects.requireNonNull(size);
		}

		@Override
		Pizza build() {
			// TODO Auto-generated method stub
			return new MyPizza(this);
		}

		@Override
		protected Builder self() {
			// TODO Auto-generated method stub
			return this;
		}
	}
	
	MyPizza(Builder builder) {
		super(builder);
		this.size = builder.size;
		// TODO Auto-generated constructor stub
	}

}
