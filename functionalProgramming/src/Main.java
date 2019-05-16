
public class Main {

    public static void main(String[] args) {
        Summable obj = (x, y) ->{
            return ((x + y) % 2) == 0;
        };
        //lamda can be used to threads and all the other
        //single method interfaces.
        Runnable x = () -> print("Hello there");
        x.run();
        System.out.println(obj.evenSum(2,5));



    }
    private static void print(String text){
        System.out.println(text);
    }
}
