/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto1.Politicas;

import Punto1.Comida;

/**
 *
 * @author e_unz
 */
public class PoliticaAnd implements PoliticaAceptacion{

  PoliticaAceptacion p1;
  PoliticaAceptacion p2;
  public PoliticaAnd(PoliticaAceptacion p1,PoliticaAceptacion p2){
      this.p1 = p1;
      this.p2 = p2;
  }

  @Override
  public boolean acepta(Comida c){
    return p1.acepta(c)&&p2.acepta(c);
  }
  
  
}
