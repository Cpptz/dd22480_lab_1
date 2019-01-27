package main;

import java.util.Arrays;

class Main {
    static int dimension = 15;
    static int NOTUSED = 0;
    static int AND = 1;
    static int OR = 2;

    // inputs to decide
    static boolean[] PUV;
    static int NUM_POINTS;
    static Point[] POINTS;
    static int[][] LCM;
    // + the ones in LIC


    // variables needed
    static boolean[] CMV = new boolean[dimension];
    static boolean[] FUV = new boolean[dimension];
    static boolean[][] PUM = new boolean[dimension][dimension];


    /**
     * Inputs are static variable in {@link Main} and in {@link LIC}
     * They should be set before calling this function
     *
     * @return
     */
    public static boolean decide() {
         CMV[0] = LIC.LIC_0(POINTS, NUM_POINTS);
         CMV[1] = LIC.LIC_1(POINTS, NUM_POINTS);
//         CMV[2] = LIC.LIC_2(POINTS, NUM_POINTS);
         CMV[3] = LIC.LIC_3(POINTS, NUM_POINTS);
//         CMV[4] = LIC.LIC_4(POINTS, NUM_POINTS);
         CMV[5] = LIC.LIC_5(POINTS, NUM_POINTS);
         CMV[6] = LIC.LIC_6(POINTS, NUM_POINTS);
         CMV[7] = LIC.LIC_7(POINTS, NUM_POINTS);
         CMV[8] = LIC.LIC_8(POINTS, NUM_POINTS);
//         CMV[9] = LIC.LIC_9(POINTS, NUM_POINTS);
         CMV[10] = LIC.LIC_10(POINTS, NUM_POINTS);
         CMV[11] = LIC.LIC_11(POINTS, NUM_POINTS);
//         CMV[12] = LIC.LIC_12(POINTS, NUM_POINTS);
         CMV[13] = LIC.LIC_13(POINTS, NUM_POINTS);
         CMV[14] = LIC.LIC_14(POINTS, NUM_POINTS);


        // CMV + LCM => PUM
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if (i == j) continue;
                if (LCM[i][j] == NOTUSED)
                    PUM[i][j] = true;
                else if (LCM[i][j] == OR)
                    PUM[i][j] = CMV[i] || CMV[j];
                else if (LCM[i][j] == AND)
                    PUM[i][j] = CMV[i] && CMV[j];
            }
        }

        // PUM + PUV => FUV
        for (int i = 0; i < dimension; i++) {
            if (PUV[i] == false)
                FUV[i] = true;
            else {
                // base case
                FUV[i] = true;
                // if one is false, FUV[i] is false
                for (int j = 0; j < dimension; j++) {
                    if (i != j && PUM[i][j] == false){
                        FUV[i] = false;
                        break;
                    }

                }

            }

        }

        // Launch, FUV doesn't contain any false
        return !Arrays.asList(FUV).contains(false);
    }


    public static void main(String[] args) {

    }
}
