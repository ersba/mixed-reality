/**
 * Diese Datei ist Teil des Vorgabeframeworks für die Veranstaltung "Mixed Reality"
 * <p>
 * Prof. Dr. Philipp Jenke, Hochschule für Angewandte Wissenschaften Hamburg.
 */

package mixedreality;

import com.jme3.math.Vector2f;
import mixedreality.lab.exercise1.BasisFunctionDummy;
import mixedreality.lab.exercise1.Curve;
import mixedreality.lab.exercise1.CurveScene2D;
import ui.CG2DApplication;

/**
 * Entry class for all 2d exercises.
 */
public class MixedReality2D extends CG2DApplication {
    public MixedReality2D() {
        super("Mixed Reality");

        // Assignment 1: Curves and Splines
        Curve curve = new Curve(new BasisFunctionDummy());
        curve.addControlPoint(new Vector2f(-0.5f, -0.5f));
        curve.addControlPoint(new Vector2f(0, 2));
        curve.addControlPoint(new Vector2f(1, -1));
        curve.addControlPoint(new Vector2f(0.5f, 0.5f));
        addScene2D(new CurveScene2D(600, 600, curve));

        // Assignment 3: Rendering Pipeline
        //addScene2D(new MyRendererSceneSolution(600, 600));

        // Assignment 4: Quadric Error Metrics
        //addScene2D(new SimplificationScene(600, 600));

        // Assignment 6
        //addScene2D(new LSystemScene2D(800, 600));
    }

    public static void main(String[] args) {
        new MixedReality2D();
    }
}
