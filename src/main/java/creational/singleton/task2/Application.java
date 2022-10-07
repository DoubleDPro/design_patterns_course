package creational.singleton.task2;

class Application {

  public static void main(String[] args) throws InterruptedException {
    FirstClient firstClient = new FirstClient();
    SecondClient secondClient = new SecondClient();
    ClientRunner firstClientRunner = new ClientRunner(firstClient);
    ClientRunner secondClientRunner = new ClientRunner(secondClient);
    firstClientRunner.start();
    firstClientRunner.join();
    secondClientRunner.start();
    secondClientRunner.join();
    System.out.println(secondClient.getFileLogger().getLog());

  }

}
