package com.tvt.builder;

public class Scientist {
    public void makeRobot() {
        Robot robot = new FirstRobotBuilder()
                .buildHead(Robot.HEAD.BEAST)
                .buildBody(Robot.BODY.BULK)
                .buildArms(Robot.ARMS.CHAINSAW)
                .buildLegs(Robot.LEGS.FLY).build();
        robot.getRobot();
    }
}
