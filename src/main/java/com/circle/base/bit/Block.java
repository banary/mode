package com.circle.base.bit;

import java.time.LocalDateTime;

public class Block {

    //区块在整个链中的位置
    private int index;
    //块生成时间戳
    private LocalDateTime time;
    //每分钟心跳数
    private String certificate;
    private String hashCode;
    private String preHashCode;

    public Block(int index, String certificate, String preHashCode) {
        this.index = index;
        this.time = LocalDateTime.now();
        this.certificate = certificate;
        this.preHashCode = preHashCode;
        this.hashCode = calculateHashCode();
    }

    public int getIndex() {
        return index;
    }

    public Block setIndex(int index) {
        this.index = index;
        return this;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public Block setTime(LocalDateTime time) {
        this.time = time;
        return this;
    }

    public String getCertificate() {
        return certificate;
    }

    public Block setCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    public String getHashCode() {
        return hashCode;
    }

    public Block setHashCode(String hashCode) {
        this.hashCode = hashCode;
        return this;
    }

    public String getPreHashCode() {
        return preHashCode;
    }

    public Block setPreHashCode(String preHashCode) {
        this.preHashCode = preHashCode;
        return this;
    }

    public String calculateHashCode() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(index);
        stringBuilder.append(time.toString());
        stringBuilder.append(certificate);
        stringBuilder.append(preHashCode);
        return HashUtils.hashCode(stringBuilder.toString());
    }
}
