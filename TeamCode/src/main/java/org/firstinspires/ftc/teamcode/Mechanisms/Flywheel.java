package org.firstinspires.ftc.teamcode.Mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Flywheel {
    public void init(HardwareMap hwMap) {
        Flym = hwMap.get(DcMotor.class, "Flym");
    }
    private DcMotor Flym;
    public void flywheel(double spin) {
        double FlymPow = spin;

        double maxPower = 1.0;
        double maxSpeed = 1.0;

        maxPower = Math.max(maxPower, Math.abs(FlymPow));

        Flym.setPower(maxSpeed * (FlymPow / maxPower));
    }
}