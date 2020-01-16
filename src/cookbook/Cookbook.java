package cookbook;

public class Cookbook {

	private String author = "";
	private String title;
	private Page[] pages;
	private final int MAX_PAGES = 60;

	public Cookbook(String title, int numberOfPages, String... authors) {
		this.setTitle(title);
		if (numberOfPages >= MAX_PAGES) {
			this.pages = new Page[MAX_PAGES];
		} else {
			this.pages = new Page[numberOfPages];
		}
		this.pages = new Page[numberOfPages];
		for (int i = 0; i <= authors.length - 1; i++) {
			this.setAuthor(this.getAuthor() + ("" + authors[i]));
		}
	}

	public Cookbook(String title, String... authors) {
		for (int i = 0; i <= authors.length; i++) {
			this.setAuthor(this.getAuthor() + ("" + authors[i]));
		}
		this.pages = new Page[MAX_PAGES];
		this.setTitle(title);
	}

	public Cookbook() {
		this.setAuthor("unknown");
		this.pages = new Page[1];
		this.setTitle("");
	}

	public int suggestRecipe(String course) {
		int i = (int) (Math.random() * pages.length);
		if (pages[i].getRecipe().getCourse().equals(course)) {
			return pages[i].getPageNumber();
		} else {
			return suggestRecipe(course);
		}
	}

	public void addPage(Page newPage) {
		pages[newPage.getPageNumber() - 1] = newPage;
	}

	public Page getPage(int i) {
		return getPage(i, 0);
	}

	public Page getPage(int i, int j) {
		if (i == j) {
			return pages[j];
		} else {
			return getPage(i, j + 1);
		}
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
