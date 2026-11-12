package singleton_pattern;
/* 
Cons of Singleton 
    1. Violates Single Responsibility Principle
    2. Difficult to test
    3. Not suitable for multithreaded applications without proper synchronization 
*/

public class Singleton{ // can use final class to prevent inheritance
    private static Singleton instance;
    private Singleton(){
    }

    public static Singleton getInstance(){ // can use synchronized to make it thread-safe
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

