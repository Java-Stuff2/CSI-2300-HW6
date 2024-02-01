package animal;

public class Animal {
    public int age;
    public String gender;

    public boolean isMammal() {
        System.out.println("This public method isMammal() is from the Animal class: ");
        System.out.println("This is a mammal.");
        System.out.println("Age: 4");
        System.out.println("Gender: Female \n");
        return true;
    }

    public void mate() {
        System.out.println("This public method mate() is from the Animal class: ");
        System.out.println("This animal has a mate. His name is John. \n");
    }

    public class Fish extends Animal {
        private int sizeInFeet;

        private void canEat() {
            System.out.println("This private method canEat() is from class Fish.");
        }
    }

    public class Zebra extends Animal {
        public boolean is_wild;

        public void run() {
            System.out.println("This public method run() is from the Zebra class: ");
            System.out.println("This zebra is currently in the wild. \n");

        }
    }

    public static void main(String[] args) throws Exception {
        Animal myAnimal = new Animal();
        Fish myFish = myAnimal.new Fish();
        Zebra myZebra = myAnimal.new Zebra();
        myAnimal.isMammal();
        myAnimal.mate();
        myZebra.run();
    }

}
