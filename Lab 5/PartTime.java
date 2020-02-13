class PartTime extends Worker {
    private int hours_worked = 0;
    PartTime(String name,int hours_worked) {
        super(name,50);
        this.hours_worked = hours_worked;
    }
    PartTime(String name, double salary_rate,int hours_worked) {
        super(name,salary_rate);
        this.hours_worked = hours_worked;
    }
    @Override
    public double computePay() {
        if(hours_worked>60) {
            return 60*getsalary_rate();
        }
        return getsalary_rate()*hours_worked;
    }
}

class Test {
    public static void main(String[] args) {
        FullTimeWorker w1 = new FullTimeWorker("Sam", 20);
        System.out.println(w1.computePay());
    }
}