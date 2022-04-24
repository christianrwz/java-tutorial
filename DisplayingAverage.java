import java.util.Scanner;
public class DisplayingAverage {
    public static void main(String args[]) {
      Scanner con = new Scanner(System.in);
        System.out.print("Enter prelim grade: ");
        double prelimgrade = con.nextDouble();
        System.out.print("Enter midterm grade: ");
        double midtermgrade = con.nextDouble();
        System.out.print("Enter prefinalgrade: ");
        double prefinalgrade = con.nextDouble();
        System.out.print("Enter finalgrade: ");
        double finalgrade = con.nextDouble();
        
        double average = (prelimgrade + midtermgrade + prefinalgrade + finalgrade) / 4;
        System.out.print("The Total average is: " + average);
        
        if(average <=74){
        	System.out.print("Remarks: FAILED!");
        }else{
        	System.out.print("Remarks: PASSED!");
        }
    }
}