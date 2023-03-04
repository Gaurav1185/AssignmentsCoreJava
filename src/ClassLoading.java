public class ClassLoading {
    public static void main(String[] args) throws ClassNotFoundException {
        ForNName forNName=new ForNName();
        Class.forName("ForNName");
    }
}
