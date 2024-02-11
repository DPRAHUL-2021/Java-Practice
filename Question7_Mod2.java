// Illustrate the usage of ‘this’, ‘final’ and ‘finalize’ using a java program.

class VoteEligibility{
    int age;
    VoteEligibility(int age)
    {
        this.age = age;
    }
    void printEligibility(){
        if(age>=18)
        {
            System.out.println("You Are Eligible To Vote");
        }
        else
        {
            System.out.println("You Are Not Eligible To Vote");
        }
    }
}

// class finalUsage{
//     final double g = 9.8;
//     int u = 20,time = 6,a = 10;
//     g = 10;
// }


public class Question7_Mod2 {
    public static void main(String args[])
    {
        VoteEligibility v1 = new VoteEligibility(20);
        v1.printEligibility();
    }
}
