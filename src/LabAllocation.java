import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LabAllocation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int n = scanner.nextInt();

        String allocatedLab = allocateLab(x, y, z, n);
        System.out.println(allocatedLab);

        scanner.close();
    }

    public static String allocateLab(int x, int y, int z, int n) {
        Map<String, Integer> labs = new HashMap<>();
        labs.put("L1", x);
        labs.put("L2", y);
        labs.put("L3", z);

        String[] labOrder = {"L1", "L2", "L3"};

        for (String lab : labOrder) {
            if (labs.get(lab) >= n) {
                return lab;
            }
        }

        return null;
    }
}
