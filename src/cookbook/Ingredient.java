package cookbook;

public class Ingredient {
	
	private String name;
	private String typ;
	
	
	public Ingredient(String name, String typ) {
		this.name = name;
		this.typ = typ;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTyp() {
		return typ;
	}
	public void setTyp(String typ) {
		this.typ = typ;
	}

}
