public class Console {
    public void log(Object... args) {
        for(Object arg: args) {
            System.out.println(arg);
        }
    }
    public void error(Object... args) {
        for(Object arg: args) {
            System.err.println(arg);
        }

        System.out.println(Thread.currentThread().getStackTrace()[2]);
    }
    public void clear() {
        System.out.print("\033\143");
    }
}