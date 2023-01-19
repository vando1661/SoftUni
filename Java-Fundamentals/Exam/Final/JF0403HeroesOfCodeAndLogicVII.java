package exam.Final;

import java.util.*;

public class JF0403HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Map<String, Integer[]> map = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <n ; i++) {
            String hero = scanner.nextLine();
            String []heroArr = hero.split(" ");
            String name = heroArr[0];
            int hitPoints = Integer.parseInt(heroArr[1]);
            int manaPoints = Integer.parseInt(heroArr[2]);
            map.putIfAbsent(name, new Integer[2]);
            map.get(name)[0] = hitPoints;
            map.get(name)[1] = manaPoints;
        }

        String input = scanner.nextLine();
        while (!input.equals("End")){
            String[] inputArr = input.split(" - ");
            String command = inputArr[0];
            String name = inputArr[1];
            switch (command){
                case "CastSpell":
                    int neededMP = Integer.parseInt(inputArr[2]);
                    String spellName = inputArr[3];

                    int currentMP = map.get(name)[1];
                    if (currentMP >= neededMP){
                        currentMP -= neededMP;
                        map.get(name)[1] = currentMP;
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", name,spellName, currentMP );
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", name, spellName);
                    }
                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(inputArr[2]);
                    String attacker = inputArr[3];

                    int currentDamage = map.get(name)[0];
                    currentDamage -= damage;
                    map.get(name)[0] = currentDamage;

                    if (map.get(name)[0] > 0) {
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n",
                                name, damage, attacker, currentDamage);
                    }else{

                        System.out.printf("%s has been killed by %s!%n", name,attacker);
                        map.remove(name);
                    }
                    break;
                case "Recharge":
                    int amount = Integer.parseInt(inputArr[2]);
                    int currentMPRecharge = map.get(name)[1];
                    if (currentMPRecharge+amount > 200){
                        currentMPRecharge = 200- currentMPRecharge;
                        System.out.printf("%s recharged for %d MP!%n", name, currentMPRecharge);
                        currentMPRecharge = 200;
                        map.get(name)[1]= 200;
                    } else {
                        System.out.printf("%s recharged for %d MP!%n", name, amount);
                        currentMPRecharge += amount;
                        map.get(name)[1]= currentMPRecharge;
                    }
                    break;
                case "Heal":
                    int amountHeal = Integer.parseInt(inputArr[2]);
                    int currentHeal = map.get(name)[0];
                    if (currentHeal + amountHeal > 100){
                        currentHeal = 100- currentHeal;
                        System.out.printf("%s healed for %d HP!%n", name, currentHeal);
                        currentHeal = 100;
                        map.get(name)[0]= 100;
                    } else {
                        System.out.printf("%s healed for %d HP!%n", name, amountHeal);
                        currentHeal += amountHeal;
                        map.get(name)[0]=currentHeal;
                    }
                    break;

            }

            input= scanner.nextLine();
        }
        map
                .entrySet()
                .stream()
                //.sorted((a, b) -> Integer.compare(a.getValue()[0], b.getValue()[0]))
                .forEach(entry -> System.out.printf("%s%nHP: %d%nMP: %d%n", entry.getKey(), entry.getValue()[0], entry.getValue()[1]));
    }
}
