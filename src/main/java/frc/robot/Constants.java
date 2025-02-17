// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.apriltag.AprilTag;
import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.math.util.Units;

public final class Constants {
  /* Field Objects */
  public enum FieldObject {
    SPEAKER,
    SPEAKER_CENTER,
    BLUE_SPEAKER_SIDE,
    RED_SPEAKER_SIDE,
    AMP,
    SOURCE,
    TRAP,
    Unknown
}
  /* Robot Parameter */
  public static final double robotLength = Units.inchesToMeters(25.5);
  public static final double robotWidth = Units.inchesToMeters(25.5);
  /* Operator IO */
  public static class OperatorConstants {
    public static final double kJoystickDeadband = 0.05;
    public static final int kDriverJoystickrPort = 0;
    public static final int kOperatorJoystickrPort = 1;
  }
  // Logitech Joystick D-Mode
  public static class LogitechJoystickLayout{
    public static final int BTN_X = 1;
    public static final int BTN_A = 2;
    public static final int BTN_B = 3;
    public static final int BTN_Y = 4;
    public static final int BTN_LEFT_BUMPER = 5;
    public static final int BTN_RIGHT_BUMPER = 6;
    public static final int BTN_LEFT_TRIGGER = 7;
    public static final int BTN_RIGHT_TRIGGER = 8;
    public static final int BTN_BACK = 9;
    public static final int BTN_START = 10;
    public static final int BTN_LEFT_JOYSTICK = 11;
    public static final int AXIS_LEFT_X = 0;
    public static final int AXIS_LEFT_Y = 1;
    public static final int AXIS_RIGHT_X = 2;
    public static final int AXIS_RIGHT_Y = 3;
  }
  /* Camera Type */
  public static class CameraType{
    public static final String HD3000 = "Microsoft_LifeCam_HD-3000";
    public static final String Limelight = "";
  }
  /* Motor Controller CAN ID */
  public static final class MotorControllerIDs{
    // Intake
    public static final int kIntakeMotorID = 0;
    public static final int kIntakePivotMotorID = 0;
    // Shooter
    public static final int kShooterMotorID = 19;
    public static final int kFeedMotorID = 5;
    public static final int kShooterPivotMotorID = 66;
    // Climber
    public static final int kClimberMotorLeftID = 5;
    public static final int kClimberMotorRightID = 6;
  }
  /* Digital Input */
  public static final class DigitalInputPin{
    public static final int kIRsensorDIO = 0;
    public static final int kLeftClimiberLimitSwitch = 1;
    public static final int kRightClimiberLimitSwitch = 2;
  }
  /* PWM Output */
  public static final class PWMOutputPin{
    public static final int kLeftClimberServo = 0;
    public static final int kRightClimberServo = 1;  
  }
  /* Intake Constants */
  public static final class IntakeConstants{
    // CAN encoder
    public static final int kIntakeCANcoderID = 666;
    public static final double kEncoderOffset = 0;
    // PID Constants
    public static final double kp = 0;
    public static final double ki = 0;
    public static final double kd = 0;
    // Set Angle Degree
    public static final double kIntakeUpAngle = 0;
    public static final double kIntakeDownAngle = 100;
  }
  /* Shooter Constants */
  public static final class ShooterConstants{
    // CAN coder
    public static final int kPivotCANcoderID = 555;
    public static final double kPivotEncoderOffset = 0;
    // Shooter PID
    public static final double kp = 0.0;
    public static final double ki = 0.0;
    public static final double kd = 0.0;
    // Motor Speed
    public static final double kFeedNoteVal = 0.5;
    public static final double kSpeakerVal = 0.8;
    public static final double kAmpVal = 0.4;
    public static final double kSpeakerRPM = 4000;
    public static final double kAmpRPM = 300;
    // Angle
    public static final double kSPEAKER_Angle = 30;
    public static final double kAMP_Angle = 10;
    public static final double kIdle_Angle = 0;
    public static final double kShooterMaxAngle = 0;
    public static final double kShooterMinAngle = 0;
  }
  /* Swerve Module Constants */
  public static final class SwerveModuleConstants{
    public static final double wheelDiameter = Units.inchesToMeters(4);
    public static final double driveMotorGearRatio = 1/6.75;
    public static final double turningMotorGearRatio = 1.0/(150/7);
    public static final double driveEncoderRot2Meter = driveMotorGearRatio*Math.PI*wheelDiameter;
    public static final double turningEncoderRot2Rad = turningMotorGearRatio*2*Math.PI;
    public static final double driveEncoderRPM2MeterPerSec = driveEncoderRot2Meter/60.0;
    public static final double turningEncoderRPM2RadPerSec = turningEncoderRot2Rad/60.0;

    public static final double turningMotorkP = 0.01;
    public static final double maxDriveMotorSpeed = 0.15;
  }
  /* Swerve Drivebase Constants */
  public static final class SwerveConstants{
    public static final int gyroID = 33;
    public static final int leftFrontDriveID = 24;
    public static final int leftFrontTurningID = 23;
    public static final int rightFrontDriveID = 15;
    public static final int rightFrontTurningID = 22;  
    public static final int leftRearDriveID = 11;
    public static final int leftRearTurningID = 16;
    public static final int rightRearDriveID = 17;
    public static final int rightRearTurningID = 21;

