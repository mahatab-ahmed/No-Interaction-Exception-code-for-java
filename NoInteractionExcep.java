import java.util.Scanner;

class NoInteractionException extends Exception {
    public NoInteractionException() {
        System.out.println("This Exception is occureed due to No-Interaction");
    }
}

class Trainer {
    public void askQuestuion(String quest, String ans) {
        try {
            if (ans.equals("null")) {
                System.out.println("Question:" + quest);
                System.out.println("Answer:" + ans);
                throw new NoInteractionException();
            } else {
                System.out.println("Question:" + quest);
                System.out.println("Answer:" + ans);
            }
        } catch (Exception e) {
            System.out.println("NoInteractionException");
        }
    }
}

public class NoInteractionExcep {
    public static void main(String[] args) {
        String q = "", a = "";
        Scanner sc = new Scanner(System.in);
        q = sc.nextLine();
        a = sc.nextLine();
        Trainer ob = new Trainer();
        ob.askQuestuion(q, a);
    }
}
