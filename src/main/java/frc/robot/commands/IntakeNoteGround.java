// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants.IntakeConstants;
import frc.robot.subsystems.IntakeSubsystem;

public class IntakeNoteGround extends Command {
  private final IntakeSubsystem m_IntakeSubsystem;
  /** Creates a new IntakeNoteGround. */
  public IntakeNoteGround(IntakeSubsystem intakeSubsystem) {
    this.m_IntakeSubsystem = intakeSubsystem;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(m_IntakeSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_IntakeSubsystem.setAngle(IntakeConstants.kIntakeDownAngle);
    // m_IntakeSubsystem.IntakeDown();
  }

  @Override
  public void execute(){
    m_IntakeSubsystem.IntakeDown();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_IntakeSubsystem.IntakeUP();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
