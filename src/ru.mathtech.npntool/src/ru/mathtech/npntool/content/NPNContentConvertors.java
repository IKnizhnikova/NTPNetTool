package ru.mathtech.npntool.content;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

public class NPNContentConvertors {

	static public Rectangle createRectangleFromString(String initialValue) {
		if (initialValue == null) {
			return null;
		}
		
		initialValue.replaceAll("\\s", "");
		String[] values = initialValue.split(",");
		if (values.length != 4) {
			return null;
		}
		
		Rectangle rect = new Rectangle();
		try {
			rect.setLocation(Integer.parseInt(values[0]),Integer.parseInt(values[1]));
			rect.setSize(Integer.parseInt(values[2]),Integer.parseInt(values[3]));
		} catch (NumberFormatException e) {
			rect = null;
		}
		return rect;	
	}

	static public String convertRectangleToString(Object instanceValue) {
		if (instanceValue == null) {
			return null;
		}
		Rectangle rect = (Rectangle) instanceValue;
		return rect.x + "," + rect.y + "," + rect.width + "," + rect.height;
	}
	
	static public Point createPointFromString(String initialValue) {
		if(initialValue == null) {
			return null;
		}
		initialValue.replaceAll("\\s", "");
		String[] values = initialValue.split(",");
		if(values.length != 2) {
			return null;
		}
		
		Point point = new Point();
		try { 
			point.setLocation(Integer.parseInt(values[0]), Integer.parseInt(values[1]));
		} catch(NumberFormatException e) {
			point = null;		
		}
		return point;
	}

	static public String convertPointToString(Object instanceValue) {
		if(instanceValue == null) {
			return null;
		}
		Point p = (Point)instanceValue;
		return p.x+","+p.y;
	}	
	
}
