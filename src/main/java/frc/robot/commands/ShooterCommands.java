package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
//import frc.robot.commands.IntakeCommands.ROLLER_VOLTS;
import frc.robot.commands.flywheel.FlywheelVoltageCommand;
import frc.robot.subsystems.flywheel.Flywheel;
import frc.robot.util.mechanical_advantage.LoggedTunableNumber;

public class ShooterCommands {
    
    public final class SHOOTER_VOLTS {
        public static final LoggedTunableNumber SHOOTER_SHOOT =
            new LoggedTunableNumber("ShooterVolts/ShooterShoot", 6.0);
    }

}
