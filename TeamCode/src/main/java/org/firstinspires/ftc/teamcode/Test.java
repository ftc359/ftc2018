package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class Test extends OpMode {

    DcMotor upperleftMotor;

    public void init() {

        upperleftMotor = hardwareMap.dcMotor.get("Upper leftMotor");

        upperleftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }

    public void loop(){

        upperleftMotor.setPower(0.4*gamepad1.left_stick_y);

    }

}
