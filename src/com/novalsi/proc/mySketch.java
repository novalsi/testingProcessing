/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novalsi.proc;

import processing.core.*;

/**
 *
 * @author Nick Smith
 */

public class mySketch extends PApplet
{
    PImage mapImage;
    
    public void setup()
    {
        size(640,400);
        mapImage = loadImage("map.png");
    }
    
    public void draw()
    {
        background(255);
        image(mapImage,0,0);
    }
}
