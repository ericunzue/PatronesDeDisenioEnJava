package Punto1.Politicas;

import Punto1.Comida;
import Punto1.Pedido;

public interface PoliticaAceptacion{

  boolean acepta(Comida c);
}
