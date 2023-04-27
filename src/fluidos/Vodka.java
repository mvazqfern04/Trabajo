/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fluidos;

/**
 *
 * @author alumno
 */
public class Vodka extends Liquido implements Graduable {

    private Double grados;

    public Vodka(Double litros, Double grados) {
        super(litros, "incoloro");
    }

    /**
     * Mezcla los liquidos
     * @param liq
     * @return mezcla
     * @throws NoSePuedeMezclarException 
     */
    @Override
    public Liquido mezclar(Liquido liq) throws NoSePuedeMezclarException {
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
