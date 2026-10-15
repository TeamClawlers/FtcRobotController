package org.firstinspires.ftc.teamcode.Mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Flywheel {
    public void init(HardwareMap hwMap) {
        Flym = hwMap.get(DcMotor.class, "Flym");
        Flym2 = hwMap.get(DcMotor.class, "Flym2");}
    private DcMotor Flym;
    private DcMotor Flym2;
    public void flywheel(double spin) {
        double FlymPow = spin;

        double maxPower = 1.0;
        double maxSpeed = 1.0;

        maxPower = Math.max(maxPower, Math.abs(FlymPow));

        Flym.setPower(maxSpeed * (FlymPow / maxPower));
        Flym2.setPower(-1*(maxSpeed * (FlymPow / maxPower)));
    }
}