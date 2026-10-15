package org.firstinspires.ftc.teamcode.Mechanisms;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.gamepad1;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class MecanumDrive {
    public void init(HardwareMap hwMap) {
        FLm = hwMap.get(DcMotor.class, "FLM");
        BLm = hwMap.get(DcMotor.class, "BLM");
        FRm = hwMap.get(DcMotor.class, "FRM");
        BRm = hwMap.get(DcMotor.class, "BRM");
        FLm.setDirection(DcMotor.Direction.REVERSE);
        BLm.setDirection(DcMotor.Direction.REVERSE);

        FLm.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        BLm.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        FRm.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        BRm.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    }
    private DcMotor FLm, BLm, FRm, BRm;
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
        BLm.setPower(maxSpeed * (BLmPow / maxPower));
        FRm.setPower(maxSpeed * (FRmPow / maxPower));
        BRm.setPower(maxSpeed * (BRmPow / maxPower));
    }
    public void setPower(double power) {
        // Crawl mode: 'X'
        if (gamepad1.cross) {
            FLm.setPower(0.4*power);
            BLm.setPower(0.4*power);
            FRm.setPower(0.4*power);
            BRm.setPower(0.4*power);
        }
        else {
            FLm.setPower(power);
            BLm.setPower(power);
            FRm.setPower(power);
            BRm.setPower(power);
        }
    }
}
