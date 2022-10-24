package listsLab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class JF06ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> productList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String currentProduct = scanner.nextLine();
            productList.add(currentProduct);
        }
        Collections.sort(productList);
        for (int i = 0; i < n; i++) {
            System.out.printf("%d.%s%n",i + 1,productList.get(i));
        }
    }
}
