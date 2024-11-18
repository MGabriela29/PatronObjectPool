package gabriela.ipd.objectpool.impl.poolable;

/**
 *
 * @author Gaby
 */
public interface IPooledObject {
    public boolean validate();
    public void invalidate();
}
