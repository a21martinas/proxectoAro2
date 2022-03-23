package circulo;

/**
 * Probas de refactorización en NetBeans coa clase Aro
 * @author Martin
 */
public class Aro {

    /**
     *
     */
    public static final double MINIMO = 0.0;

    private int coordenadaX;
    private int coordenadaY;
    private double radio;
     private double LIMITERADIO=0.0;

    /**
     *
     * @return
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     *
     * @param coordenadaX
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    /**
     *
     * @return
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     *
     * @param coordenadaY
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    /**
     *
     * @return
     */
    public double getRadio() {
        return radio;
    }

    /**
     *
     * @param radio
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     *
     * @return
     */
    public double getLIMITERADIO() {
        return LIMITERADIO;
    }

    /**
     *
     * @param LIMITERADIO
     */
    public void setLIMITERADIO(double LIMITERADIO) {
        this.LIMITERADIO = LIMITERADIO;
    }

    /**
     *
     */
    public Aro() {
    }

    /**
     *
     * @param valorX
     * @param valorY
     * @param valorRadio
     */
    public Aro(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
       setRadio(valorRadio);
    }

    /**
     *
     * @return
     */
    public double obterDiametro() {
        return radio * 2;
    }

    /**
     *
     * @return
     */
    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }

    /**
     *
     * @return
     */
    public double obterSuperficie() {
        return Math.PI * radio * radio;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Centro = [" + coordenadaX + "," + coordenadaY + "]; Radio = " + radio;
    }

    /**
     *
     * @param trasladarx
     * @param trasladary
     */
    public void trasladarCentro(int trasladarx, int trasladary){
        this.coordenadaX=coordenadaX + trasladarx;
        this.coordenadaY=coordenadaY + trasladary;
    }
}