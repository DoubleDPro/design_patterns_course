package creational._3_builder.task2;

public class PdfDocument {

  private String name;
  private PdfHeader pdfHeader;
  private PdfBody pdfBody;

  public PdfDocument(String name, PdfHeader pdfHeader, PdfBody pdfBody) {
    this.name = name;
    this.pdfHeader = pdfHeader;
    this.pdfBody = pdfBody;
  }


}
