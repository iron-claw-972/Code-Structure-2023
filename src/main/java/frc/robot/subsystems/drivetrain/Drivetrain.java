/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems.drivetrain;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.constants.Constants;
import frc.robot.util.MotorFactory;


public class Drivetrain extends SubsystemBase {

  private DrivetrainIO inputs;

  public Drivetrain() {
    this(MotorFactory.createTalonFX(Constants.drive.leftMotorPorts[0]), MotorFactory.createTalonFX(Constants.drive.leftMotorPorts[1]), MotorFactory.createTalonFX(Constants.drive.rightMotorPorts[0]), MotorFactory.createTalonFX(Constants.drive.rightMotorPorts[1]));
  }

  public Drivetrain(WPI_TalonFX leftMotor1, WPI_TalonFX leftMotor2, WPI_TalonFX rightMotor1, WPI_TalonFX rightMotor2) {
    inputs = new DrivetrainIO(leftMotor1, leftMotor2, rightMotor1, rightMotor2);
  }

  /**
   * Drives the robot using tank drive controls
   * Tank drive is slightly easier to code but less intuitive to control, so this is here as an example for now
   * @param leftPower the commanded power to the left motors
   * @param rightPower the commanded power to the right motors
   */
  public void tankDrive(double leftPower, double rightPower) {
    inputs.setPower(leftPower, rightPower);
  }

  /**
   * Drives the robot using arcade controls.
   *
   * @param forward the commanded forward movement
   * @param turn the commanded turn rotation
   */
  public void arcadeDrive(double throttle, double turn) {
    inputs.setPower(throttle + turn, throttle - turn);
  }
}
