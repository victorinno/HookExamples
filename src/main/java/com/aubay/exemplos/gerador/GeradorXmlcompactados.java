package com.aubay.exemplos.gerador;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class GeradorXmlcompactados extends GeradorArquivos {

    @Override
    protected byte[] processar(byte[] dados) throws IOException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ZipOutputStream zipOutputStream = new ZipOutputStream(outputStream);
        zipOutputStream.putNextEntry(new ZipEntry("internal"));
        zipOutputStream.write(dados);
        zipOutputStream.closeEntry();
        zipOutputStream.close();
        return outputStream.toByteArray();
    }

    @Override
    protected String gerarConteudo(Map<String, Object> propriedades) {
        return propriedades.keySet().stream()
                .map(prop -> String.format("<%s>%s</%s>", prop, propriedades.get(prop), prop))
                .collect(Collectors.joining("", "<properties>", "</properties>"));
    }
}
