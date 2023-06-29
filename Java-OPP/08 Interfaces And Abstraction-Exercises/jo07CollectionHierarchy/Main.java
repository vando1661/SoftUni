package Java_OOP._08InterfacesAndAbstractionExercises.jo07CollectionHierarchy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddCollection addCollection = new AddCollection();
        AddRemoveCollection addRemoveCollection = new AddRemoveCollection();
        MyListImpl myList = new MyListImpl();
        String[] inputWords = scanner.nextLine().split("\\s+");
        int numOperation = Integer.parseInt(scanner.nextLine());
        performAdd(inputWords,addCollection);
        performAdd(inputWords,addRemoveCollection);
        performAdd(inputWords,myList);

        performRemove(numOperation,addRemoveCollection);
        performRemove(numOperation,myList);
    }
    public static void performRemove(int counter, AddRemovable addRemovable){
        for (int i = 0; i < counter; i++) {
            System.out.print(addRemovable.remove() + " ");
        }
        System.out.println();
    }

    public static void performAdd(String[] inputWords, Addable addable) {
        for (String word : inputWords) {
            System.out.print(addable.add(word) + " ");
        }
        System.out.println();
    }
}
