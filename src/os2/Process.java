/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package os2;

import java.awt.Color;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Process {
    private int size;
    private int from;
    private int to;
    private String name;
    private Color color;
    
    public static List<Color> colors = new ArrayList<Color>();
    private Random rand = new Random();
    
    
    public Process(int size, String name) {
        this.size = size;
        this.name = name;
        color = new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
    }

    public Color getColor() {
        return color;
    }

    
    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTo() {
        return to;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public void setTo(int to) {
        this.to = to;
    }
    
    
}
