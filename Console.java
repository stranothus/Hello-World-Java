public class Console {
    public void log(String... args) {
        for(String arg: args) {
            System.out.println(arg);
        }
    }
}