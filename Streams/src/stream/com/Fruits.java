package stream.com;

public class Fruits {
	private String name;
	private int calories;
	private int prices;
	private String color;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public int getPrices() {
		return prices;
	}
	public void setPrices(int prices) {
		this.prices = prices;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Fruits(String name, int calories, int prices, String color) {
		super();
		this.name = name;
		this.calories = calories;
		this.prices = prices;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Fruits [name=" + name + ", calories=" + calories + ", prices=" + prices + ", color=" + color + "]";
	}
	
	
	
	 

}
//String name; int calories; int price; String color