    public static final int leftFrontCANCoderID = 1;
    public static final int rightFrontCANCoderID = 2;
    public static final int leftRearCANCoderID = 3;
    public static final int rightRearCANCoderID = 4;

    public static final boolean leftFrontdriveMotorReversed = true;
    public static final boolean rightFrontDriveMotorReversed = false;
    public static final boolean leftRearDriveMotorreversed = false;
    public static final boolean rightRearDriveMotorReversed = false;

    public static final boolean leftFrontTurningMotorReversed = true;
    public static final boolean rightfrontTurningMotorReversed = true;
    public static final boolean leftRearTurningMotorReversed = true;
    public static final boolean rightRearTurningMotorReversed = true;
    
    public static final double leftFrontOffset = -0.461;
    public static final double rightFrontOffset = -0.34;
    public static final double leftRearOffset = 0.151;
    public static final double rightRearOffset = -0.379;

    //front left, front right, rear left, rear right
    public static final SwerveDriveKinematics swerveKinematics = new SwerveDriveKinematics(
      new Translation2d(robotLength/2, robotWidth/2), 
      new Translation2d(robotLength/2, -robotWidth/2), 
      new Translation2d(-robotLength/2, robotWidth/2),
      new Translation2d(-robotLength/2, -robotWidth/2)
    );
  }
  public static double setMaxOutput(double value, double maxOutput){
    if(value > maxOutput) return maxOutput;
    else if(-value < -maxOutput) return -maxOutput;
    else return value;
  }
  /* Aiming Setpoints */
  public static final class AimingSetpoint{
    // Unit = {target_x:meters, target_y:meters, targetYaw:rad}
    // Speaker
    public static final double[] Speaker_Center_Setpoint = {1, 0, 0};
    public static final double[] Blue_Speaker_Side_Setpoint = {1, 0, 0};
    public static final double[] Red_Speaker_Side_Setpoint = {1, 0, 0};
    // Amp
    public static final double[] Amp_Setpoint = {1, 0, 0};
    // Setpoint Selector
    // public static double[] setpointSelector(FieldObject targetPosition){
    //   switch(targetPosition){
    //     case SPEAKER_CENTER:
    //       return Speaker_Center_Setpoint;
    //     case RED_SPEAKER_SIDE:
    //       return Red_Speaker_Side_Setpoint;
    //     case BLUE_SPEAKER_SIDE:
    //       return Blue_Speaker_Side_Setpoint;
    //     case AMP:
    //       return Amp_Setpoint;
    //     default:
    //       return null;
    //   }
    // }
    // Setpoint Selector
    public static double[] setpointSelector(FieldObject targetPosition){
      switch(targetPosition){
        case SPEAKER_CENTER:
          return Speaker_Center_Setpoint;
        case RED_SPEAKER_SIDE:
          return Red_Speaker_Side_Setpoint;
        case BLUE_SPEAKER_SIDE:
          return Blue_Speaker_Side_Setpoint;
        case AMP:
          return Amp_Setpoint;
        default:
          return null;
      }
    }
  }
  /* April Tag Constants */
  public static final class ApriltagIDs{
    public static final int RedSourceInside = 1;
    public static final int RedSourceOutside = 2;
    public static final int RedSpeakerSide = 3;
    public static final int RedSpeakerCenter = 4;
    public static final int RedAMPID = 5;
    public static final int RedTrapL = 11;
    public static final int RedTrapM = 13;
    public static final int RedTrapR = 12;

    public static final int BlueAMPID = 6;
    public static final int BlueSpeakerCenter = 7;
    public static final int BlueSpeakerSide = 8;
    public static final int BlueSourceOutside = 9;
    public static final int BlueSourceInside = 10;
    public static final int BlueTrapL = 15;
    public static final int BlueTrapM = 14;
    public static final int BlueTrapR = 16;
    // Target Selector
    public static FieldObject getIDType(int id) {
      switch (id) {
        case ApriltagIDs.RedSpeakerCenter:
        case ApriltagIDs.BlueSpeakerCenter:
          System.out.println("Target:Blue SpeakerCenter");
          return FieldObject.SPEAKER_CENTER;
        case ApriltagIDs.RedSpeakerSide:
          System.out.println("Target:Red SpeakerSide");
          return FieldObject.RED_SPEAKER_SIDE;
        case ApriltagIDs.BlueSpeakerSide:
          System.out.println("Target:BLUE_SPEAKER_SIDE");
          return FieldObject.BLUE_SPEAKER_SIDE;
        case ApriltagIDs.RedAMPID:
        case ApriltagIDs.BlueAMPID:
          System.out.println("Target:AMP");
          return FieldObject.AMP;
        case ApriltagIDs.RedSourceInside:
        case ApriltagIDs.BlueSourceInside:
        case ApriltagIDs.RedSourceOutside:
        case ApriltagIDs.BlueSourceOutside:
          System.out.println("Target:Source");
          return FieldObject.SOURCE;
        case ApriltagIDs.BlueTrapL:
        case ApriltagIDs.BlueTrapM:
        case ApriltagIDs.BlueTrapR:
        case ApriltagIDs.RedTrapL:
        case ApriltagIDs.RedTrapM:
        case ApriltagIDs.RedTrapR:
          System.out.println("Target:Trap");
          return FieldObject.TRAP;
        default:
          return FieldObject.Unknown;
      }
    }
  }
  
}
