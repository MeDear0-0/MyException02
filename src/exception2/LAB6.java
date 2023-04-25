package exception2;

public class LAB6 {
    public static void main(String[] args) {
        try {
            System.out.println(1/0);
        } catch (ArithmeticException e) {
//            e.printStackTrace();
//            System.out.println(e.getMessage());
//            System.out.println(e.toString());
            StackTraceElement[] stackTraceElement = e.getStackTrace();
            for (int i=0; i <stackTraceElement.length; i++) {
                System.out.println(stackTraceElement[i].getClassName());
                System.out.println(stackTraceElement[i].getMethodName());
                System.out.println(stackTraceElement[i].getFileName());
                System.out.println(stackTraceElement[i].getLineNumber());
            }
        }

    }
}
