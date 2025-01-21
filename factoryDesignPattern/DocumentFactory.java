
public class DocumentFactory {

    public static Document createDocument(String docType){
        if(docType.equals("pdf")){
            return new PdfDocument();
        }else if(docType.equals("word")){
            return new WordDocument();
        } else if (docType.equals("excel")) {
            return new ExcelDocument();
        } else if (docType.equals("text")) {
            return new TextDocument();
        }else{
            System.out.println("Document not present");
            return null;
        }
    }
}
