package org.firstinspires.ftc.teamcode.ExampleCode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
@TeleOp
public class GamePadPractice extends OpMode {

    @Override
    public void init() {
    }

    @Override
    public void loop() {
        double speedForward = -gamepad1.left_stick_y / 2.0;
        double diff_LX_RX = gamepad1.left_stick_x - gamepad1.right_stick_x;
        double sum_LT_RT = gamepad1.left_trigger + gamepad1.right_trigger;

        telemetry.addData("RX", gamepad1.right_stick_x);
        telemetry.addData("RY", gamepad1.right_stick_y);
        telemetry.addData("LX", gamepad1.left_stick_x);
        telemetry.addData("LY", speedForward);
        telemetry.addData("cross", gamepad1.cross);
        telemetry.addData("b", gamepad1.b);
        telemetry.addData("diff_LX_RX", diff_LX_RX);
        telemetry.addData("sum_LT_RT", sum_LT_RT);
    }
}
