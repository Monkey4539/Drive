// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.motorcontrol.Victor;

public class Drivetrain extends SubsystemBase {
  private final Victor m_leftwheel = new Victor(0);
  private final Victor m_rightwheel = new Victor(1);
  

  
  private final DifferentialDrive m_diffDrive = new DifferentialDrive(m_leftwheel, m_rightwheel);
  /** Creates a new Drivetrain. */
  public Drivetrain() {
    m_rightwheel.setInverted(true);
  }

  public void arcadeDrive(double xaxisSpeed, double zaxisRotate) {
    m_diffDrive.arcadeDrive(xaxisSpeed, zaxisRotate);
  }

  public void resetEncoders() {
  }

  public void getLeftDistanceInch() {
  }

  public void getRightDistanceInch() {
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
