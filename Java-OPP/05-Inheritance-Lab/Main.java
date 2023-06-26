package Java_OOP._05InheritanceLab;

public class Main {
    public static void main(String[] args) {
        /*Java_OOP._05InheritanceLab.Dog dog = new Java_OOP._05InheritanceLab.Dog();
        dog.eat();
        dog.bark();

        Java_OOP._05InheritanceLab.Cat cat = new Java_OOP._05InheritanceLab.Cat();
        cat.eat();
        cat.meow();*/
        /*Java_OOP._05InheritanceLab.RandomArrayList<Integer> randomArrayList = new Java_OOP._05InheritanceLab.RandomArrayList<>();
        randomArrayList.add(16);
        randomArrayList.add(25);
        randomArrayList.add(29);
        System.out.println(randomArrayList.getRandomElement());*/
        StackOfStrings stack = new StackOfStrings();
        stack.push("Java_Advance.one");
        stack.push("Java_Advance.two");
        stack.push("three");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());

    }
}
