# EarthquakeMapProject ©

**App description**

An interactive map showing all earthquakes and cities around the world. This is a Java applet which provides interactive features for searching and visualising earthquake data. 

**Installation**

Firstly, clone the repistory on your local machine. If you work in Eclipse, import the ```UnfoldingMapsProject``` folder in editor (```File``` -> ```Import``` -> ```Existing Projects into Workspace```, Select this folder, ```Finish```). 
These steps are simmilar and for other IDE.

**Manual instalation**

If the import does not work follow the steps below.

- Create new Java project;
- Copy + Paste all files into project;
- Add all ```lib/*.jars``` to build path;
- Set native library location for ```jogl.jar```. Choose appropriate folder for your OS;
- Add ```data/``` as ```src```.

**Trouble shooting**

Switch Java Compiler to 1.6 if you get VM problems. (Processing should work with Java 1.6, and 1.7)


**Ouput**

After compiling the entire project you should see this output. Play around the markers on the map in order to catch the information you want. 
When a city marker is hovered, the map will display a box with the city’s name, country, and population. For an earthquake marker, the map will display the title of the earthquake (including its magnitude and region).  Clicking on a marker gives even more information: a click on a city marker will lead to only that city and earthquakes which affect it being displayed on the map.  Clicking once again on that marker will bring the rest of the map’s markers back.  Similarly, after clicking on an earthquake marker, only cities potentially affected by that earthquake will be displayed. 

You can zoom particular location by clicking directly on map.

![image](https://user-images.githubusercontent.com/92053176/165777253-b5ba4ea2-44af-45d3-b155-6cdc21d78dd7.png)
