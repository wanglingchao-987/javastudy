package day0823.生产者和消费者;

public class Customer implements  Runnable{
    private  Box b;
    public Customer(Box b){
        this.b=b;
    }

    @Override
    public void run() {
        while (true){
            b.get();
        }

    }
}
