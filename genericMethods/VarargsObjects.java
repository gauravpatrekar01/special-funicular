public class VarargsObjects {

    public static void varargsMethod(Object... v) {

        for (Object obj : v) {
            System.out.println(obj);
        }

        System.out.println();
    }

    public static void main(String[] args) {

        varargsMethod("Hello", 42, 3.14, true);

        varargsMethod(1, 2, 3, 4, 5);

        varargsMethod();
    }
}