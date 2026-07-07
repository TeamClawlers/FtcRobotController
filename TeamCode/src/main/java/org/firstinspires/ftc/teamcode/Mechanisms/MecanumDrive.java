package org.firstinspires.ftc.teamcode.Mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class MecanumDrive {
    private DcMotor FLm, BLm, FRm, BRm;

    public void init(HardwareMap hwMap) {
        FLm = hwMap.get(DcMotor.class, "x"); // replace the variable inside the speech marks into the exact name og the motor name in the driver hub
        BLm = hwMap.get(DcMotor.class, "x"); // replace the variable inside the speech marks into the exact name og the motor name in the driver hub
        FRm = hwMap.get(DcMotor.class, "x"); // replace the variable inside the speech marks into the exact name og the motor name in the driver hub
        BRm = hwMap.get(DcMotor.class, "x"); // replace the variable inside the speech marks into the exact name og the motor name in the driver hub

        FLm.setDirection(DcMotor.Direction.REVERSE);
        BLm.setDirection(DcMotor.Direction.REVERSE);

        FLm.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        BLm.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        FRm.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        BRm.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    }

    public void drive(double forward, double strafe, double rotate) {
        double FLmPow = forward + strafe + rotate;
        double BLmPow = forward - strafe + rotate;
        double FRmPow = forward - strafe - rotate;
        double BRmPow = forward + strafe - rotate;

        double maxPower = 1.0;
        double maxSpeed = 1.0;

        maxPower = Math.max(maxPower, Math.abs(FLmPow));
        maxPower = Math.max(maxPower, Math.abs(BLmPow));
        maxPower = Math.max(maxPower, Math.abs(FRmPow));
        maxPower = Math.max(maxPower, Math.abs(BRmPow));

        FLm.setPower(maxSpeed * (FLmPow / maxPower));
        BLm.setPower(maxSpeed * (FLmPow / maxPower));
        FRm.setPower(maxSpeed * (FLmPow / maxPower));
        BRm.setPower(maxSpeed * (FLmPow / maxPower));
    }
}
