package creational._2_prototype.task2;

class Application {

  public static void main(String[] args) {
    Sheep sheep = new Sheep();
    sheep.setName("Dolly");
    sheep.setAge(1);
    sheep.setWeight(4.5);
    sheep.setColor(Color.WHITE);
    CloneLaboratory cloneLaboratory = new CloneLaboratory();
    Sheep clone = cloneLaboratory.processCloneProcedure(sheep);
    System.out.println("Original: " + sheep);
    System.out.println("Clone: " + clone);
    System.out.println("Is equals: " + sheep.equals(clone));

  }
}
