interface WordDocument{
    public abstract void open();
}
interface PdfDocument{
    void open();
}
interface ExcelDocument{
    void open();
}

class WordDocumentBuilder implements WordDocument{
    @Override
    public void open(){
        System.out.println("Opening Word File");
    }
}
class PdfDocumentBuilder implements PdfDocument{
    @Override
    public void open(){
        System.out.println("Opening Pdf File");
    }
}
class ExcelDocumentBuilder implements ExcelDocument{
    @Override
    public void open(){
        System.out.println("Opening Excel File");
    }
}

abstract class DocumentFactory<T> {
    public abstract T createDocument();
}
class WordDocumentFactory extends DocumentFactory<WordDocument>{
    @Override
    public WordDocument createDocument(){
        return new WordDocumentBuilder();
    }
}
class PdfDocumentFactory extends DocumentFactory<PdfDocument>{
    @Override
    public PdfDocument createDocument(){
        return new PdfDocumentBuilder();
    }
}
class ExcelDocumentFactory extends DocumentFactory<ExcelDocument>{
    @Override
    public ExcelDocument createDocument(){
        return new ExcelDocumentBuilder();
    }
}


public class FactoryMethodPatternExample{
    public static void main(String[] args){
        DocumentFactory<WordDocument> wordFactory = new WordDocumentFactory();
        WordDocument wordDoc = wordFactory.createDocument();
        wordDoc.open();

        DocumentFactory<PdfDocument> pdfFactory = new PdfDocumentFactory();
        PdfDocument pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();

        DocumentFactory<ExcelDocument> excelFactory = new ExcelDocumentFactory();
        ExcelDocument excelDoc = excelFactory.createDocument();
        excelDoc.open();
    }
}