public class BiggerSmaller{
    // Numeros a Evaluar
    int numero_1 = 20;
    int numero_2 = 35;

    public static void main(String[] args){
        BiggerSmaller obj = new BiggerSmaller();
        System.out.println("Comparando " + obj.numero_1 + " con " + obj.numero_2);
        if(obj.numero_1 > obj.numero_2){
            System.out.println("El primer numero es mayor");
            System.out.println("El primer numero es mayor por: " + (obj.numero_1 - obj.numero_2));
        } else if(obj.numero_1 < obj.numero_2) {
            System.out.println("El Segundo numero es mayor.");
            System.out.println("El primer numero es menor por: " + (obj.numero_2 - obj.numero_1));
        } else {
            System.out.println("Los numeros son iguales.");
        }
    }

}