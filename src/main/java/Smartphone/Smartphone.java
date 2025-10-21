package Smartphone;

public class Smartphone implements Cellular, GPS{

    double x,y,z;

    public Smartphone(double x,double y,double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }



    public void makeCall() {
        System.out.println("Calling");
    }

    public void receiveCall() {
        System.out.println("Incoming call");
    }

    public double[] getCoordinates() {
        return new double[]{x,y,z};
    }
}
