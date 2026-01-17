
class School{
    private String name;
    School(){
        name = "DPS";
    }

    void showSchoolName(){
        System.out.println("School name :" + name);
    }
}

class Students extends School{
    private String name;

    Students(String name){
        this.name = name;
    }

    void showStudentsName(){
        System.out.println("Student name : " + name);
    }
}

class Parents extends Students{
    private String name;
    Parents(String name, String studentName){
        super(studentName);
        this.name = name;
    }

    void showParentsName(){
        System.out.println("Parent name : " + name);
    }

}




public class Main {

    public static void main(String[] args){
        Parents parent1 = new Parents("John", "Harish");
        parent1.showParentsName();
        parent1.showStudentsName();
        parent1.showSchoolName();
    }  
}
