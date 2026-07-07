package org.firstinspires.ftc.teamcode.ExampleCode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
@TeleOp
public class IfPractice extends OpMode {

    @Override
    public void init() {
    }

    @Override
    public void loop() {
        boolean triButton = gamepad1.triangle;
        double leftY = gamepad1.left_stick_y;

        if(leftY < 0) {
            telemetry.addData("Left Stick", "is negative");
        }
        else if(leftY > 0) {
            telemetry.addData("Left Stick", "is greater than zero");
        }
        else{
            telemetry.addData("Left Stick", "is zero");
        }

        if(triButton) {
            telemetry.addData("A Button", "Pressed");
        }
        else {
            telemetry.addData("A Button", "NOT Pressed");
        }
            telemetry.addData("A Button State", triButton);
    }
}

/*

AND IS SHOWN BY && if(leftY < 0 && triButton == true)
OR IS SHOWN BY || if(leftY < 0 || triButton == true)
NOT IS SHOWN BY ! IN FRONT OF YOUR STATEMENT if(!leftY < 0)

 */
