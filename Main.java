//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Pato p = new PatoDomestico();
    Aves avePato = new AdaptadorPato(p);

    avePato.emitirSom();

    Pavao pv = new PavaoAzul();
    Aves avePavao = new AdaptadorPavao(pv);

    avePavao.emitirSom();
}
