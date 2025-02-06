class Animal {
    String voice;
    int age;
    void display(String voice, int age) {
        this.voice = voice;
        this.age = age;
        System.out.println(this.voice);
        System.out.println(this.age);
    }
}
class Dog extends Animal {
    public void eat() {
        System.out.println("Dogs eat meat");
    }
}
class Cat extends Animal {
    public void isPet() {
        System.out.println("Cats are pet animals");
    }
}
public class MainInheritanceExample {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Dog d = new Dog();
        Cat c = new Cat();
        animal1.display("Roar", 2);
        d.eat();
        c.isPet();
		c.display("Meow", 3);
    }
}
