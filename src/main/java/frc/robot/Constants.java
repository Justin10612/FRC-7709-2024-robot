// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.math.util.Units;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  /* Robot Parameter */
  public static final double robotLength = Units.inchesToMeters(25.5);
  public static final double robotWidth = Units.inchesToMeters(25.5);
  /* Operator IO */
  public static class OperatorConstants {
    public static final int kDriverJoystickrPort = 0;
    public static final int kOperatorJoystickrPort = 1;
    public static final double kJoystickDeadband = 0.8;
    public static final int floorButton = 1;
    public static final int shootButton = 2;
    public static final int primetiveButton = 3;
    public static final int takeButton = 4;
  }
  /* Motor Controller CAN ID */
  public static class MotorControllerIDs{
    // Intake-Shooter
    public static final int kShooterMotorLeftID = 3;
    public static final int kShooterMotorRightID = 4; 
    public static final int kIntakeMotorID = 5;
    // Climber
    public static final int kClimberMotorLeftID = 5;
    public static final int kClimberMotorRightID = 6;
    // Arm
    public static final int kArmMotorLeftID = 1;
    public static final int kArmMotorRightID = 2;
  }
  /* Digital Input */
  public static class DigitalInputPin{
    public static final int kIRsensorDIO = 0;
    public static final int kLeftClimiberLimitSwitch = 1;
    public static final int kRightClimiberLimitSwitch = 2;
  }
  /* PWM Output */
  public static class PWMOutputPin{
    public static final int kLeftClimberServo = 0;
    public static final int kRightClimberServo = 1;  
  }
  /* Arm Constants */
  public static final class ArmConstants{
    public static final double armGearRatio = 1/0.0;
    public static final double armOrigin = 0.908;
    public static final double armTaking = 0.0;
    public static final double kArmMaxOutput = 0.3;
    public static final double KArmEncoderOffset = 0;
    // Feedforward
    public static final double kS = 0;
    public static final double kG = 0;
    public static final double kV = 0;
    public static final double kA = 0;
    // PID Constants
    public static final double kp = 0;
    public static final double ki = 0;
    public static final double kd = 0;
    // Set Angle Degree
    public static final double idleInsideAngle = 60;
    public static final double IdleOutsideAngle = 20;
    public static final double ampAngle = 92;
    public static final double groundIntakeAngle = 0;
  }
  /* Intak-Shooter Constants */
  public static final class IntakeShooterConstants{
    // Shooter PID
    public static final double kp = 0.0;
    public static final double ki = 0.0;
    public static final double kd = 0.0;
    // Constants
    public static final double kSpeakerBaseVolt = 5;
    public static final double kSpeakerRPM = 4000;
    public static final double kAmpBaseVolt = 4;
    public static final double kAmpRPM = 300;
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
    public static final double turningMotorkP = 0.015;
    public static final double maxDriveMotorSpeed = 4.0;
  }
  /* Swerve Drivebase Constants */
  public static final class SwerveConstants{
    public static final int gyroID = 10;
    public static final int leftFrontDriveID = 7;
    public static final int leftFrontTurningID = 8;
    public static final int rightFrontDriveID = 1;
    public static final int rightFrontTurningID = 2;  
    public static final int leftRearDriveID = 5;
    public static final int leftRearTurningID = 6;
    public static final int rightRearDriveID = 3;
    public static final int rightRearTurningID = 4;

    public static final int leftFrontCANCoderID = 14;
    public static final int rightFrontCANCoderID = 11;
    public static final int leftRearCANCoderID = 13;
    public static final int rightRearCANCoderID = 12;

    public static final boolean leftFrontdriveMotorReversed = true;
    public static final boolean leftFrontTurningMotorReversed = true;
    public static final boolean rightFrontDriveMotorReversed = true;
    public static final boolean rightfrontTurningMotorReversed = true;
    public static final boolean leftRearDriveMotorreversed = false;
    public static final boolean leftRearTurningMotorReversed = true;
    public static final boolean rightRearDriveMotorReversed = false;
    public static final boolean rightRearTurningMotorReversed = true;

    public static final double leftFrontOffset = 0.129;
    public static final double rightFrontOffset = -0.355;
    public static final double leftRearOffset = -0.345;
    public static final double rightRearOffset = 0.042;

    //front left, front right, rear left, rear right
    public static final SwerveDriveKinematics swerveKinematics = new SwerveDriveKinematics(
      new Translation2d(robotLength/2, robotWidth/2), 
      new Translation2d(robotLength/2, -robotWidth/2), 
      new Translation2d(-robotLength/2, robotWidth/2),
      new Translation2d(-robotLength/2, -robotWidth/2)
    );
  }
  public static double setMaxOutput(double value, double maxOutput){
    // return min(maxOutput, max(value, -maxOutput)) 這樣一行或許就可以搞定了
    if(value > maxOutput) return maxOutput;
    else if(-value < -maxOutput) return -maxOutput;
    else return value;
  }
  /* April Tag Constants */
  public static final class ApriltagConstants{
    public static final int redSpeakerID1 = 3;
    public static final int redSpeakerID2 = 4;
    public static final int redAMPID = 5;
    public static final int blueSpeakerID1 = 7;
    public static final int blueSpeakerID2 = 8;
    public static final int blueAMPID = 6;
    public static final double speakerZSetpoint = 0.0;
    public static final double ampXSetpoint = 0.0;
    public static final double ampYSetpoint = 0.0;
    public static final double ampZSetpoint = 0.0;
    public static final double speakerHeight = 204.5;//cm
    public static final double armHeight = 0;
    public static final double limelightToArmDistance = 0;
  }
}
