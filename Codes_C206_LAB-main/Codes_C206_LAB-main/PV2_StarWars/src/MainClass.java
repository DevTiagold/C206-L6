public class MainClass {

    public static void main(String[] args) {

        Nave nave1 = new Nave("Disco", true);


        Jedi jedi1=new Jedi("Anakin", 10 , 110 , "roxo", true);
        Sith sith1 = new Sith("Joao", 2, 70, "rosa", false);
        Droid droid1 = new Droid("Anna", 3, 89, false);

        nave1.personagems[0]= jedi1;
        nave1.personagems[1]=sith1;
        nave1.personagems[2]=droid1;

        nave1.mostraInfo();
    }
}
