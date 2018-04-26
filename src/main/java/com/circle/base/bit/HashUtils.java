package com.circle.base.bit;

import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;

import java.nio.charset.Charset;

public class HashUtils {

    private static final HashFunction hashFunction = Hashing.murmur3_32();

    public static String hashCode(String key){
        return hashFunction.hashString(key, Charset.defaultCharset()).asBytes().toString();
    }
}
