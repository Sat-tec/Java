public class GenericMethod {
    public static void main(String[] args) {
        printdata("Go");
        printdata(123);
        
        //bounded generics
        bounded(123);
    }

    static <E> void printdata(E data) {
        System.out.println(data);
    }

    static <E extends Number> void bounded(E data) {
        System.out.println(data);
    }

}

