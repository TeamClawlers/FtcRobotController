package org.firstinspires.ftc.teamcode.Mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Intake {
    private DcMotor INm;

    // 1. Initialize the motor
    public void init(HardwareMap hwMap) {
        INm = hwMap.get(DcMotor.class, "INm");
    }

    // 2. Method to set the motor power
    public void setPower(double power) {
        INm.setPower(power);
    }
}
