// Differentiate between static and non-static methods in java. 

public class Question6_Mod2 {
    public static void main(String args[])
    { 
        add(23,34);
        Question6_Mod2 q1 = new Question6_Mod2();
        q1.product(20,21);
    }

    static void add(int a ,int b)
    {
        System.out.println("Addition Is = "+(a+b));
    }

    public void product(int a ,int b)
    {
        System.out.println("Multiplication Is = "+(a*b));
    }
}

// Static methods can be called by using class name or directly in the main method
// Non-Static methods can be called by using an object in the main method