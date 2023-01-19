package exam.Mid;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JF0402ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        List <String> productList = Arrays.stream(scanner.nextLine().split("\\!"))
                .collect(Collectors.toList());
        String text = scanner.nextLine();
        while (!text.equals("Go Shopping!")){
            String [] commandArray = text.split("\\s+");
            String command = commandArray[0];
            String product = " ";
            switch (command){
                case "Urgent":
                    product = commandArray[1];
                    if(!productList.contains(product)){
                        productList.add(0,product);
                    }
                    break;
                case "Unnecessary":
                    product = commandArray[1];
                    productList.remove(product);
                    break;
                case "Correct":
                    product = commandArray[1];
                    String productNew = commandArray[2];
                    if(productList.contains(product)){
                        int index = productList.indexOf(product);
                        productList.add(index,productNew);
                        productList.remove(product);

                        //productList.add((productList.indexOf(product)));
                    }

                    break;
                case "Rearrange":
                    product = commandArray[1];
                    if(productList.contains(product)){
                        productList.remove(product);
                        productList.add(product);
                    }
                    break;
            }


            text = scanner.nextLine();
        }
        System.out.println(String.join(", ",productList));
    }
}
