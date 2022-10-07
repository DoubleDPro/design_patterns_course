package creational.prototype.task2;

import java.util.Objects;

class Sheep {

  private String name;
  private int age;
  private double weight;
  private Color color;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sheep sheep = (Sheep) o;
    return age == sheep.age && Double.compare(sheep.weight, weight) == 0
        && Objects.equals(name, sheep.name) && color == sheep.color;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age, weight, color);
  }

  @Override
  public String toString() {
    return "Sheep{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", weight=" + weight +
        ", color=" + color +
        '}';
  }
}
