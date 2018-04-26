package com.circle.base.bit;

public class BlockMain {

    public static void main(String[] args) {
        Block genesisBlock = new Block(0, "","");
        BlockChain.getInstance().add(genesisBlock);
        Block xBlock = BlockFactory.generateBlock(genesisBlock, "xiyongchun");
        BlockChain.getInstance().add(xBlock);
        Block yBlock = BlockFactory.generateBlock(xBlock, "ycc");
        BlockChain.getInstance().add(yBlock);
        BlockChain.getInstance().print();
    }
}
