
package Practice_Problem_05;
class Dog {
    private String name;
    private int age;
    private String breed;

    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public void bark() {
        System.out.println(name + " is barking: Woof! Woof!");
    }

    public void spin() {
        System.out.println(name + " is spinning in circles!");
    }


    public void run() {
        System.out.println(name + " is running fast!");
    }

    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", 3, "Golden Retriever");

        myDog.bark();
        myDog.spin();
        myDog.run();
    }
}
