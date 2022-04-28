package main;

import de.fhpotsdam.unfolding.data.PointFeature;
import processing.core.PGraphics;

/** Implements a visual marker for ocean earthquakes on an earthquake map
 * 
 * @author Maxim Cojocari-Goncear
 *
 */
public class OceanQuakeMarker extends EarthquakeMarker {
	
	public OceanQuakeMarker(PointFeature quake) {
		super(quake);
		
		// setting field in earthquake marker
		isOnLand = false;
	}
	

	/** Draw the earthquake as an ellipse */
	@Override
	public void drawEarthquake(PGraphics pg, float x, float y) {
		float r = 1.3f*this.getRadius();
		pg.ellipse(x, y, r, r);
	}
	

	

}
