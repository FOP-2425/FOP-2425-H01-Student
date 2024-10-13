package h01;

import fopbot.Robot;
import h01.template.Families;
import h01.template.Ghost;
import h01.template.TickBased;
import org.tudalgo.algoutils.student.annotation.StudentImplementationRequired;

/**
 * {@link OrangeGhost} is a {@link Robot} that looks like a orange ghost.
 * It tries to move in a straight line and alternates between turning left and
 * right.
 */
public class OrangeGhost extends Robot implements Ghost, TickBased {
    /**
     * Creates a new {@link OrangeGhost} at the given position.
     *
     * @param x the x-coordinate
     * @param y the y-coordinate
     */
    public OrangeGhost(int x, int y) {
        super(x, y, Families.GHOST_ORANGE);
    }

    /**
     * Moves the robot in a straight line if possible.
     * If the robot cannot move forward, it turns left or right until there is no
     * wall in front.
     * The robot alternates between turning left and right.
     */
    @Override
    @StudentImplementationRequired("H2.2")
    public void doMove() {
        org.tudalgo.algoutils.student.Student.crash("H2.2 - Remove if implemented");
    }
}