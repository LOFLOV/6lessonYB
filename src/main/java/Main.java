public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();

        cat1.name = "Мурзик";
        dog1.name = "Барсик";
        cat1.run(150);
        cat1.swim(3121);
        dog1.run(443);
        dog1.swim(6);
    }
}
