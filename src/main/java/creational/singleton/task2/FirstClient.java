package creational.singleton.task2;

class FirstClient implements Client {

  private FileLogger fileLogger = new FileLogger();

  @Override
  public void process() {
    fileLogger.writeLog("First client start process...");
    for (int i = 0; i < 1_000_000_000; i++) {}
    fileLogger.writeLog("First client end process...");
  }

  FileLogger getFileLogger() {
    return fileLogger;
  }
}
