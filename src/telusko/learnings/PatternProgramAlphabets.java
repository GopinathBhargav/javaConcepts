package telusko.learnings;

public class PatternProgramAlphabets {

    public static void main(String[] args) {


        int n = 13;

        // LETTER S
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (i == 0 || i == (n) / 2 || i == n - 1) {
                    System.out.print("*");
                } else if (i < (n) / 2 && j == 0) {
                    System.out.print("*");
                } else if (i > (n) / 2 && j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("   ");

            // LETTER B
                for (int j = 0; j < n; j++) {

                    if (j == 0 || (i == 0 && j < (n - 1)/2)
                               || (i == (n - 1) / 2 && j < (n - 1)/2)
                               || (i == n - 1 && j < (n - 1)/2)
                               || (j== (n-1)/2 && i!=0 && i!= (n-1)/2 && i!= n-1)){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

            System.out.print("   ");


            // LETTER Q
            for (int j = 0; j < n; j++) {

                if ( (i == 0  && j>(n-1)/4 && j<3*n/4)
                        || (j == (n-1)/4 && i>0 && i<(3*n)/4)
                        || (j==3*n/4 && i > 0 && i< 3*n/4)
                        || (i==3*n/4 && j > (n-1)/4 && j< 3*n/4)
                        || (i==j && i>= (n-1)/2)){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("   ");


                System.out.println();
            }

    }
}
