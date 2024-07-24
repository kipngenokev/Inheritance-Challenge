public class Worker {
    private String name;
    private String birthDate;

    protected String endDate;

    public Worker(){

    }
    public Worker(String name,String birthDate){
        this.name =name;
        this.birthDate=birthDate;
    }

    public int getAge(){
        int currentYear=2024;
        int age =currentYear-(Integer.parseInt(birthDate.substring(6)));
       return age;
    }

    public double collectPay(){
        int payCheck =0;
        return payCheck;
    }

    public void terminate (String endDate){
        this.endDate =endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
