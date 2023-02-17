package test;
public class Auto {
    //Atributos
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    public static int cantidadCreados;

    //metodos
    public int cantidadAsientos(){
        int n_asientos = 0;
        for (Asiento asiento:asientos){
            if (asiento != null){
                n_asientos ++;
            }
        }
        return n_asientos;
    }
    public String verificarIntegridad(){
        if (this.registro == motor.registro){
            for(Asiento asiento:asientos){
                if(asiento != null) {
                    if (this.registro != asiento.registro) return "Las piezas no son originales";
                }
            }
        }
        return "Auto original";

    }
}
