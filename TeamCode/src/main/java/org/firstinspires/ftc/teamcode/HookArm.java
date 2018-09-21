package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;


@TeleOp
public class HookArm extends OpMode {

    DcMotor upperleftMotor;

    double power = 0.35;

    public void init() {

        upperleftMotor = hardwareMap.dcMotor.get("Upper leftMotor");

        upperleftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        upperleftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);

    }

    public void loop() {

        double displacement







        /**
        if (gamepad1.a) {
            HookArmEncoderCode.Lift(upperleftMotor, power, 0);
            while (gamepad1.a){

            }
        }
        else if (gamepad1.b) {
            HookArmEncoderCode.Lift(upperleftMotor, power, 150);
            while (gamepad1.b){

            }
        }
        else {
            upperleftMotor.setPower(0);
        }

        **/




        /**
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



        }

        //upperleftMotor.setPower(gamepad1.left_stick_y);

        //telemetry.addData("Left_stick_x:", gamepad1.left_stick_x);

        **/

    }



}

