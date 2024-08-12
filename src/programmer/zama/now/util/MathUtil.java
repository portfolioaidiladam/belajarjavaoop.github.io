package programmer.zama.now.util;

// belajar static Keyword (ini static method )
public class MathUtil {
    public static int sum (int... values){
        int total = 0;
        for (var value : values){
            total += value;

        }
        return total;
    }

}
