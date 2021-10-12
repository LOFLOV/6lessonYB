public class Dog extends Animal {

    @Override
    void run(int lengthDificulty) {
        if (lengthDificulty > 0 && lengthDificulty < 500) {
            System.out.println("Животное: " + name + " пробежал: " + lengthDificulty + "м");
        } else {
            System.out.println("Животное: " + name + "  ограничения на действия (бег: собака 500 м.) ");
        }
    }

    @Override
    void swim(int lengthDificulty) {
        if (lengthDificulty > 0 && lengthDificulty < 10) {
            System.out.println("Животное: " + name + " проплыл: " + lengthDificulty + "м");
        } else {
            System.out.println("Животное: " + name + "  ограничения на действия (плавание: кот 10 м.) ");
        }
    }
}
