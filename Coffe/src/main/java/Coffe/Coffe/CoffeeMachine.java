package Coffe.Coffe;


import java.util.Iterator;

public interface CoffeeMachine {
    String cafePreto();
    String cafeComCreme();
    String cafeComAcucar();
    String cafeComCremeAcucar();
    float depositarMoeda(Moeda m);
    Iterator<Moeda> getTroco();
}
