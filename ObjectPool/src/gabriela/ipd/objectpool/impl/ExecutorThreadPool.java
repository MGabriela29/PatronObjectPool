package gabriela.ipd.objectpool.impl;

import gabriela.ipd.objectpool.impl.poolable.ExecutorTask;
import gabriela.ipd.objectpool.impl.factory.IPoolableObjectFactory;
/**
 *
 * @author Gaby
 */
public class ExecutorThreadPool extends AbstractObjectPool<ExecutorTask>{

    public ExecutorThreadPool(int minInstances, int maxInstances, int waitTime, 
            IPoolableObjectFactory<ExecutorTask> poolableObjectFactory) {
        super(minInstances, maxInstances, waitTime, poolableObjectFactory);
    }
}
