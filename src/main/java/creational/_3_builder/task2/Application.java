package creational._3_builder.task2;

public class Application {

  public static void main(String[] args) {
    PdfHeader pdfHeader = new PdfHeader("Заголовок PDF");
    PdfBody pdfBody = new PdfBody("Тело PDF");
    PdfDocument pdfDocument = new PdfDocument("Новый PDF", pdfHeader, pdfBody);
    WordHeader wordHeader = new WordHeader("Заголовок WORD");
    WordBody wordBody = new WordBody("Тело WORD");
    WordDocument wordDocument = new WordDocument("Новый WORD", wordHeader, wordBody);
  }

}
