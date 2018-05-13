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
public class Nokia implements Mobile {
     private int ramSize;
	private String processor;
	public String name = Mobile.NOKIA;
	public Nokia(int ramSize){
		this.ramSize = ramSize;
	}
	
	public Nokia(String processor){
		this.processor = processor;
		this.ramSize =1;
	}
}
