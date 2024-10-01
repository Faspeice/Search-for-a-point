import java.util.Random;
public class Main {
    public static double calculate_distance(int[] first_point, int[] second_point)
    {
        double distance;
        distance = Math.sqrt(Math.pow(first_point[0] - second_point[0], 2) + Math.pow(first_point[1] - second_point[1], 2));
        return distance;
    };
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] points = new int[40][2];
        for (int i = 1; i < 40; i++) {
            points[i][0] = rand.nextInt(-100,100);
            points[i][1] = rand.nextInt(-100,100);
            System.out.println("Point " + (i+1) + " (" + points[i][0] +", " + points[i][1] + ")\n");
            System.out.println(calculate_distance(points[i], points[i-1]));
        }
    }
}
