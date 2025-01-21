

public class Main {
    public static void main(String args[]){

        //System.out.println("hello");
        Document pdf = DocumentFactory.createDocument("pdf");
        pdf.generate();
    }

}
