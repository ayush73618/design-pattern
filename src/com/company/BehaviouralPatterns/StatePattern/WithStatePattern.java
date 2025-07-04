package com.company.BehaviouralPatterns.StatePattern;

interface TransportationModeII{
    int calcETA();
    String getDirection();
}

class Walking implements TransportationModeII{

    @Override
    public int calcETA() {
        System.out.println("Calculating ETA for (Walking)");
        return 10;
    }

    @Override
    public String getDirection() {

        return "Head North for 2.6 KM then turn left";
    }
}


class Cycling implements TransportationModeII{

    @Override
    public int calcETA() {
        System.out.println("Calculating ETA for (Cycling)");
        return 7;
    }

    @Override
    public String getDirection() {
        return "Head South for 2.6 KM then turn right";
    }
}

class DirectionServiceII{
    private TransportationModeII transportationModeII ;

    public DirectionServiceII(TransportationModeII transportationModeII){
        this.transportationModeII = transportationModeII;
    }

    public void  setTransportationModeII(TransportationModeII transportationModeII){
        this.transportationModeII = transportationModeII;
    }

    //Delegating the work to the Concrete Class
    public int getETA(){
        return transportationModeII.calcETA();
    }

    public String getDirection(){
        return transportationModeII.getDirection();
    }

}


public class WithStatePattern {
    public static void main(String[] args) {
        DirectionServiceII directionServiceII = new DirectionServiceII(new Walking());

//        System.out.println(directionServiceII.getETA());
//        System.out.println(directionServiceII.getDirection());
        directionServiceII.setTransportationModeII(new Cycling());

        System.out.println(directionServiceII.getETA());
        System.out.println(directionServiceII.getDirection());
    }
}


class Singleton{


    private static class InnerSingleton{
        private static  Singleton singleton = new Singleton();
    }

  public Singleton getInstance(){
        return InnerSingleton.singleton;

    }
}