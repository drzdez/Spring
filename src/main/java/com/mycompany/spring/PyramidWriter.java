/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spring;

/**
 *
 * @author jakub.donath
 */
public class PyramidWriter {
    
    private final int pyramidWidth;
    private String stars = "Attempting to print stars pyramid bellow:\n";
    
    public PyramidWriter(SpringzConfig springzConfig){
        pyramidWidth = springzConfig.getPyramidWidth();
    }
    
    public String printStarsPyramid(){
        var w = pyramidWidth;
        if (w % 2 == 0){
            this.stars += "Width has to be odd number";
        }
        else {
            var zeros = (w-1)/2;
            var x = 1;
            for (int i=zeros; i>=0; i--){
                var spaces = new String(new char[i]).replace("\0", " ");
                var stars = new String(new char[x]).replace("\0", "*");
                this.stars += spaces+stars+"\n";
                x = x+2;
            }
        }
        return this.stars;
    }
    
    @Override
    public String toString() {
        return printStarsPyramid();
    }
}
