package singleton;

public class ThreadSafeInitialization {

	private static ThreadSafeInitialization instance;

	private ThreadSafeInitialization() {
	}

	public static ThreadSafeInitialization getInstanceUsingDoubleLocking() {
		if (instance == null) {
			synchronized (ThreadSafeInitialization.class) {
				if (instance == null) {
					instance = new ThreadSafeInitialization();
				}
			}
		}
		return instance;
	}

}
