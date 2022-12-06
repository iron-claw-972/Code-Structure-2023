package frc.robot.constants;

public final class Constants {
  public static final double kGravitationalAccel = 9.8;
  public static final double kMaxVoltage = 12.0;
  public static final double kLoopTime = 0.02;
  
  public static final double kCancoderResolution = 4096;
  public static final double kFalconResolution = 2048;
  public static final double kFalconMaxRPM = 6380.0;

  // CAN bus names
  // public static final String kCanivoreCan = ""; // replace this if using Canivore
  public static final String kRioCan = "rio";

  public static final OIConstants oi = new OIConstants();
  public static final DriveConstants drive = new DriveConstants();
  public static final AutoConstants auto = new AutoConstants();
}
