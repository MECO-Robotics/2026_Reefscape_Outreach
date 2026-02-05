package frc.robot.subsystems.flywheel;

public class FlywheelConstants {
  public record FlywheelGains(
      double kP,
      double kI,
      double kD,
      double kS,
      double kV,
      double kA,
      double kMaxAccel,
      double kTolerance) {}

  public record FlywheelHardwareConfig(
      int[] canIds, boolean[] reversed, double gearRatio, int currentLimit, String canBus) {}

  public static final FlywheelHardwareConfig EXAMPLE_CONFIG =
      new FlywheelHardwareConfig(new int[] {1}, new boolean[] {true}, 2.0, 40, "");

  public static final FlywheelGains EXAMPLE_GAINS =
      new FlywheelGains(0.2, 0.0, 0.0, 0.0, 0.065, 0.0, 1.0, 1.0);

  // ------------------
  // Shooter
  // ------------------
  public static final FlywheelHardwareConfig SHOOTER_FLYWHEELS =
      new FlywheelHardwareConfig(new int[] {14, 15}, new boolean[] {false, true}, 4.0, 40, "");

  public static final FlywheelGains SHOOTER_FLYWHEEL_GAINS =
      new FlywheelGains(0.00019397, 0.0, 0.0, 0.040967, 0.0020721, 0.00052497, 1.0, 1.0);

  public static final FlywheelHardwareConfig INDEXER_CONFIG =
      new FlywheelHardwareConfig(new int[] {16}, new boolean[] {false}, 1.0, 20, "");

  public static final FlywheelGains INDEXER_GAINS =
      new FlywheelGains(0.2, 0.0, 0.0, 0.0, 0.1, 0.0, 1.0, 1.0);
}
