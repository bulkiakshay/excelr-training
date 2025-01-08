import java.util.Scanner;

public class ps003 {

    private String name;
    private int wickets;
    private int matches;
    private int ballsBowled;
    private int runsConceded;

    public ps003() {
        this.name = "Unknown";
        this.wickets = 0;
        this.matches = 0;
        this.ballsBowled = 0;
        this.runsConceded = 0;
    }

    public ps003(String name, int wickets, int matches, int ballsBowled, int runsConceded) {
        this.name = name;
        this.wickets = wickets;
        this.matches = matches;
        this.ballsBowled = ballsBowled;
        this.runsConceded = runsConceded;
    }

    public void computeBowlingAverage() {
        if (wickets == 0) {
            System.out.println("Bowling average cannot be calculated as wickets are 0.");
        } else {
            double bowlingAverage = (double) runsConceded / wickets;
            System.out.println("Bowling Average of " + name + ": " + bowlingAverage);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter wickets: ");
        int wickets = scanner.nextInt();

        System.out.print("Enter matches: ");
        int matches = scanner.nextInt();

        System.out.print("Enter balls bowled: ");
        int ballsBowled = scanner.nextInt();

        System.out.print("Enter runs conceded: ");
        int runsConceded = scanner.nextInt();

        ps003 bowler = new ps003(name, wickets, matches, ballsBowled, runsConceded);

        System.out.println("Name: " + bowler.name);
        bowler.computeBowlingAverage();
        scanner.close();
    }
}