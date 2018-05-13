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


public class Exec {
	 public static void main(String[] args) {
		Mobile mobile = MobileF.createMobile(Mobile.SAMSUNG);
                Mobile mobile1 = MobileF.createMobile(Mobile.NOKIA);
                Mobile mobile2 = MobileF.createMobile(Mobile.MOTOROLA);
                Mobile mobile3 = MobileF.createMobile(Mobile.LG);
                System.out.println(mobile);
                System.out.println(mobile1);
                System.out.println(mobile2);
                System.out.println(mobile3);
	}
}
