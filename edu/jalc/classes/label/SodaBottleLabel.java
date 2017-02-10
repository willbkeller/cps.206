package edu.jalc.classes.label;

public class SodaBottleLabel{
   
   private int color;
   private double height;
   
   private SodaBottleLabel(){
      this.color = 0;
      this.height = 0.0;
   }
   
   public SodaBottleLabel(int color, double height){
      this.color = color;
      this.height = height;
   }
   
   public double getColor(){
      return this.color;
   }
   
   public double getHeight(){
      return this.height;
   }
}