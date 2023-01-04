package creational._3_builder.task2;

public class WordDocument {

  private String name;
  private WordHeader wordHeader;
  private WordBody wordBody;

  public WordDocument(String name, WordHeader wordHeader, WordBody wordBody) {
    this.name = name;
    this.wordHeader = wordHeader;
    this.wordBody = wordBody;
  }

}
