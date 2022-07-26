package Exercise_2;

public class Document {
	private int idDocument;
	private String namePublish;
	private int numberPublish;
	public Document() {
		super();
	}
	public Document(int idDocument, String namePublish, int numberPublish) {
		super();
		this.idDocument = idDocument;
		this.namePublish = namePublish;
		this.numberPublish = numberPublish;
	}
	public int getIdDocument() {
		return idDocument;
	}
	public void setIdDocument(int idDocument) {
		this.idDocument = idDocument;
	}
	public String getNamePublish() {
		return namePublish;
	}
	public void setNamePublish(String namePublish) {
		this.namePublish = namePublish;
	}
	public int getNumberPublish() {
		return numberPublish;
	}
	public void setNumberPublish(int numberPublish) {
		this.numberPublish = numberPublish;
	}
	@Override
	public String toString() {
		return "Document [idDocument= " + idDocument + ", namePublish= " + namePublish + ", numberPublish= "
				+ numberPublish + "]";
	}
	
}
