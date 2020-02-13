abstract class Worker {
    private String name;
    private double salary_rate;
    Worker(String name,double salary_rate) {
        this.name = name;
        this.salary_rate = salary_rate;
    }
    abstract public double computePay() ;
    public String getname() {
        return this.name;
    }
    public double getsalary_rate() {
        return this.salary_rate;
    }
}