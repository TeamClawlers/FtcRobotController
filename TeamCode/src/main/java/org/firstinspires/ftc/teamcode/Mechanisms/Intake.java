package org.firstinspires.ftc.teamcode.Mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Intake {
    public void init(HardwareMap hwMap) {
        INm = hwMap.get(DcMotor.class, "INm");
    }
    private DcMotor INm;
    public void intake(double clockwise) {
        double INmPow = clockwise;

        double maxPower = 1.0;
        double maxSpeed = 1.0;

        maxPower = Math.max(maxPower, Math.abs(INmPow));

        INm.setPower(maxSpeed * (INmPow / maxPower));
    }
}