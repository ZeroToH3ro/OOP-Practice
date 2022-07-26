package Exercise_2;

public class Book extends Document{
	private String nameAuthor;
	private int numberPages;
	public Book() {
		super();
	}
	public Book(int idDocument, String namePublish, int numberPublish, String nameAuthor, int numberPages) {
		super(idDocument, namePublish, numberPublish);
		this.nameAuthor = nameAuthor;
		this.numberPages = numberPages; 
	}
	public String getNameAuthor() {
		return nameAuthor;
	}
	public void setNameAuthor(String nameAuthor) {
		this.nameAuthor = nameAuthor;
	}
	public int getNumberPages() {
		return numberPages;
	}
	public void setNumberPages(int numberPages) {
		this.numberPages = numberPages;
	}
	@Override
	public String toString() {
		return "Book [nameAuthor=" + nameAuthor + ", numberPages=" + numberPages + ", NameAuthor= "
				+ getNameAuthor() + ", NumberPages= " + getNumberPages() + "]";
	}
	
	
}
