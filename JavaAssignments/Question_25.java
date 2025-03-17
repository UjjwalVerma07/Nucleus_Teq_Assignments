class MyThread extends Thread {  
    private String threadName;  
    MyThread(String name) {  
        threadName = name;  
    }   
    public void run() {  
        for (int i = 1; i <= 5; i++) {  
            System.out.println(threadName + " - Count: " + i);  
            try {   
                Thread.sleep(1000);  
            } catch (InterruptedException e) {  
                System.out.println(threadName + " interrupted.");  
            }  
        }  
        System.out.println(threadName + " finished.");  
    }  
} 
public class Question_25 {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread 1");  
        MyThread thread2 = new MyThread("Thread 2");  
        MyThread thread3 = new MyThread("Thread 3");    
        thread1.start();  
        thread2.start();  
        thread3.start();   
        try {  
            thread1.join();  
            thread2.join();  
            thread3.join();  
        } catch (InterruptedException e) {  
            System.out.println("Main thread interrupted.");  
        }  
        System.out.println("All threads have finished.");  
    }
}
