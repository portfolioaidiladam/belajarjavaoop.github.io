package programmer.zama.now.application;
// belajar StackTraceElementClass error handling bertingkat lebih detail
public class StackTraceApp {
    public static void main(String[] args) {
        try {
            sampleError();
            } catch (RuntimeException exception){
              exception.printStackTrace();
        }

    }
    public static void sampleError(){
        try {
            String [] names = {
                    "Aidil", "Adam", "Baik"
            };
            System.out.println(names[100]);
        }
        catch (Throwable throwable){
            throw new RuntimeException(throwable);
        }
    }
}
