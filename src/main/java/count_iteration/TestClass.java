package count_iteration;

public class TestClass implements Runnable{

    private StateObject stateObject;

    TestClass(StateObject stateObject){
        this.stateObject = stateObject;
    }

    private void doWork() {
        stateObject.increment();
    }

    @Override
    public void run() {
        doWork();
    }
}

