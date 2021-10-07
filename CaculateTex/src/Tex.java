public class Tex {
    public static void main(String[] args){
        CalculateTex[] incomes = new CalculateTex[]{
                new IncomeTex(114514),
                new SalaryTex(1919810)
        };
        double tot = 0;
        for(CalculateTex income : incomes){
            tot+=income.getTex();
        }
        System.out.println(tot);
    }
}
abstract class CalculateTex {
    protected double income;
    abstract double getTex();
    public CalculateTex(double income){
        this.income = income;
    }
}
class SalaryTex extends CalculateTex{
    public SalaryTex (double income){
        super(income);
    }
    public double getTex(){
        return this.income * 0.1;
    }
}
class IncomeTex extends CalculateTex{
    public IncomeTex (double income){
        super(income);
    }
    public double getTex(){
        if(this.income>5000)return this.income * 0.2;
        return 0;
    }
}