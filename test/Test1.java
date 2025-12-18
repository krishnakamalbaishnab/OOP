class Rectangle{
    int length, width;

    void getData(int length, int width){
        this.length = length;
        this.width = width;
    }

    int area(){
        int area = length * width;
        return area;
    }

}



public class Test1 {
    public static void main(String[] args){


    Rectangle rec1 = new Rectangle();
    rec1.getData(5,6);

    System.out.println("The area is: " + rec1.area());
    }
    
}
