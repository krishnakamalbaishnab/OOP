
class Perimeter{
    int length, width;


    Perimeter(){
        length = 0;
        width = 0;
    }

    Perimeter(int length, int width){
        this.length = length;
        this.width = width;
    }


    int calPeri(){
        return 2*(length+width);
        
    }
}





public class Test3 {

    public static void main(String[] args){

        Perimeter peri1 = new Perimeter(5,6);

        System.out.println(peri1.calPeri());
    }
    
}
