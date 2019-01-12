public class CD extends MusicPlayer{

    @Override
    public void nastepnyUtwor() {
        System.out.println("Kolejny utwór to: ");
    }

    @Override
    public void poprzedniUtwor(){
        System.out.println("Poprzedni utwór to: ");
    }

    @Override
    public void odtwarzaj() {
        System.out.println("Play");
    }

    @Override
    public void pauza() {
        System.out.println("Pauza");
    }
}
