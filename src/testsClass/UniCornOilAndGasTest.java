package testsClass;

public class UniCornOilAndGasTest {

    private String location;
    private final double fuelPerLitre = 200;
    private int litre;
    private double price;

    public UniCornOilAndGasTest(int litre , String location){
        this.litre = litre;
        this.location = location;
    }

    public boolean buyFuel() {
        return true;
    }

    public void getDiscount(int litre) {
        this.price = (fuelPerLitre * litre) - (fuelPerLitre * litre * 0.02);
        //0.02 is the percentage discount 2/100 = 0.02
    }

    public double getPrice() {
        return this.price;
    }
}

