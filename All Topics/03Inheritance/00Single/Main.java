

class School{
    private String name;
    School(){
        name = "DPS";
    }
    void showSchoolName(){
        System.out.println("School name is : " + name);
    }
}


class Students extends School{
    private String name;
    Students(String name){
        this.name = name;
    }
    void showStudentsName(){
        System.out.println("Student name is : " + name);
    }
}

public class Main {
    public static void main(String[] args){
        Students student1 = new Students("Hero");
        student1.showStudentsName();
        student1.showSchoolName();

    }
    
}
