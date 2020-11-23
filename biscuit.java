public class Biscuit {
	private int getNumberOfBiscuits;
	private int weight;
	private String brand;
	private String maker;
	
	public Biscuit() {
		this.getNumberOfBiscuits = getNumberOfBiscuits;
		this.weight = weight;
		this.brand = brand;
		this.maker = maker;
		
	}
	
	public Biscuit(String brand, String maker, int weight) {
		this.brand = brand;
		this.maker = maker;
		this.weight = weight;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public int getNumberOfBiscuits() {
		return getNumberOfBiscuits;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public String getMaker() {
		return maker;
	}
	
	public String toString() {
		return brand+" "+maker+" "+weight+" "+getNumberOfBiscuits;
	}
}
