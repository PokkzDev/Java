package EjercisiosBasicos;
public class EvenOrOdd {
    int number = 10;

    public static void main(String[] args){
        EvenOrOdd obj = new EvenOrOdd();
        if(obj.number % 2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
