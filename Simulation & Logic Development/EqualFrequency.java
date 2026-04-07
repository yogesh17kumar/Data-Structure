package SimulationLogicDevelopment;

import java.util.*;

public class EqualFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int count = 0;

        // Check condition
        for (int key : map.keySet()) {
            if (key == map.get(key)) {
                count++;
            }
        }

        System.out.println("Count = " + count);

        sc.close();
    }
}