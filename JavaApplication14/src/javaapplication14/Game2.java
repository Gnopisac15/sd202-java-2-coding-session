/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

import java.util.Random;

/**
 *
 * @author 2ndyrGroupB
 */
class Game2 {
    public String[] names = {"KERWEIN", "JUNMAR" , "JUAN", "REHNAN", "MARTIN", "DAVID", "ABDUL", "RESTITUTO", "DEXTER", "JOSHUA", "JOSELITO", "JOHN", "MElCHOR" } ;
    public String [] hint = {"Bansay", "Pina ka bansay sa tanan", "Gwapong Bata", "Pina ka Gwapong bata", "But-an na bata", "Manyakis" , "Bahog lobot", "Boy Hukad", "Chickz boy", "Mamayotay"," Batang IRO", "Bugoy" , "Pinaka Bugoy"};

public int generateRandom(){
   Random rand = new Random();
   return rand.nextInt(names.length);
}
}