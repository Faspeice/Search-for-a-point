import java.util.Random;
public class Main {
    public static double calculateDistance(int[] firstPoint, int[] secondPoint)
    {
        return Math.sqrt(Math.pow(firstPoint[0] - secondPoint[0], 2) + Math.pow(firstPoint[1] - secondPoint[1], 2));
    };
    public static void main(String[] args) {
        Random rand = new Random();
        int n = 40;
        int[] minPoint = new int[2];
        double minDistanceSum = Double.POSITIVE_INFINITY, distanceSum = 0;
        int[][] points = new int[n][2];
        for (int i = 0; i < n; i++) {
            points[i][0] = rand.nextInt(-10,10);
            points[i][1] = rand.nextInt(-10,10);
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                distanceSum += calculateDistance(points[i], points[j]);

        }
            System.out.println("Point " + (i+1) + " (" + points[i][0] +", " + points[i][1] + ")");
            System.out.println(distanceSum);
            if(distanceSum<minDistanceSum){
                minDistanceSum = distanceSum;
                minPoint[0] = points[i][0];
                minPoint[1] = points[i][1];
            }
            distanceSum = 0;
        }
        System.out.println("\n" + "(" + minPoint[0] +", " + minPoint[1] + ") " + minDistanceSum);
    }
}
