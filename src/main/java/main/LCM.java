package main;

public class LCM {
    static int NOTUSED = 0;
    static int AND = 1;
    static int OR = 2;

    static int[][] matrix =
            {
                    {AND, AND, OR, AND, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED,
                            NOTUSED, NOTUSED, NOTUSED},
                    {AND, AND, OR, OR, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED,
                            NOTUSED, NOTUSED, NOTUSED},
                    {OR, OR, AND, AND, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED,
                            NOTUSED, NOTUSED, NOTUSED},
                    {AND, OR, AND, AND, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED,
                            NOTUSED, NOTUSED, NOTUSED},
                    {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED,
                            NOTUSED, NOTUSED,
                            NOTUSED, NOTUSED, NOTUSED},
                    {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED,
                            NOTUSED, NOTUSED,
                            NOTUSED, NOTUSED, NOTUSED},
                    {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED,
                            NOTUSED, NOTUSED,
                            NOTUSED, NOTUSED, NOTUSED},
                    {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED,
                            NOTUSED, NOTUSED,
                            NOTUSED, NOTUSED, NOTUSED},
                    {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED,
                            NOTUSED, NOTUSED,
                            NOTUSED, NOTUSED, NOTUSED},
                    {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED,
                            NOTUSED, NOTUSED,
                            NOTUSED, NOTUSED, NOTUSED},
                    {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED,
                            NOTUSED, NOTUSED,
                            NOTUSED, NOTUSED, NOTUSED},
                    {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED,
                            NOTUSED, NOTUSED,
                            NOTUSED, NOTUSED, NOTUSED},
                    {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED,
                            NOTUSED, NOTUSED,
                            NOTUSED, NOTUSED, NOTUSED},
                    {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED,
                            NOTUSED, NOTUSED,
                            NOTUSED, NOTUSED, NOTUSED},
                    {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED,
                            NOTUSED, NOTUSED,
                            NOTUSED, NOTUSED, NOTUSED},

            };


    public static void main(String[] args) {
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                System.out.print(LCM.matrix[i][j]+"\t");

            }
            System.out.println();

        }
    }
}


