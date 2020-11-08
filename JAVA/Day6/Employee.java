public class Employee {
    // 멤버변수
    private String name;
    private int number;
    private String dept;

    // 생성자
    public Employee(String name, int number, String dept){
        this.name = name;
        this.number = number;
        this.dept = dept;
    }

    // 메서드
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public String getDept(){
        return dept;
    }
    public void setDept(String dept){
        this.dept = dept;
    }
}
