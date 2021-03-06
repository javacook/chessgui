package com.javacook.chessgui;

import java.io.Serializable;


public class MoveInfo implements Serializable {

    int oldX;
    int newX;
    int oldY;
    int newY;


    public MoveInfo() {
        oldX = 0;
        oldY = 0;
        newX = 1;
        newY = 1;
    }


    public MoveInfo(int oldX, int oldY, int newX, int newY) {
        this.oldX = oldX;
        this.oldY = oldY;
        this.newX = newX;
        this.newY = newY;
    }


    public String toString() {
        return (getOld() + "-" + getNew());
    }


    public int getOldX() {return this.oldX;}


    public int getOldY() {return this.oldY;}


    public String getOld() {
        return getCharLabel(oldX + 1) + (oldY + 1);
    }


    public int getNewX() {return this.newX;}


    public int getNewY() {return this.newY;}


    public String getNew() {
        return getCharLabel(newX + 1) + (newY + 1);
    }


    public void setOldX(int oldX) {this.oldX = oldX;}


    public void setOldY(int oldY) {this.oldY = oldY;}


    public void setNewX(int newX) {this.newX = newX;}


    public void setNewY(int newX) {this.newY = newX;}


    public int getGapX() {return this.newX - this.oldX;}


    public int getGapY() {return this.newY - this.oldY;}


    // Converts x number poisition to character label
    private String getCharLabel(int i) {
        return i > 0 && i < 27 ? String.valueOf((char) (i + 64)) : null;
    }
}
