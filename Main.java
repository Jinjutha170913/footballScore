import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ScoreTeam1 obj1 = new ScoreTeam1();
        ScoreTeam2 obj2 = new ScoreTeam2();
        HeadQuater obj = new HeadQuater();

        obj.register(obj1);
        obj.register(obj2);

        while (true) {
            System.out.print("Enter Score ");
            String score = sc.nextLine();
            if (score.equals("")) {
                break;
            } else {
                obj.setSomeData(score);
            }
        }
    }
}