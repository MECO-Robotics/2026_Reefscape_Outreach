package frc.robot.commands;

import edu.wpi.first.math.util.Units;
import frc.robot.util.mechanical_advantage.LoggedTunableNumber;

public class ArmCommands {

  public static final class ARM_PRESETS {

    public static final LoggedTunableNumber ARM_STOWED =
        new LoggedTunableNumber("ArmPresets/ArmStowed", 0.0);

    public static final LoggedTunableNumber ARM_SHOOT =
        new LoggedTunableNumber("ArmPresets/ArmShoot", Units.degreesToRadians(0));
  }
}
