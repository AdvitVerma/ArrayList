package demoworker;

import content.Worker;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Advit
 */
public class DemoWorker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);

        ArrayList<Worker> workerList = new ArrayList<>();

        boolean isMore = true;

        while (isMore) {

            System.out.println("Enter 1 to process or any other to end :  ");

            if (k.nextInt() != 1) {

                isMore = false;

            } else {

                System.out.println("Enter a number");

                int number = k.nextInt();

                Worker one = new Worker(number);

                System.out.println("Enter Hours: ");

                int hours = k.nextInt();

                one.setHours(hours);

                System.out.println("Enter Rate: ");

                double rate = k.nextDouble();
                one.setRate(rate);
                
                System.out.println("Emp ID: " + one.getNumber()
                        + "|| " + "Your Pay is: "
                        + one.getPay());
                
                workerList.add(one);

            }
            
            
            for(int sub=0; sub<workerList.size();sub++){
            
            
                Worker two =workerList.get(sub);
                System.out.println("Hi Worker: "+two.getNumber()+"Your salary is : "+two.getPay());
            }

        }

    }

}
