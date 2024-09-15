import java.util.Scanner;

class IdenticalArrays{
    public static void main(String[] args){
        int m1[][] = new int[3][3];
        int m2[][] = new int[3][3];

        System.out.println("Enter list 1: ");

        Scanner scanner = new Scanner(System.in);

        //loop through array to set each index to user input i = index of outside array, j = index of inner array
        for(int i = 0; i < m1.length; i++){
            for(int j = 0; j < m1[i].length; j++){
                m1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter list 2: ");
        //do same as above for list 2
        for(int i = 0; i < m2.length; i++){
            for(int j = 0; j < m2[i].length; j++){
                m2[i][j] = scanner.nextInt();
            }
        }

        if (equals(m1, m2)){
            System.out.println("The two arrays are identical");
        }
        else{
            System.out.println("The two arrays are not identical");
        }

        scanner.close();

    }
        public static boolean equals(int[][] m1, int[][] m2){
            for(int i = 0; i < m1.length; i++ ){
                for(int j = 0; j < m1[i].length; j++){
                    if(m1[i][j] != m2[i][j]){
                        return false;
                    }
                }
            }
            return true;
        }

}
