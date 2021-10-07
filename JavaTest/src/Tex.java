public class Tex {
    public static void main(String[] args){
        Income[] incomes = new Income[]{
            new Income(2000),
            new Salary(1000),
            new StateCouncilSpecialAllowance(10000)
        };
        double ans=0;
        for(Income income:incomes){
            ans+=income.getTex();
        }
        System.out.println(ans);
    }
}
class Income {
    protected double income;
    public Income(double income){
        this.income = income;
    }
    public double getTex(){
        return this.income * 0.1;
    }
}
class Salary extends Income {
    public Salary(double income){
        super(income);
    }
    public double getTex(){
        if(this.income <= 5000)
            return 0;
        return (this.income - 5000) * 0.2;
    }
}
class StateCouncilSpecialAllowance extends Income {
    public StateCouncilSpecialAllowance(double income){
        super(income);
    }
    public double getTex(){
        return 0;
    }
}