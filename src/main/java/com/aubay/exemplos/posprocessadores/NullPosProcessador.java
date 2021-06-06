package com.aubay.exemplos.posprocessadores;

public class NullPosProcessador implements PosProcessador{
    @Override
    public byte[] processar(byte[] dados) {
        return dados;
    }
}
