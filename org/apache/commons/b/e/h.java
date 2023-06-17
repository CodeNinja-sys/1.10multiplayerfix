/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.e;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import org.apache.commons.b.o;
import org.apache.commons.b.t;

public class h
extends Writer {
    private final Writer a;

    public h(String string, String string2) {
        this(new File(string), string2, false);
    }

    public h(String string, String string2, boolean bl2) {
        this(new File(string), string2, bl2);
    }

    public h(String string, Charset charset) {
        this(new File(string), charset, false);
    }

    public h(String string, Charset charset, boolean bl2) {
        this(new File(string), charset, bl2);
    }

    public h(String string, CharsetEncoder charsetEncoder) {
        this(new File(string), charsetEncoder, false);
    }

    public h(String string, CharsetEncoder charsetEncoder, boolean bl2) {
        this(new File(string), charsetEncoder, bl2);
    }

    public h(File file, String string) {
        this(file, string, false);
    }

    public h(File file, String string, boolean bl2) {
        this.a = h.a(file, string, bl2);
    }

    public h(File file, Charset charset) {
        this(file, charset, false);
    }

    public h(File file, Charset charset, boolean bl2) {
        this.a = h.a(file, charset, bl2);
    }

    public h(File file, CharsetEncoder charsetEncoder) {
        this(file, charsetEncoder, false);
    }

    public h(File file, CharsetEncoder charsetEncoder, boolean bl2) {
        this.a = h.a(file, charsetEncoder, bl2);
    }

    private static Writer a(File file, Object object, boolean bl2) {
        if (file == null) {
            throw new NullPointerException("File is missing");
        }
        if (object == null) {
            throw new NullPointerException("Encoding is missing");
        }
        boolean bl3 = file.exists();
        FileOutputStream fileOutputStream = null;
        OutputStreamWriter outputStreamWriter = null;
        try {
            fileOutputStream = new FileOutputStream(file, bl2);
            outputStreamWriter = object instanceof Charset ? new OutputStreamWriter((OutputStream)fileOutputStream, (Charset)object) : (object instanceof CharsetEncoder ? new OutputStreamWriter((OutputStream)fileOutputStream, (CharsetEncoder)object) : new OutputStreamWriter((OutputStream)fileOutputStream, (String)object));
        }
        catch (IOException iOException) {
            t.a(outputStreamWriter);
            t.a(fileOutputStream);
            if (!bl3) {
                o.e(file);
            }
            throw iOException;
        }
        catch (RuntimeException runtimeException) {
            t.a(outputStreamWriter);
            t.a(fileOutputStream);
            if (!bl3) {
                o.e(file);
            }
            throw runtimeException;
        }
        return outputStreamWriter;
    }

    @Override
    public void write(int n2) {
        this.a.write(n2);
    }

    @Override
    public void write(char[] arrc) {
        this.a.write(arrc);
    }

    @Override
    public void write(char[] arrc, int n2, int n3) {
        this.a.write(arrc, n2, n3);
    }

    @Override
    public void write(String string) {
        this.a.write(string);
    }

    @Override
    public void write(String string, int n2, int n3) {
        this.a.write(string, n2, n3);
    }

    @Override
    public void flush() {
        this.a.flush();
    }

    @Override
    public void close() {
        this.a.close();
    }
}

