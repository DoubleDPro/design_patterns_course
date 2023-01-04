package creational._1_singleton.task2;

class SecondClient implements Client {

  private FileLogger fileLogger = new FileLogger();

  @Override
  public void process() {
    fileLogger.writeLog("Second client start process...|");
    for (int i = 0; i < 1_000_000_000; i++) {}
    fileLogger.writeLog("Second client end process...");
  }

  FileLogger getFileLogger() {
    return fileLogger;
  }

}
