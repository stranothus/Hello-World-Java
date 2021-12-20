public class Console {
    public void log(String... args) {
        for(String arg: args) {
            System.out.println(arg);
        }
    }
    public void error(String... args) {
        for(String arg: args) {
            System.err.println(arg);
        }
        
        System.out.println(Thread.currentThread().getStackTrace()[2]);
    }
}