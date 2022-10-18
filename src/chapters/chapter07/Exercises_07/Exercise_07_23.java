package chapters.chapter07.Exercises_07;

public class Exercise_07_23 {
    public static void main(String[] args) {
        boolean[] lockers = new boolean[100];

        for (int student = 0; student < lockers.length; student++) {
            for (int locker = student; locker < lockers.length; locker++) {
                if (student == 0) {
                    lockers[locker] = true;
                } else if (student == 1) {
                    lockers[locker] = false;

                } else {


                    if ((locker + 1) % (student + 1) == 0) {
                        if (lockers[locker]) {
                            lockers[locker] = false;
                        } else {
                            lockers[locker] = true;
                        }
                    }
                }

            }
            int count = 0;
            for (int i = 0; i < lockers.length; i++) {
                if (lockers[i]) {
                    count++;
                    System.out.print(count % 10 == 0 ? i + "\n" : i + " ");
                }


            }
        }
    }
}