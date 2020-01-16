package cookbook;

public class Page {
	
	private int pageNumber;
	private Recipe recipe;
	
	
	public Page(int pageNumber, Recipe recipe) {
		this.pageNumber = pageNumber;
		this.recipe = recipe;
	}

	public int getPageNumber() {
		return pageNumber;
	}
	
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}


	public Recipe getRecipe() {
		return recipe;
	}


	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}
	
	
}
