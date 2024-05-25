package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Mecanum {
    private static Mecanum instance;
    private HardwareMap hardwareMap;
    private Gamepad controller;

    DcMotor FrontLeftMotor;
    DcMotor FrontRightMotor;
    DcMotor BackLeftMotor;
    DcMotor BackRightMotor;

    double y = controller.left_stick_y;
    double x = controller.left_stick_x;
    double r = controller.right_stick_x;

    public Mecanum(HardwareMap hardwareMap, Gamepad controller) {
        this.hardwareMap = hardwareMap;
        this.controller = controller;

        DcMotor FrontLeftMotor = hardwareMap.get(DcMotor.class, "FrontLeftMotor");
        DcMotor FrontRightMotor = hardwareMap.get(DcMotor.class, "FrontRightMotor");
        DcMotor BackLeftMotor = hardwareMap.get(DcMotor.class, "BackLeftMotor");
        DcMotor BackRightMotor = hardwareMap.get(DcMotor.class, "BackRightMotor");

        BackLeftMotor.setDirection(DcMotorSimple.Direction.REVERSE);
        BackRightMotor.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    public static Mecanum GetInstance(HardwareMap hardwareMap, Gamepad controller) {
        if (instance == null) {
            instance = new Mecanum(hardwareMap, controller);
        }

        return instance;
    }

    public void MecanumDrive() {
        FrontLeftMotor.setPower(y + x + r);
        BackLeftMotor.setPower(y - x + r);
        FrontRightMotor.setPower(y - x - r);
        BackRightMotor.setPower(y + x - r);
    }
}
