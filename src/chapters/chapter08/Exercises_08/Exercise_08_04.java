
package chapters.chapter08.Exercises_08;

public class Exercise_08_04 {
    public static void main(String[] args) {
        int[][] employeesWorkHours = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}
        };
        int[][] employeesTotalHours = getTotalHours(employeesWorkHours);
        int[][] sortedTotalHours = sort(employeesTotalHours);
        for (int i = 0; i < sortedTotalHours.length; i++) {
            System.out.println("Employee " + sortedTotalHours[i][1] + "'s total work hour is " + sortedTotalHours[i][0]);
        }
    }

    public static int[][] getTotalHours(int[][] workHours) {
        int[][] employeesTotalHours = new int[workHours.length][2];
        for (int i = 0; i < workHours.length; i++) {
            int totalHours = 0;
            for (int j = 0; j < workHours[i].length; j++) {
                totalHours += workHours[i][j];
            }
            employeesTotalHours[i][0] = totalHours;
            employeesTotalHours[i][1] = i;
        }


        return employeesTotalHours;
    }

    public static int[][] sort(int[][] totalHours) {
        for (int i = 0; i < totalHours.length - 1; i++) {
            for (int j = i + 1; j < totalHours.length; j++) {
                if (totalHours[i][0] < totalHours[j][0]) {
                    int[] temp = totalHours[i];
                    totalHours[i] = totalHours[j];
                    totalHours[j] = temp;

                }

            }
        }
        return totalHours;
    }
}
