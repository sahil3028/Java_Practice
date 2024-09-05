import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class arrayListQ1 {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>(List.of("a", "b", "c", "d"));
        System.out.println(l1);
        Scanner in = new Scanner(System.in);
        String x;

        while (true) {
            System.out.println("1. add items\n2. remove items\n0. shutdown");
            int choice = in.nextInt();
            in.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("enter the element you wanna add : ");
                    x = in.nextLine();
                    while (l1.contains(x)) {
                        System.out.println("Already Exists, Try again");
                        x = in.nextLine();
                    }
                        l1.add(x);
                        l1.sort(Comparator.naturalOrder());
                        System.out.println(l1);
                    break;
                case 2:
                    System.out.println("enter the element you wanna remove : ");
                    x = in.nextLine();
                    if (l1.contains(x)) {
                        l1.remove(x);
                        l1.sort(Comparator.naturalOrder());
                        System.out.println(l1);
                    }
                    else{
                        System.out.println("element is already missing");
                    }
                    break;
                case 0:
                    System.out.println("shutting down");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong input, Try again");
                    break;
            }
        }
    }
    }

