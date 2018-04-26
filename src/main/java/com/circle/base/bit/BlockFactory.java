package com.circle.base.bit;

import java.time.LocalDateTime;

public class BlockFactory {

    public static Block generateBlock(Block block, String certificate){
        return new Block(block.getIndex()+1, certificate, block.getPreHashCode());
    }
}
