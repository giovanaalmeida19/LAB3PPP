public class AdaptadorPato implements Aves{
    private Pato pato;

    public AdaptadorPato(Pato pato){
        setPato(pato);
    }

    public void voar(){
        pato.voar();
    }
    public void emitirSom(){
        pato.grasnar();
    }

    public Pato getPato() {
        return pato;
    }

    public void setPato(Pato pato) {
        this.pato = pato;
    }
}
