public class Logger {
    private String format;
    public String getFormat() {
        return this.format;
    }
    public void setFormat(String format) {
        this.format = format;
    }
    public static void main(String [] args){
        Logger lg=new Logger();
        lg.setFormat("int");
        System.out.println(lg.getFormat());
        lg.setFormat("char");
        System.out.println(lg.getFormat());
    }
}