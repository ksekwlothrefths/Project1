package mainclasses;

public class Medicine {
	private int code;
	private String name;
	private float price;
	private float amount;

	public Medicine(int codeMed, String nameMed, float priceMed, float amount) {
		this.code = codeMed;
		this.name = nameMed;
		this.price = priceMed;
		this.amount = amount;

	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

}
