package stacks;

public class CallStack{

    public static void main(String[] args) {

        System.out.println("chamando metodo main");
        
        int number = 10;
        System.out.println(number);

        method01(number);

        System.out.println("executando metodo main");
    }

    public static void method01 (int number) {

        System.out.println("chamando metodo method01");
        
        int sum = number + 1;
        System.out.println(sum);

        method02(sum);

        System.out.println("encerrando metodo method01");
    }

    public static void method02 (int number) {

        System.out.println("chamando metodo method02");

        int sum = number + 1;
        System.out.println(sum);

        method03(sum);

        System.out.println("encerrando metodo method02");
    }

    public static void method03 (int number) {

        System.out.println("chamando metodo method03");

        int sum = number + 1;
        
        System.out.println(sum);

        

        System.out.println("encerrando metodo method03");
    }
}