// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class Player here.
 * @author (your name) @version (a version number or a date)
 */
public class Player extends Actor
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Act - do whatever the Player wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("A")) {
            move(-3);
        }
        if (Greenfoot.isKeyDown("S")) {
            move(3);
            turn(45);
        }
        if (Greenfoot.isKeyDown("D")) {
            move(3);
        }
        if (Greenfoot.isKeyDown("W")) {
            move(3);
            turn(45);
        }
    }
}
