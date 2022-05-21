package com.tvt.builder;

public class Robot {
    private HEAD head;
    private BODY body;
    private ARMS arms;
    private LEGS legs;

    public Robot(HEAD head, BODY body, ARMS arms, LEGS legs) {
        this.head = head;
        this.body = body;
        this.arms = arms;
        this.legs = legs;
    }

    public void getRobot() {
        System.out.println("Robot has head - " + head + ", body - " + body + ", arms - " + arms + ", legs - " + legs);
    }

    public enum HEAD {
        HUMAN, BEAST, DRAGON
    }

    public enum BODY {
        SLIM, BULK, ROUND
    }

    public enum ARMS {
        FLAMETHROWER, CHAINSAW, ROCKET
    }

    public enum LEGS {
        WHEEL, TWO_LEGS, FLY
    }


}
