package main;

import de.fhpotsdam.unfolding.data.PointFeature;
import processing.core.PGraphics;

/** Implements a visual marker for land earthquakes on an earthquake map
 * 
 * @author Maxim Cojocari-Goncear
 *
 */
public class LandQuakeMarker extends EarthquakeMarker {
	
	
	public LandQuakeMarker(PointFeature quake) {
		
		// calling EarthquakeMarker constructor
		super(quake);
		
		// setting field in earthquake marker
		isOnLand = true;
	}


	/** Draw the earthquake as a rectangle */
	@Override
	public void drawEarthquake(PGraphics pg, float x, float y) {
		float dx = 1.3f*this.getRadius();
		float dy = dx;
		pg.rect((float)(x-0.5*dx), (float)(y-0.5*dy), dx, dy);
		
	}
	

	// Get the country the earthquake is in
	public String getCountry() {
		return (String) getProperty("country");
	}

		
}