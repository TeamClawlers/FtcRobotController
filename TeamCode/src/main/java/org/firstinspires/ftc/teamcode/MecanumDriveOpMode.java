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
    double spin, forward, strafe, rotate;

    @Override
    public void init() {
        drive.init(hardwareMap);
        intake.init(hardwareMap);
        flywheel.init(hardwareMap);
    }

    @Override
    public void loop() {
        // Read gamepad inputs
        forward = -1 * (gamepad1.left_stick_y);
        strafe = gamepad1.left_stick_x;
        rotate = gamepad1.right_stick_x;
        spin = gamepad2.left_trigger;

        // Button Binding: Hold 'A' to run the intake
        if (gamepad2.dpad_up) {
            intake.setPower(-1.0); // Full speed when held
        } else if (gamepad2.dpad_down) {
            intake.setPower(1.0); // Full speed when held
        } else {
            intake.setPower(0.0); // Stop when released
        }

        // Control flywheel and drivetrain
        flywheel.flywheel(spin);
        drive.drive(forward, strafe, rotate);
    }
}
