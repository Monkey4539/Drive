// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;

public class DriveEncodersCommand extends CommandBase {
  private Drivetrain m_drivetrain;
  private double m_speed;
  private double m_inches;
  
  public DriveEncodersCommand(Drivetrain drivetrain, double speed, double inches){
    // Use addRequirements() here to declare subsystem dependencies.
    m_drivetrain = drivetrain;
    m_speed = speed;
    m_inches = inches;

    addRequirements(drivetrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_drivetrain.resetEncoders();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (m_inches > 0) {
      m_drivetrain.arcadeDrive(m_speed, 0);
    } else {
      m_drivetrain.arcadeDrive(-m_speed, 0);
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_drivetrain.arcadeDrive(0, 0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return (m_inches > 0 && m_drivetrain.getLeftDistanceInch() > m_inches) ||
    (m_inches < 0 && m_drivetrain.getLeftDistanceInch() < m_inches);
  }
}
