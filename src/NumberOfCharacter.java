import  java.util.Scanner;
public class NumberOfCharacter {
    public static void main(String[] args) {
        System.out.println("Insert something");
        Scanner scanner = new Scanner (System.in);
        String str =  scanner.nextLine();
        System.out.println("Insert character you want to check: ");
        char character = scanner.next().charAt(0); ;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character){
                count++;
            }
        }
        System.out.println(count +" character " + character + " in " + str);
    }

}
