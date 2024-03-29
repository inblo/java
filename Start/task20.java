package Start;

public class task20 {
    public static void main(String[] args) {
        Human h1 = new Human("Igor", 37);
        h1.setName("Bob");
    }
}
class Human{
    @SuppressWarnings("unused")
    private String name;
    @SuppressWarnings("unused")
    private int age;

    public Human(){
        this.name = "Igor";
        this.age = 37;
    }

    public Human(String name){
        System.out.println("Constructor 2");
        this.name = name;
    }

    public Human(String name, int age){
        System.out.println("Constructor 3");
        this.name  = name;
        this.age = age;
    }


    public void setName(String name) {this.name = name;}

    public void setAge(int age) {this.age = age;}



}
