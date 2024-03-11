/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 28Feb2024
 *     <p>(Simulation: heads or tails) Write a program that simulates flipping a coin one million
 *     times and displays the number of heads and tails.
 */
package com.github.jonathanbirkey.chapter05;

public class Exercise40 {
  public static void main(String[] args) {
    int coin = 0;
    int heads = 0;
    int tails = 0;
    
    for (int i = 0; i < 1000000; i++) {
    	coin = (int)(Math.random()*2);
    	if(coin == 1) {
    		heads++;
    	}else {
    		tails++;
    	}
    }
    System.out.printf("Heads: %d\nTails: %d",heads, tails);
  }
}
