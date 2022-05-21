package com.tvt.builder;

public interface RobotBuilder {
    RobotBuilder buildHead(Robot.HEAD head);
    RobotBuilder buildBody(Robot.BODY body);
    RobotBuilder buildArms(Robot.ARMS arms);
    RobotBuilder buildLegs(Robot.LEGS legs);
    Robot build();
}
