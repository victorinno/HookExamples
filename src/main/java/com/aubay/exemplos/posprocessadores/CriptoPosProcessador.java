package com.aubay.exemplos.posprocessadores;

import java.util.stream.IntStream;

public class CriptoPosProcessador implements PosProcessador{

    int delay;

    public CriptoPosProcessador(int delay) {
        this.delay = delay;
    }

    @Override
    public byte[] processar(byte[] dados) {
        byte[] newBytes = new byte[dados.length];
        IntStream.range(0, dados.length).forEach(i -> newBytes[i] = (byte) ((dados[i] + delay) % Byte.MAX_VALUE));
        return newBytes;
    }
}
