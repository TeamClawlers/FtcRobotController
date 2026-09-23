package org.firstinspires.ftc.teamcode.Mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Intake {

    private DcMotor INm;

    public void init(HardwareMap hwMap) {

        INm = hwMap.get(DcMotor.class, "FLM"); // replace the variable inside the speech marks into the exact name og the motor name in the driver hub

        INm.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

    }
}
