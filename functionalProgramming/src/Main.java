import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        Summable obj = (x, y) ->{
            return ((x + y) % 2) == 0;
        };
        System.out.println(obj.evenSum(2,5));
    }
}