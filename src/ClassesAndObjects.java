public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Meiirzhan";
        person1.age = 23;
        System.out.println("Hello, my name is " + person1.name + ", I'm " + person1.age);
        Person person2 = new Person();
        person2.name = "Diana";
        person2.age = 22;
        System.out.println("Hello, my name is " + person2.name + ", I'm " + person2.age);
    }
}

class Person {
    String name;
    int age;
}

