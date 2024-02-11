// Read  the  command  line  arguments  and  print  the  total  number  of  arguments  and its values.

public class Question11_Mod2 {
    public static void main(String args[])
    {
        int totalArguments = args.length;
        System.out.println("The Total Number Of Arguments Are : "+totalArguments);
        for(int i=0;i<totalArguments;i++)
        {
            System.out.println("Argument No."+(i+1)+" = "+args[i]);
        }
    }
}
