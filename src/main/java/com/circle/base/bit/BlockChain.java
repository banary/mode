package com.circle.base.bit;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class BlockChain {

    private BlockChain(){}

    public static BlockChain getInstance(){
        return BlockChainHolder.INSTANCE;
    }

    private static class BlockChainHolder{
        private static final BlockChain INSTANCE = new BlockChain();
    }

    private static final Map<Integer, Block> map = Collections.synchronizedMap(new HashMap<>());

    public void add(Block block){
        map.put(block.getIndex(), block);
    }

    public void print(){
        for(Block block:map.values()){
            StringBuilder sb = new StringBuilder();
            sb.append(block.getIndex()).append(":")
                    .append(block.getTime()).append(":")
                    .append(block.getCertificate()).append(":")
                    .append(block.getHashCode()).append(":")
                    .append(block.getPreHashCode());
            System.out.println(sb.toString());
        }
    }
}
