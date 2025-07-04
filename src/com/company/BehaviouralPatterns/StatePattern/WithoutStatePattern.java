package com.company.BehaviouralPatterns.StatePattern;


enum TransportationMode{
    WALKING,CYCLING,CAR,TRAIN;
}

class DirectionService{

    private TransportationMode mode;

    public DirectionService(TransportationMode mode){
        this.mode = mode;

    }

    public void setMode(TransportationMode mode){
        this.mode = mode;
    }

    public int getETA(){
        switch (mode){
            case WALKING -> {
                System.out.println("For Walking it will Take 10 hours");
                return 10;
            }
            case CYCLING -> {
                System.out.println("For Cycling it will take 8 hours");
                return 8;
            }
            case CAR -> {
                System.out.println("For CAR it will take 6 hours");
                return 6;
            }
            case TRAIN -> {
                System.out.println("For Train it will take 2 hours");
                return 2;
            }
            default -> {
                return -1;
            }

        }
    }

    public String getDirection(){
        switch (mode){
            case WALKING -> {
              return "Head North for 500 meter";
            }
            case CYCLING -> {
                return "Head west for 500 meter";
            }
            case CAR -> {
                return "Head east for 500 meter";
            }
            case TRAIN -> {
                return "Head south for 500 meter";
            }
            default -> {
                return "Nowhere to got";
            }

        }
    }
}

public class WithoutStatePattern {

    public static void main(String[] args) {
        DirectionService directionService = new DirectionService(TransportationMode.CYCLING);

        System.out.println(directionService.getDirection());
        System.out.println(directionService.getETA());

        directionService.setMode(TransportationMode.TRAIN);
        System.out.println(directionService.getDirection());
        System.out.println(directionService.getETA());

    }

}
