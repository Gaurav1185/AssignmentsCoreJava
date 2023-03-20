package Practise.StringHandling.OOPS;

public class ClassLoading {
    public static void main(String[] args) throws ClassNotFoundException {
        ForNName forNName=new ForNName();
        Class.forName("Practise.StringHandling.OOPS.ForNName");
    }
}
