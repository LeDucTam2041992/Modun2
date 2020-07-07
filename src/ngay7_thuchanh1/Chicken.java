package ngay7_thuchanh1;

public class Chicken extends Animals implements Edible{
    @Override
    public String makeNoise() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
