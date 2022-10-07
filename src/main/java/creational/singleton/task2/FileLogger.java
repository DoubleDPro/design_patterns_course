package creational.singleton.task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

class FileLogger {

  private static final String FILE_PATH = "C:\\Temp\\1.txt";

  private OutputStream os;

  FileLogger() {
    try {
      os = Files.newOutputStream(Paths.get(FILE_PATH));
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  void writeLog(String line) {
    try {
      os.write(line.getBytes(StandardCharsets.UTF_8));
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  String getLog() {
    try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
      StringBuilder sb = new StringBuilder();
      while (br.ready()) {
        sb.append(br.readLine());
      }
      return sb.toString();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

}
