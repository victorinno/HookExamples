package com.aubay.exemplos.posprocessadores;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CompatadorPosProcessor implements PosProcessador {
    @Override
    public byte[] processar(byte[] dados) {
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            ZipOutputStream zipOutputStream = new ZipOutputStream(outputStream);
            zipOutputStream.putNextEntry(new ZipEntry("internal"));
            zipOutputStream.write(dados);
            zipOutputStream.closeEntry();
            zipOutputStream.close();
            return outputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
