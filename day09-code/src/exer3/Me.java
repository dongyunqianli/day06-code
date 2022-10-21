package exer3;

interface Filial{
    default void help(){
        System.out.println("help mother");
    }
}
interface Spoony{
    default void help(){
        System.out.println("help girlfriend");
    }
}
class Father{
    public void help(){
        System.out.println("hey, help my wife");
    }
}

public class Me extends Father implements Filial,Spoony{
/*    @Override
    public void help() {
        Filial.super.help();
    }*/
}
