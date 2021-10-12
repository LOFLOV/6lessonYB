public class Animal {
    public String name;

    public Animal() {

    }

    public Animal(String name) {
        this.name = name;

    }

    public void animalInfo() {
        System.out.println("Животное: имя - " + name);
    }

    void run(int lengthDificulty) {
        System.out.println("Животное: " + name + " пробежал: " + lengthDificulty + "m");
    }

    void swim(int lengthDificulty) {
        System.out.println("Животное: " + name + " проплыл: " + lengthDificulty + "m");
    }


}
