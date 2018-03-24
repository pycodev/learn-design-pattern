package me.pycode.learn._5.Singleton;

public class Singleton {
    public static volatile Singleton uniqueInstance;

    private Singleton() {
    }

    /**
     * 同步整个方法会有损效率，因为只有第一次才需要加锁
     * @return
     */
//    public static synchronized Singleton newInstance() {
//        if (uniqueInstance == null) {
//            uniqueInstance = new Singleton();
//        }
//        return uniqueInstance;
//    }

    /**
     *  此方法需java_vsersion>1.4
     * @return
     */
    public static Singleton newInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                uniqueInstance = new Singleton();
            }
        }
        return uniqueInstance;
    }
}
