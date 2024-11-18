package gabriela.ipd.objectpool.impl;
import gabriela.ipd.objectpool.impl.poolable.IPooledObject;

/**
 *
 * @author Gaby
 */
public interface IObjectPool<T extends IPooledObject> {
     public T getObject() throws PoolException;
    public void releaceObject(T pooledObject);
}
