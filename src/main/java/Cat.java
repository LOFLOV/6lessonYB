public class Cat extends Animal {

    @Override
    void run(int lengthDificulty) {
        if (lengthDificulty > 0 && lengthDificulty < 200) {
            System.out.println("Животное: " + name + " пробежал: " + lengthDificulty + "м");
        } else {
            System.out.println("Животное: " + name + "  ограничения на действия (бег: кот 200 м.) ");
        }

    }

    @Override
    void swim(int lengthDificulty) {
            System.out.println("Животное: " + name + " кот не умеет плавать ");
    }
}
