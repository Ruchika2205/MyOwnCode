public class Dog {


    String name;
    int age;
    String breed;
    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public void bark()
    {
        System.out.println("wuff wuff wuff wuff");
    }

    public void eat(String food)
    {
        System.out.println("dog just ate "+food);

        if(food.equals("candy"))
        {
            System.out.println("dog is sick now");
        }
    }

    public static void run()
    {
        System.out.println("run run run");
    }


}
