/**
 * Diese Datei ist Teil des Vorgabeframeworks für die Veranstaltung "Mixed Reality"
 * <p>
 * Prof. Dr. Philipp Jenke, Hochschule für Angewandte Wissenschaften Hamburg.
 */

package mixedreality;

import com.jme3.system.AppSettings;
import mixedreality.lab.exercise2.MarchingCubesScene3D;
import mixedreality.lab.exercise5.StereoScene;
import ui.CG3DApplication;

/**
 * Entry class for all 3D exercises.
 */
public class MixedReality3D extends CG3DApplication {

  public MixedReality3D() {

    // Assignment 2: Marching Cubes
    setScene3D(new MarchingCubesScene3D());

    // Assignment 5
    //setScene3D(new StereoScene());
  }

  public static void main(String[] args) {
    // Setup JME app
    var app = new MixedReality3D();
    AppSettings appSettings = new AppSettings(true);
    appSettings.setTitle("Intro to Computer Graphics");
    appSettings.setResolution(800, 600);
    appSettings.setFullscreen(false);
    appSettings.setAudioRenderer(null);
    app.setSettings(appSettings);
    app.setShowSettings(false);
    app.setDisplayStatView(false);
    app.start();
  }
}
