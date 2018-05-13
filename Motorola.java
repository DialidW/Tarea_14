/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes;

/**
 *
 * @author Juan Salas Jr
 */
public class Motorola implements Mobile{
    private int ramSize;
	private String processor;
	public String name = Mobile.MOTOROLA;
	public Motorola(int ramSize){
		this.ramSize = ramSize;
	}
	
	public Motorola(String processor){
		this.processor = processor;
		this.ramSize =2;
	}
}
