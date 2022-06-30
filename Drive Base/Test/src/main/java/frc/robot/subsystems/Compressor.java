// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.XboxController;

public class Compressor extends SubsystemBase {
  private XboxController xboxController;
  private Solenoid s1, s2;
  private Compressor airCompressor;

  /** Creates a new Compressor. */
  public Compressor() {
    xboxController = new XboxController(1);             // USB port
    airCompressor = new Compressor();  //Digtial I/O,Relay
    airCompressor.start();                        // Start the air compressor

    s1 = new Solenoid(null, 1);                        // Solenoid port
    s2 = new Solenoid(null, 2);
  }

  private void start() {
  }

  public void operatorControl() {
    if(xboxController.getStartButtonPressed() == true)
    {
          s1.set(true);
          s2.set(false);
     }
     if(xboxController.getBackButtonPressed() == true)
     {
          s1.set(false);
          s2.set(true);
     }
    }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
