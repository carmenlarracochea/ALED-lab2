package es.upm.aled.lab2.kinematics;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase representa un segmento del exoesqueleto
 * 
 */
public class Segment {
	
	//definir atributos
	private double length;
	private double angle;
	private List<Segment> children;
	
	public Segment(double length, double angle) {
		this.angle = angle;
		this.length = length;
		this.children = new ArrayList<>();
		
	}
	
	public double getLength() {
		return this.length;
	}
	
	public double getAngle() {
		return this.angle;
	}
	
	//modificamos el angulo con uno nuevo dado
	public void setAngle(double angle) {
		this.angle=angle;
	}
	
	public List<Segment> getChildren(){
		return this.children;
	}
	
	public void addChild(Segment child) {
		if(!children.contains(child)) {
			children.add(child);
		}
	}
}
