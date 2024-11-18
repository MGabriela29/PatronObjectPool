package gabriela.ipd.objectpool;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import gabriela.ipd.objectpool.impl.poolable.ExecutorTask;
import gabriela.ipd.objectpool.impl.factory.ExecutorTaskFactory;
import gabriela.ipd.objectpool.impl.ExecutorThreadPool;
import gabriela.ipd.objectpool.impl.PoolException;
/**
 *
 * @author Gaby
 */
public class ObjectPoolMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        final ExecutorThreadPool pool = new ExecutorThreadPool(2, 6, 1000*100, new ExecutorTaskFactory());

        for (int c = 0; c < 10; c++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        ExecutorTask task = pool.getObject();
                        task.execute();
                        pool.releaceObject(task);
                    } catch (PoolException e) {
                        System.out.println("Error ==> " + e.getMessage());
                        e.printStackTrace();
                    }
                }
            }).start();
        }
        
        try {
            System.in.read();
            System.out.println(pool);
        } catch (Exception e) {
            System.out.println("Out disponible");
        }
        
    }
    
}

