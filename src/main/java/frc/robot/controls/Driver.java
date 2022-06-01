package frc.robot.controls;

import frc.robot.commands.ExampleCommand;
import frc.robot.constants.Constants;
import frc.robot.subsystems.ExampleSubsystem;
import lib.controllers.GameController;
import lib.controllers.GameController.Button;

public class Driver {
  private static GameController driver = new GameController(Constants.oi.kDriverJoy);

  public static void configureControls() {
    driver.get(Button.A).whenPressed(new ExampleCommand(new ExampleSubsystem()));
  }

}
