package org.firstinspires.ftc.teamcode.ExampleMechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Motors {
    private DcMotor motor;
    private double ticksPerRev; // revolution

    public void init(HardwareMap hwMap) {
        // Dc motor
        motor = hwMap.get(DcMotor.class, "x"); // give this the exact name that is present in the config files in the drivers hub
        motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        ticksPerRev = motor.getMotorType().getTicksPerRev();
    }

    public void setWheelMotorSpeed(double speed) {
        // accepts any value from -1.0 to 1.0
        motor.setPower(speed);
    }

    public double getMotorRevs() {
        return motor.getCurrentPosition() / ticksPerRev; // normalizing ticks to revolutions, if there is a gear ratio ie: 2:1, then you multiply the ticksPerRev in this line by 2, this is so you account for the double reduction
    }

}
