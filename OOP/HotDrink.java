package OOP;

public class HotDrink extends Product {
   
    private int temperature;
    private int volume;

    public HotDrink(int cost, String name, int volume, int temperature){
        super(cost, name);
        this.volume = volume;
        this.temperature = temperature;
    }
    public int getVolume(){
        return volume; 
    }
    public int getTemperature(){
        return temperature;
    }

    @Override
    public String toString(){
        return "HotDrink{" + "volume = " + volume + 
        ", temperature = " + temperature + 
        ", cost = " + super.getCost() + 
        ", name = '" + super.getName() + '\'' + '}';

    }

}
