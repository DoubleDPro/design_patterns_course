package creational.prototype.task2;

class CloneLaboratory {

  Sheep processCloneProcedure(Sheep sheep) {
    Sheep newSheep = new Sheep();
    newSheep.setName(sheep.getName());
    newSheep.setAge(sheep.getAge());
    newSheep.setWeight(sheep.getWeight());
    newSheep.setColor(sheep.getColor());
    return newSheep;
  }

}
