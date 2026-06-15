public class AdaptadorPavao implements Aves{
    private Pavao pavao;

    public AdaptadorPavao(Pavao pavao){
        setPavao(pavao);
    }

    public void voar(){
        pavao.voar();
    }

    public void emitirSom(){
        pavao.cantar();
    }

    public Pavao getPavao() {
        return pavao;
    }

    public void setPavao(Pavao pavao) {
        this.pavao = pavao;
    }
}
