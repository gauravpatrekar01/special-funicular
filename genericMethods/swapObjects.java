public class swapObjects {

    static class Person {
        String name;
        int marks;

        Person(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }
    }

    public static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        Person p1 = new Person("John", 90);
        Person p2 = new Person("Jane", 80);

        Person[] people = {p1, p2};

        System.out.println("Before swapping:");
        System.out.println("p1: " + people[0].name + ", " + people[0].marks);
        System.out.println("p2: " + people[1].name + ", " + people[1].marks);

        swap(people, 0, 1);

        System.out.println("After swapping:");
        System.out.println("p1: " + people[0].name + ", " + people[0].marks);
        System.out.println("p2: " + people[1].name + ", " + people[1].marks);
    }
}