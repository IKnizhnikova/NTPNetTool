package ru.mathtech.npntool.editor;

import org.eclipse.draw2d.geometry.Dimension;

public class NPNGraphicalEditorConstants {
	public static final double GoldenRatio = 1.6180339887496482;
	public static final Dimension dimensionNodeSizeDefault = new Dimension(
			(int) (50 * GoldenRatio), 50);
	public static final Dimension dimensionTokenSizeDefault = new Dimension(
			(int) (30 * GoldenRatio), 30);
	public static final String nameNodeDefault = "<..>";

}
