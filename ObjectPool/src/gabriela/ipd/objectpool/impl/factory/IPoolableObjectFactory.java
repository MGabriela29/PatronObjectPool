package gabriela.ipd.objectpool.impl.factory;

import gabriela.ipd.objectpool.impl.poolable.IPooledObject;
/**
 * @author Gaby
 */
public interface IPoolableObjectFactory<T extends IPooledObject> {
     public T createNew();
}
