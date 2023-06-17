/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;

public class c {
    private static final int a = 4096;

    public static void a(byte[] arrby, OutputStream outputStream) {
        outputStream.write(arrby);
    }

    public static void a(byte[] arrby, Writer writer) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrby);
        c.a((InputStream)byteArrayInputStream, writer);
    }

    public static void a(byte[] arrby, Writer writer, String string) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrby);
        c.a(byteArrayInputStream, writer, string);
    }

    public static int a(InputStream inputStream, OutputStream outputStream) {
        byte[] arrby = new byte[4096];
        int n2 = 0;
        int n3 = 0;
        while (-1 != (n3 = inputStream.read(arrby))) {
            outputStream.write(arrby, 0, n3);
            n2 += n3;
        }
        return n2;
    }

    public static int a(Reader reader, Writer writer) {
        char[] arrc = new char[4096];
        int n2 = 0;
        int n3 = 0;
        while (-1 != (n3 = reader.read(arrc))) {
            writer.write(arrc, 0, n3);
            n2 += n3;
        }
        return n2;
    }

    public static void a(InputStream inputStream, Writer writer) {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        c.a((Reader)inputStreamReader, writer);
    }

    public static void a(InputStream inputStream, Writer writer, String string) {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, string);
        c.a((Reader)inputStreamReader, writer);
    }

    public static void a(Reader reader, OutputStream outputStream) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        c.a(reader, (Writer)outputStreamWriter);
        outputStreamWriter.flush();
    }

    public static void a(String string, OutputStream outputStream) {
        StringReader stringReader = new StringReader(string);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        c.a((Reader)stringReader, (Writer)outputStreamWriter);
        outputStreamWriter.flush();
    }

    public static void a(String string, Writer writer) {
        writer.write(string);
    }
}

