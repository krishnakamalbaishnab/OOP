

class Passport{
    private String passportNumber;
    Passport(String passportNumber){
        this.passportNumber = passportNumber;
    }

    public String getPassportNumber(){
        return passportNumber;
    }
}


class Students{
    private String name;
    private Passport passport;

    Students(String name, Passport passport){
        this.name = name;
        this.passport = passport;
    }

    public void displayDetails(){
        System.out.println("Student name  : " + name);
        System.out.println("Passport number : " + passport.getPassportNumber());
    }
    
}
public class Main {
    public static void main(String[] args){
        Passport passport1 = new Passport("ED6582983F");
        Students students = new Students("Harish", passport1);
        students.displayDetails();

    }

    
}
