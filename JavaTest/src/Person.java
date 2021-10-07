public class Person {
    public static void main(String[] args){
        Student Ming = new Student("Xiao Ming",18,100);
        System.out.println(Ming.getScore());
    }
}

class Man {
    protected String name;
    protected int age;
    public Man(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}
class Student extends Man {
    protected int score;
    public Student(String name,int age,int score){
        super(name,age);
        this.score = score;
    }
    public int getScore(){
        return this.score;
    }
}
class primaryStudent extends Student{
    protected int grade;
    public primaryStudent(String name,int age,int score,int grade){
        super(name,age,score);
        this.grade = grade;
    }
    public int getGrade(){
        return this.grade;
    }
}