// Write a java program to overload the constructors.

class Iphone {
    int storage , camerapixels;
    
    Iphone()
    {
        storage = 128;
        camerapixels = 48;
    }
    Iphone(int size , int cameraclarity)
    {
        storage = size;
        camerapixels = cameraclarity;
    } 
}

public class Question10_Mod2 {
    public static void main(String args[])
    {
        Iphone i1 = new Iphone();
        System.out.println("The Storage Value From Default Constructor Is : "+i1.storage+"GB");
        System.out.println("The Camera Pixels Value From Default Constructor Is : "+i1.camerapixels+"MP");
        Iphone i2 = new Iphone(256,128);
        System.out.println("The Storage Value From Parametrical Constructor Is "+i2.storage+"GB");
        System.out.println("The Camera Pixels Value From Parametrical Constructor Is "+i2.camerapixels+"MP");
    }   
}
