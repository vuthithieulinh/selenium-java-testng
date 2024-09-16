package javaTester;

public class Topic_02_Primitive_Reference {
    int x;

    public static void main(String[] args) {
        //Primitive
        int x = 42;
        int y = x;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        x=50;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        //Reference
        //Class
        // Instance 1
        Topic_02_Primitive_Reference c = new Topic_02_Primitive_Reference();
        c.x=42;
        System.out.println(c.x);

        //Instance 2
        Topic_02_Primitive_Reference d=c;
        System.out.println(d.x);

        c.x=200;
        System.out.println(c.x);
        System.out.println(d.x);

        //
        Topic_02_Primitive_Reference e = new Topic_02_Primitive_Reference();
        System.out.println(c.x);
        System.out.println(d.x);
        System.out.println(e.x);
    }
}
