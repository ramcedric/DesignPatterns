package singleton;

public class Main {
    public static void main(String[] args) {
        RandomObject obj1 = RandomObject.createOrRetrieveInstance("Test");
        System.out.println(obj1);
        RandomObject obj2 = RandomObject.createOrRetrieveInstance("Test2");
        System.out.println(obj2);
    }
}