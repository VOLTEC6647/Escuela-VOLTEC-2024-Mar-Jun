package org.firstinspires.ftc.teamcode;

import android.media.MediaExtractor;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class TeleOp6647 extends LinearOpMode {
        //Chassis chassis;
        Mecanum robot;

        @Override
        public void runOpMode() {
                //chassis = Chassis.GetInstance(hardwareMap, gamepad1);
                robot = Mecanum.GetInstance(hardwareMap, gamepad1);

                waitForStart();

                while (opModeIsActive()) {
                        //chassis.TankDrive();
                        robot.MecanumDrive();
                        telemetry.addData("FrontLeftMotor Speed",robot.BackLeftMotor.getPower());
                        telemetry.update();
                }
        }
}
