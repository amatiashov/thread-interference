package count_iteration;


public class Main {
    public static void main(String[] args) {

        StateObject stateObject = new StateObject();

        TestClass testClassObject = new TestClass(stateObject);

        Thread thread1 = new Thread(testClassObject);
        Thread thread2 = new Thread(testClassObject);
        Thread thread3 = new Thread(testClassObject);
        Thread thread4 = new Thread(testClassObject);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        System.out.println(stateObject.getI());
    }

}
