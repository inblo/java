package Start;

public class task16 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("");
        person1.setAge(51);
        person1.seyHello();
        person1.speak();
        int year = person1.calculateYearsToWork();
        System.out.println("Работаю уже " + year + " лет!");
        person1.calculateYearsToRetirement();
        Person person2 = new Person();
        person2.setName("Igor");
    }
}

class Person {
    private String name;
    private int age;

    public void setName(String username){
        if(username.isEmpty()){
            System.out.println("*************************");
            System.out.println();
            System.out.println("Incorrect Name");
            System.out.println();
            System.out.println("*************************");
        } else{
            name = username;
        }
    }
    public String getName(){
        return name;
    }
    public void setAge(int userage){
        if(userage <= 0){
            System.out.println("*************************");
            System.out.println();
            System.out.println("Incorrect Age");
            System.out.println();
            System.out.println("*************************");
        }else{
            age = userage;
        }
    }
    public int getAge(){
        return age;
    }

    void speak() {
        System.out.println("Меня зовут, " + name + ", мне " + age + " лет!");

    }

    void seyHello() {
        System.out.println("Hello!");
    }

    void calculateYearsToRetirement() {
        int years = 65 - age;
        System.out.println("До пенсии мне осталось работать " + years + " лет!");
    }

    int calculateYearsToWork(){
        int yearsWork = age - 20;
        return yearsWork;
    }

}
