package Exercise_2;

import java.util.ArrayList;
import java.util.List;

public class ManageResources {
	private List<Document> listDocuments;
	
	public ManageResources() {
		this.listDocuments = new ArrayList<Document>();
	}

	public List<Document> getListDocuments() {
		return listDocuments;
	}

	public void setListDocuments(List<Document> listDocuments) {
		this.listDocuments = listDocuments;
	}
	
	public void addDocument(Document document) {
		this.listDocuments.add(document);
	}
	public boolean deleteDocument(int id) {
        Document doc = this.listDocuments.stream()
                .filter(document -> document.getIdDocument() == id)
                .findFirst().orElse(null);
        if (doc == null) {
            return false;
        }
        this.listDocuments.remove(doc);
        return true;
    }
	public void showInformationDocument() {
		this.listDocuments.forEach(document->System.out.println(document.toString()));
	}
	public void searchByBook() {
		this.listDocuments.stream().
			filter(document -> document instanceof Book)
			.forEach(document->System.out.println(document.toString()));
	}
	public void searchByMagazine() {
		this.listDocuments.stream().
			filter(document -> document instanceof Magazine)
			.forEach(document->System.out.println(document.toString()));
	}
	public void searchByNewsPaper() {
		this.listDocuments.stream().
			filter(document -> document instanceof Newspaper)
			.forEach(document->System.out.println(document.toString()));
	}
}
