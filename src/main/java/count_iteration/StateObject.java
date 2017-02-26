package count_iteration;

class StateObject {
    private int count;

    synchronized void increment(){
        count++;
    }

    int getI(){
        return count;
    }
}
