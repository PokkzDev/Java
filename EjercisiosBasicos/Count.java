package EjercisiosBasicos;
public class Count {
    int start = 0;
    int end = 10;

    public static void main(String[] args){
        Count obj = new Count();

        for(int i = obj.start; i <= obj.end; i++){
            if( i % 2 == 0 ){
                System.out.println(i);  
            }
            
        }

    }
}
