package OOP;

public class BottleOfWater extends Product {

    private int volume;

    public BottleOfWater(int cost, String name, int volume){
        super(cost, name);
        this.volume = volume;
    }

    public int getVolume(){
        return volume; 
    }

    @Override
    public String toString(){
        return "BotteOfWatter{" + "volume = " + volume + 
        ", cost = " + super.getCost() + 
        ", name = '" + super.getName() + '\'' + '}';
    }
}
