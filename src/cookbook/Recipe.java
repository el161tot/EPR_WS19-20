package cookbook;

public class Recipe {

	private String name;
	private Ingredient[] ingrediens;
	private String course;
	private String text;

	public Recipe(String name, String course, Ingredient[] ingrediens, String text) {
		this.name = name;
		this.course = course;
		this.ingrediens = ingrediens;
		this.text = text;
	}

	public void printRecipe() {
		System.out.println();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Ingredient[] getIngrediens() {
		return ingrediens;
	}

	public void setIngrediens(Ingredient[] ingrediens) {
		this.ingrediens = ingrediens;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
