/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

/**
 *
 * @author admin
 */
public class BankFactory {
      private BankFactory() {
    }
    public static final Bank getBank(BankType bankType) {
        switch (bankType) {
 
        case TPBANK:
            return new TbBank();
 
        case VIETCOMBANK:
            return new VietComBank();
 
        default:
            throw new IllegalArgumentException("This bank type is unsupported");
        }
    }
          
}
