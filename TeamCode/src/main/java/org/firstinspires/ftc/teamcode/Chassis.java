package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Chassis {
    private static Chassis instance;
    private HardwareMap hardwareMap;
    private Gamepad controller;
    DcMotor leftMotor;
    DcMotor rightMotor;

    public Chassis(HardwareMap hardwareMap, Gamepad controller) {
        this.hardwareMap = hardwareMap;
        this.controller = controller;

        leftMotor = hardwareMap.get(DcMotor.class, "leftMotor");
        rightMotor = hardwareMap.get(DcMotor.class, "rightMotor");
    }

    public static Chassis GetInstance(HardwareMap hardwareMap, Gamepad controller) {
        if (instance == null) {
            instance = new Chassis(hardwareMap, controller);
        }

        return instance;
    }

    public void TankDrive() {
        rightMotor.setPower(controller.left_stick_y + controller.right_stick_x);
        leftMotor.setPower(controller.left_stick_y - controller.right_stick_x);
    }

}
