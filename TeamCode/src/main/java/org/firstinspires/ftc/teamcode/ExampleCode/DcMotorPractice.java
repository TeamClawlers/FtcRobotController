package org.firstinspires.ftc.teamcode.ExampleCode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.ExampleMechanisms.Motors;

@Disabled
@TeleOp
public class DcMotorPractice extends OpMode {
    Motors robot = new Motors();

    @Override
    public void init() {
        robot.init(hardwareMap);
    }

    @Override
    public void loop() {
        robot.setWheelMotorSpeed(1);
        telemetry.addData("Motor Revs", robot.getMotorRevs());
    }
}
