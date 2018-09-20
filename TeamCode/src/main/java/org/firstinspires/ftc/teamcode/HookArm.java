package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;


@TeleOp
public class HookArm extends OpMode {

    DcMotor upperleftMotor;

    public void init() {

        upperleftMotor = hardwareMap.dcMotor.get("Upper leftMotor");

        upperleftMotor.setDirection(DcMotor.Direction.FORWARD);

    }

    public void loop() {

        double power = 0.3;

        if (gamepad1.a){
            upperleftMotor.setPower(power);
        }
        else if (gamepad1.b){
            upperleftMotor.setPower(-1 * power);
        }
        else{
            upperleftMotor.setPower(0);
        }

        //upperleftMotor.setPower(gamepad1.left_stick_y);

        //telemetry.addData("Left_stick_x:", gamepad1.left_stick_x);

    }

}

