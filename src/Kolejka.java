import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Kolejka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        Queue<Integer> kolejka = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            System.out.println("Podaj liczbe: ");
            kolejka.add(scanner.nextInt());
            scanner.nextLine();
        }
        int suma = 0;
        while (!kolejka.isEmpty()){
            int liczba = kolejka.poll();
            stringBuilder.append(liczba);
            stringBuilder.append("+");
            suma+=liczba;
        }
        stringBuilder.replace(stringBuilder.length()-1, stringBuilder.length(), "=");
        stringBuilder.append(suma);
        System.out.println(stringBuilder.toString());
    }
}
