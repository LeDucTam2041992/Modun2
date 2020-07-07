package ngay7_thuchanh1;

public class Run {
    public static void main(String[] args) {
        Animals[] animals = new Animals[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animals animal : animals) {
            System.out.println(animal.makeNoise());
            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
