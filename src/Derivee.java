public class Derivee extends Base{
    public void methodeDerivee1(){
        this.methode1();
        super.methode1();
    }

    @Override
    public void methode1(){
        System.out.println("Methode 1 de Derivee !");
    }

    public void methodeDerive2() {
        super.methode2();
    }
}
