package genericMethods;

public class VarargsMethods {
    static void VarargsMethod(int...v) {
        System.out.println("Number of arguments: " + v.length);
        System.out.println("Arguments: ");
        for (int i : v) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        VarargsMethod(9);
        VarargsMethod(1,-2,3,-4);
        VarargsMethod();
    }
}