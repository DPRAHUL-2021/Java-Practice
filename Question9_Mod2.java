// How to pass the variable length arguments in java, illustrate with an example program. 

public class Question9_Mod2 {
    public static void main(String args[]) {
        variableLengthArgs("Pranav","Rahul","Virat","Rohit","Dhoni");
        variableLengthArgs("Messi","Ronaldo","Neymar");
        variableLengthArgs("Sachin");
    }

    public static void variableLengthArgs(String... strings){
        System.out.println("\nVariable Arguments\n");
        for(String str : strings)
        {
            System.out.println("Hello "+str+", How Are You?");
        }
    }
}
