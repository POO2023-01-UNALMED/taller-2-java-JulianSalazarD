package test;
public class Motor {
    //atributos
    int numeroCilindros;
    String tipo;
    int registro;

    //metodos
    public void cambiarRegistro(int registro){
        this.registro = registro;
    }
    public void asignarTipo(String tipo){
        if(tipo.equals("electrico") || tipo.equals("gasolina")){
            this.tipo = tipo;
        }
    }
}