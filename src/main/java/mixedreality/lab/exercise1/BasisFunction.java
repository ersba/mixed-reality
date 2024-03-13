/**
 * Diese Datei ist Teil des Vorgabeframeworks für die Veranstaltung "Mixed Reality"
 * <p>
 * Prof. Dr. Philipp Jenke, Hochschule für Angewandte Wissenschaften Hamburg.
 */

package mixedreality.lab.exercise1;

/**
 * Shared interface for all basis functions.
 */
public interface BasisFunction {

    public enum CurveType {HERMITE, BEZIER, UNDEFINED}

    /**
     * Evaluate basis function.
     */
    float eval(float t, int index, int degree);

    /**
     * Evaluate basis function derivative.
     */
    float evalDerivative(float t, int i, int degree);

    CurveType getCurveType();
}
