import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
public class LinkedListQ1 {
    record store (String name, int distance){ }


    public static void main(String[] args) {
        LinkedList<testing.store> name = new LinkedList<>();
        testing.store ax = new testing.store("x", 100);
        testing.store bx = new testing.store("y", 200);
        testing.store cx = new testing.store("z", 300);
        testing.store dx = new testing.store("p", 400);
        testing.store ex = new testing.store("q", 500);
        testing.store fx = new testing.store("r", 600);

        String printblock = """
                 Choose the first letter or the word
                 (F)orword
                 (B)ackword
                 (M)enu
                 (Q)uit
                
                 """;

        name.addAll(Arrays.asList(ax,bx,cx,dx,ex,fx));

        var it= name.listIterator();


        for(var i: name){
            System.out.println(i);
        }
        Scanner in = new Scanner(System.in);
        System.out.println(printblock);
        String option;
        do {
            System.out.println("enter choice");
            option = in.nextLine();
            switch (option) {
                case "f":
                case "forword":
                    if (it.hasNext())
                        System.out.println(it.next());
                    else System.out.println("end of the station");
                    break;
                case "b":
                case "bakcword":
                    if (it.hasPrevious())
                        System.out.println(it.previous());
                    else System.out.println("returned to the beinging of the station");
                    break;
                case "m":
                case "menu":
                    System.out.println(printblock);
                    break;
                case "q":
                case "quit":
                    //System.exit(0);
                    break;
            }
        } while (!option.equals("q"));
    }
}
