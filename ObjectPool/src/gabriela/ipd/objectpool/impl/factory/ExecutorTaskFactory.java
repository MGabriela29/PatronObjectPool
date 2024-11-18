package gabriela.ipd.objectpool.impl.factory;

import gabriela.ipd.objectpool.impl.poolable.ExecutorTask;
/**
 * @author Gaby
 */

public class ExecutorTaskFactory implements IPoolableObjectFactory<ExecutorTask>{
     public ExecutorTask createNew(){
        return new ExecutorTask();
    }
}
