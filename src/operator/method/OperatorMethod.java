/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operator.method;

/**
 *
 * @author Class
 */
public class OperatorMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Initialize test scores
        int testScore1 = 90;
        int testScore2 = 90;
        int testScore3 = 89;

        // Display next test scores, one per line
        System.out.println("The score for test 1 is " + testScore1);
        System.out.println("The score for test 2 is " + testScore2);
        System.out.println("The score for test 3 is " + testScore3);
        
        int sum = (testScore1 + testScore2 + testScore3);
        
        System.out.println("The sum of the test scores are " + sum);

        double average = (testScore1 + testScore2 + testScore3) / 3.0;

        System.out.println("The average test score is " + average);

    }

}
