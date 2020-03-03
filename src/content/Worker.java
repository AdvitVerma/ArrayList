
package content;

/**
 *
 * @author Advit
 */
public class Worker {
    

private int number;
private int hours=40;
private double rate;
private double pay;

public Worker(int number){
    this.number=number;
}

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    
    public void setRate(double rate) {
        this.rate = rate;
    }
   
    
    private  void CalculatePay(){
    
    this.pay=this.rate*this.hours;
    
    }
     public double getPay() {
        CalculatePay();
        return pay;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }



}
