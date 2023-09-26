package day0823.生产者和消费者;

public class Producer implements  Runnable{
    public Box b;
    public Producer(Box b){
        this.b=b;
    }
    @Override
    public void run() {
        for (int i = 0; i <=30 ; i++) {
            b.put(i);

        }

    }
}
