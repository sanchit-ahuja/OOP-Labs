/**
 * FullTimeWorker
 */
public class FullTimeWorker extends Worker {

    private int hours_worked = 0;
    FullTimeWorker(String name,int hours_worked) {
        super(name,100);
        this.hours_worked = hours_worked;
    }
    FullTimeWorker(String name,double salary_rate,int hours_worked) {
        super(name,salary_rate);
        this.hours_worked = hours_worked;
    }
    @Override
    public double computePay() {
        if(hours_worked<=240) {
            return hours_worked*getsalary_rate();
        }
        return 240*getsalary_rate();
    }
}