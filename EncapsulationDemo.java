class EncapsulationDemo{
    private int Aadhar;
    private String empName;
    private int empAge;

    //Getter and Setter methods
    public int getEmpAadhar(){
        return Aadhar;
    }

    public String getEmpName(){
        return empName;
    }

    public int getEmpAge(){
        return empAge;
    }

    public void setEmpAge(int newValue){
        empAge = newValue;
    }

    public void setEmpName(String newValue){
        empName = newValue;
    }

    public void setEmpAadhar(int newValue){
        Aadhar = newValue;
    }
}
public class EncapsTest{
    public static void main(String args[]){
         EncapsulationDemo obj = new EncapsulationDemo();
         obj.setEmpName("RAMU");
         obj.setEmpAge(32);
         obj.setEmpAadhar(112233);
         System.out.println("Employee Name: " + obj.getEmpName());
         System.out.println("Employee Aadhar: " + obj.getEmpAadhar());
         System.out.println("Employee Age: " + obj.getEmpAge());
    } 
}