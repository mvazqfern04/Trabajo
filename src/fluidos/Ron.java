/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fluidos;

/**
 *
 * @author alumno
 */
public class Ron extends Liquido implements Graduable {

    private Double grados;

    public Ron(Double litros, Double grados) {
        super(litros, "ambar");
    }

    /**
     * Devuelve la mezcla que solo puede ser con cola o agua
     * @param liq
     * @return mezcla
     * @throws NoSePuedeMezclarException 
     */
    public Copa mezclar(Liquido liq) throws NoSePuedeMezclarException{
        Copa s;
        if(liq instanceof Cola || liq instanceof Agua){
            s=new Copa(this, liq);
        }
        else{
            throw new NoSePuedeMezclarException();
        }
        return s;
    }

    @Override
    public Double getGrados() {
        return this.grados;
    }

}
