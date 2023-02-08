public class Task4 {
        public static void main(String[] args) {
        toByte();
        toShort();
        toInt();
        toLong();
        toFloat();
    }
    static void toByte() {
        byte a = 127;
        short b = (short) a;
        int c = (int) a;
        long d = (long) a;
        float e = (float) a;
        double f = (double) a;
        char g = (char) a;
        System.out.println("byte="+a+";short="+b+";int="+c+";long="+d+";float="+e+";double="+f+"; char="+g+"");
        }
    static void toShort() {
        short a = 1000;
        int b = (int) a;
        long c = (long) a;
        float d = (float) a;
        double e = (double) a;
        byte f = (byte) a;
        char g = (char) a;
        System.out.println("short="+a+";int="+b+";long="+c+";float="+d+";double="+e+";byte="+f+";char="+g+"");
    }
    static void toInt() {
        int a = 500000;
        long b = (long) a;
        float c = (float) a;
        double d = (double) a;
        short e = (short) a;
        byte f = (byte) a;
        char g = (char) a;
        System.out.println("int="+a+";long="+b+";float="+c+";double="+d+";short="+e+";byte="+f+";char="+g+"");
}
    static void toLong() {
        long a = 848;
        float b = (float) a;
        double c = (double) a;
        int d = (int) a;
        short e = (short) a;
        byte f = (byte) a;
        char g = (char) a;
        System.out.println("long="+a+";float="+b+";double="+c+";int="+d+";short="+e+";byte="+f+";char="+g+"");
    }
    static void toFloat() {
        float a = 49.7f;
        long b = (long) a;
        double c = (double) a;
        int d = (int) a;
        short e = (short) a;
        byte f = (byte) a;
        char g = (char) a;
        System.out.println("long="+a+";double="+b+";double="+c+";int="+d+";short="+e+";byte="+f+";char="+g+"");
    }
}