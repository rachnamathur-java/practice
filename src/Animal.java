import java.util.List;

interface Animal{
    public void animalSound();
    public void animalSleep();
}

class Dog implements Animal{
    public void animalSound(){
        System.out.println("bho bho....");
    }
    public void animalSleep(){
        System.out.println("dog Sleeping ");
    }

    public void eating(){
        System.out.println("dog eating...");
    }
}

class Rabit implements Animal{
    public void animalSound(){
        System.out.println("Rabit Sound....");
    }
    public void animalSleep(){
        System.out.println("rabit  Sleeping ");
    }

    public void eating(){
        System.out.println("Rabit eating...");
    }
    public void walking(){
        System.out.println("Rabit Walking...");
    }
}
class Main{
    public static void main(String[] args) {


        Dog dog = new Dog();
        Rabit rabit = new Rabit();

        dog.animalSleep();
        dog.animalSound();
        dog.eating();
        System.out.println();

        rabit.animalSleep();
        rabit.animalSound();
        rabit.eating();
        rabit.walking();
    }
}

