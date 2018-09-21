package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;

public class HookArmEncoderCode {

    public static void Lift (DcMotor Motor, double Power, int distance) {

        //Reset Encoders
        Motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        //Set to RUN_TO_POSITION mode
        Motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        //Set Target Position
        Motor.setTargetPosition(distance);

        Motor.setPower(Power);

        while (Motor.isBusy() )
        {
            //Wait Until Target Position is Reached
        }

        //Stop and Change Mode back to Normal
        Motor.setPower(0);

    }
}
