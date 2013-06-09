package patterns.criacao.objectPool;

public interface Pool<T> {
	public T acquire();
	public void release(T t);
}