package com.circle.base.bit;

public class Validator {

    public static boolean isBlockValid(Block newBlock, Block oldBlock){
        if(oldBlock.getIndex()+1 != newBlock.getIndex()){
            return false;
        }
        if(!oldBlock.getHashCode().equals(newBlock.getPreHashCode())){
            return false;
        }
        if(!newBlock.calculateHashCode().equals(newBlock.getHashCode())){
            return false;
        }
        return true;
    }
}
