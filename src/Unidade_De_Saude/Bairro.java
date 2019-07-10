/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidade_De_Saude;

/**
 *
 * @author HeiThor
 */
public class Bairro {
   private double x; //coordenada
   private double y;//cooredenada
   private double w;//frequência de chamadas de socorro do bairro
   
   public Bairro(int x, int y, int w) {
   setX(x);
   setX(y);
   setX(w);
   }
   
   public double getX(){
       return this.x;
   }
   
   public double getY(){
       return this.y;
   }
   
   public double getW(){
       return this.w;
   }
   
   public void setX(double x){
       this.x = x;
   }
   
   public void setW(double w){
       this.w =w;
   }
     
}
