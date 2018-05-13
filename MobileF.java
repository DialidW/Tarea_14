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
public class MobileF {
    public static Mobile createMobile(String type){
		if(type.equals(Mobile.IPHONE)){
			return new IPhone(2, "A9", "A9 GPu");
		}else if(type.equals(Mobile.SONY)){
			return new Sony(2,"ARM");
		}else if(type.equals(Mobile.SAMSUNG)){
			return new Samsung("Intel");
		}else if (type.equals(Mobile.MOTOROLA)){
                        return new Motorola("AMD");
                }else if (type.equals(Mobile.NOKIA)){
                        return new Motorola("KJR");
                }else if (type.equals(Mobile.LG)){
                        return new Motorola(4);
                }
                else{
			return null;
		}
	}
}
