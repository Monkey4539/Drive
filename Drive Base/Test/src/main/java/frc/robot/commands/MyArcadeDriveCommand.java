// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;

public class MyArcadeDriveCommand extends CommandBase {
  Drivetrain m_drivetrain;
  XboxController m_stick;
  /** Creates a new MyArcadeDrive. */
  
  public MyArcadeDriveCommand(Drivetrain m_Drivetrain2, XboxController stick) {
    m_drivetrain = m_Drivetrain2;

   m_stick = stick;
    addRequirements(m_drivetrain);
  }


  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_drivetrain.arcadeDrive((m_stick.getRawAxis(1)*-1), m_stick.getRawAxis(4));
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
