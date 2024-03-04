package _5SetsAndMapsAdvanced_Lab;

import java.util.*;

public class JA02SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine();
        Set<String> guest = new TreeSet<>();
        Set<String> vipGuest = new TreeSet<>();
        while (!input.equals("PARTY")){
                if(Character.isDigit(input.charAt(0))){
                    vipGuest.add(input);
                }
                else{
                    guest.add(input);
                }
                input = scanner.nextLine();
            }
            while (!input.equals("END")){
                if(Character.isDigit(input.charAt(0))){
                    vipGuest.remove(input);
                }else {
                    guest.remove(input);
                }
                input = scanner.nextLine();
            }
        System.out.println(vipGuest.size() + guest.size());
        for (String g : vipGuest ) {
            System.out.println(g);
        }
        for (String g : guest) {
            System.out.println(g);
        }
        }
    }

