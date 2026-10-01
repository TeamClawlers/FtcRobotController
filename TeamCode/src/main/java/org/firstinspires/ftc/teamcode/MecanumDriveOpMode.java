package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Mechanisms.Flywheel;
import org.firstinspires.ftc.teamcode.Mechanisms.Intake;
import org.firstinspires.ftc.teamcode.Mechanisms.MecanumDrive;

@TeleOp
public class MecanumDriveOpMode extends OpMode {
    MecanumDrive drive = new MecanumDrive();
    Intake intake = new Intake();
    Flywheel flywheel = new Flywheel();
    double rotatefly, clockwise, forward, strafe, rotate;


    @Override
    public void init() {
        drive.init(hardwareMap);
        intake.init(hardwareMap);
        flywheel.init(hardwareMap);
    }

    @Override
    public void loop() {
        forward = gamepad1.left_stick_y;
        strafe = gamepad1.left_stick_x;
        rotate = gamepad1.right_stick_x;
        clockwise = gamepad2.left_stick_y;
        rotatefly = gamepad2.right_stick_y;

        intake.intake(clockwise);
        flywheel.flywheel(rotatefly);
        drive.drive(forward,strafe,rotate);
    }
}