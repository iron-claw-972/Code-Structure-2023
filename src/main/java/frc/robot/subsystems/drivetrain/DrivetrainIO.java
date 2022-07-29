package frc.robot.subsystems.drivetrain;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import org.littletonrobotics.junction.LogTable;
import org.littletonrobotics.junction.inputs.LoggableInputs;

public class DrivetrainIO implements LoggableInputs {

  private final WPI_TalonFX m_leftMotor1;
  private final WPI_TalonFX m_leftMotor2;
  
  private final WPI_TalonFX m_rightMotor1;
  private final WPI_TalonFX m_rightMotor2;

  public DrivetrainIO(WPI_TalonFX leftMotor1, WPI_TalonFX leftMotor2, WPI_TalonFX rightMotor1, WPI_TalonFX rightMotor2) {
    m_leftMotor1 = leftMotor1;
    m_leftMotor2 = leftMotor2;
    m_rightMotor1 = rightMotor1;
    m_rightMotor2 = rightMotor2;

    m_leftMotor2.follow(m_leftMotor1);
    m_rightMotor2.follow(m_rightMotor1);
  }

  @Override
  public void toLog(LogTable table) {
    table.put("leftPower", m_leftMotor1.get());
    table.put("rightPower", m_rightMotor1.get());
  }

  @Override
  public void fromLog(LogTable table) {
    setPower(table.getDouble("leftPower", 0.0), table.getDouble("rightPower", 0.0));
  }

  public void setPower(double left, double right) {
    m_leftMotor1.set(left);
    m_rightMotor1.set(right);
  }
  
}
