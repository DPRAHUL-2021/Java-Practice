/* Design a class to overload a method compare() to return the greater of two as follows:     
void compare(int, int) 
void compare(char, char)
void compare(String, String) */

class overload {
    void compareValues(int a, int b) {
        if (a > b) {
            System.out.println(a + " Is Greater Than " + b);
        } else {
            System.out.println(b + " Is Greater Than " + a);
        }
    }

    void compareValues(char a, char b) {
        // int a1 = (int) a;
        // int b1 = (int) b;
        if (a > b) {
            System.out.println(a + " Is Greater Than " + b);
        } else {
            System.out.println(b + " Is Greater Than " + a);
        }
    }

    void compareValues(String s1, String s2) {
        int result = s1.compareTo(s2);
        if(result>0)
        {
            System.out.println(s1+" Is Greater Than "+s2);
        }
        else
        {
            System.out.println(s2+" Is Greater Than "+s1);
        }
    }
}

public class Question3_Mod2 {
    public static void main(String args[]) {
        overload o1 = new overload();
        o1.compareValues(23,32);
        o1.compareValues('c','g');
        o1.compareValues("Rahul","Pranav");
    }
}
