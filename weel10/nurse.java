package weel10;



public class nurse extends Person
{
    private String shift;
    private double extraAllowance;
   
    public nurse(int id,String name,String shift,double extraAllowance)
    {
       super(id,name);
       this.shift=shift;
       this.extraAllowance=extraAllowance;
    }
    
    @Override//Polymorphism run time
    public double calculateSalary()
    {
       double baseFee=super.calculateSalary();
       double normalPayment=baseFee + this.extraAllowance;
       return normalPayment;
    }
    public void setShift(String newshift)
    {
        this.shift=newshift;
    }
    public String getShift()
    {
        return this.shift;
    }
    public void setAllowance(double Allowance)
    {
        this.extraAllowance=Allowance;
    }
    public double  getAllowance()
    {
        return this.extraAllowance;
    }
     public String toString(){
        return "Name:"+getName()+",Shift:"+this.shift;
    }
    
}