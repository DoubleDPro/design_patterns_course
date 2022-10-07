package creational.singleton.task2;

class ClientRunner extends Thread {

  private Client client;

  ClientRunner(Client client) {
    this.client = client;
  }

  @Override
  public void run() {
    client.process();
  }
}
