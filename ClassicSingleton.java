public class ClassicSingleton {
	
	private static ClassicSingleton instance = null;
	private classicSingleton(){
		// Exists only to defeat instantiation.
	}
	public static ClassicSingleton getInstance(){
		if(instance == null){
			instance = new ClassicSingleton();
		}
		return instance;
}}

/* This technique ensures that singleton classes are 
 * created only when needed 
 */