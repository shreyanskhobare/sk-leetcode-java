package com.sk.leetcode.java.medium;

/**
 * You are given an n x n integer matrix. You can do the following operation any number of times:
 *
 * Choose any two adjacent elements of matrix and multiply each of them by -1.
 * Two elements are considered adjacent if and only if they share a border.
 *
 * Your goal is to maximize the summation of the matrix's elements. Return the maximum sum of the matrix's elements using the operation mentioned above.
 *
 * Example 1:
 * Input: matrix = [[1,-1],[-1,1]]
 * Output: 4
 * Explanation: We can follow the following steps to reach sum equals 4:
 * - Multiply the 2 elements in the first row by -1.
 * - Multiply the 2 elements in the first column by -1.
 *
 *
 * Example 2:
 * Input: matrix = [[1,2,3],[-1,-2,-3],[1,2,3]]
 * Output: 16
 * Explanation: We can follow the following step to reach sum equals 16:
 * - Multiply the 2 last elements in the second row by -1.
 *
 * Constraints:
 *
 * n == matrix.length == matrix[i].length
 * 2 <= n <= 250
 * -105 <= matrix[i][j] <= 105
 */
public class MaximumMatrixSum {

    public long maxMatrixSum(int[][] matrix) {

        long response = 0L;
        int totalNegatives = 0;
        int smallestNumber = 10000000;

        for (int row=0; row < matrix.length; row++) {

            for (int column=0; column < matrix[row].length; column++) {

                if (smallestNumber > Math.abs(matrix[row][column])) {
                    smallestNumber = Math.abs(matrix[row][column]);
                }

                response += Math.abs(matrix[row][column]);

                // Ideally should've moved this to top and rather than using Math.abs everytimg, used just one.
                // OR better used updated for loop like in better solution.
                if (matrix[row][column] < 0) {
                    totalNegatives++;
                }

            }

        }

        if (totalNegatives%2 != 0) {
            // Odd negatives
            response -= (smallestNumber * 2);
        }

        return response;

    }


    public long betterSolution(int[][] matrix) {

        int n = matrix.length;

        int leastElement = 100001;
        long sum = 0L;
        int negativeCount = 0;

        for(int[] rows : matrix ){
            for(int value : rows){
                if(value < 0){
                    negativeCount++;
                    value = -value;
                }

                sum += value;
                if(value < leastElement){
                    leastElement = value;
                }

            }
        }

        return (negativeCount%2 == 0) ? sum : (sum - 2*leastElement);

    }

}
