package com.tvt.builder;

public class FirstRobotBuilder implements RobotBuilder {
    private Robot.HEAD head;
    private Robot.BODY body;
    private Robot.ARMS arms;
    private Robot.LEGS legs;
    @Override
    public RobotBuilder buildHead(Robot.HEAD head) {
        this.head = head;
        return this;
    }

    @Override
    public RobotBuilder buildBody(Robot.BODY body) {
        this.body = body;
        return this;
    }

    @Override
    public RobotBuilder buildArms(Robot.ARMS arms) {
        this.arms = arms;
        return this;
    }

    @Override
    public RobotBuilder buildLegs(Robot.LEGS legs) {
        this.legs = legs;
        return this;
    }

    @Override
    public Robot build() {
        return new Robot(head, body, arms, legs);
    }
}
