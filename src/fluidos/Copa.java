/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fluidos;

/**
 *
 * @author alumno
 */
public class Copa extends Liquido implements Graduable {

    private Graduable alcohol;
    private Liquido mezcla;

    public Copa(Graduable gra, Liquido liq) {
        super(liq.getLitros(), liq.getColor());
        Liquido alc = (Liquido) gra;
        setLitros(alc.getLitros() + liq.getLitros());
        this.alcohol = gra;
        this.mezcla = liq;
    }

    @Override
    public Liquido mezclar(Liquido liquido) throws NoSePuedeMezclarException {
        throw new NoSePuedeMezclarException();
    }

    
    @Override
    public Double getGrados() {
        Liquido alc = (Liquido) alcohol;
        if (this.alcohol instanceof Ron) {
            alc = (Ron) alcohol;
        } else if (this.alcohol instanceof Vodka) {
            alc = (Vodka) alcohol;
        }
        Double calcu = alcohol.getGrados() * alc.getLitros() / this.litros;
        return calcu;
    }

    public Graduable getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(Graduable alcohol) {
        this.alcohol = alcohol;
    }

    public fluidos.Liquido getMezcla() {
        return mezcla;
    }

    public void setMezcla(fluidos.Liquido mezcla) {
        this.mezcla = mezcla;
    }

}
