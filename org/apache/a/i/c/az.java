/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.c;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.apache.commons.d.a;

public class az {
    private final a a;
    private final String b;

    public az(a a2, String string) {
        this.a = a2;
        this.b = string;
    }

    public az(a a2) {
        this(a2, "");
    }

    private void a(String string, InputStream inputStream) {
        int n2;
        StringBuilder stringBuilder = new StringBuilder();
        while ((n2 = inputStream.read()) != -1) {
            if (n2 == 13) {
                stringBuilder.append("[\\r]");
                continue;
            }
            if (n2 == 10) {
                stringBuilder.append("[\\n]\"");
                stringBuilder.insert(0, "\"");
                stringBuilder.insert(0, string);
                this.a.b(this.b + " " + stringBuilder.toString());
                stringBuilder.setLength(0);
                continue;
            }
            if (n2 < 32 || n2 > 127) {
                stringBuilder.append("[0x");
                stringBuilder.append(Integer.toHexString(n2));
                stringBuilder.append("]");
                continue;
            }
            stringBuilder.append((char)n2);
        }
        if (stringBuilder.length() > 0) {
            stringBuilder.append('\"');
            stringBuilder.insert(0, '\"');
            stringBuilder.insert(0, string);
            this.a.b(this.b + " " + stringBuilder.toString());
        }
    }

    public boolean a() {
        return this.a.a();
    }

    public void a(InputStream inputStream) {
        org.apache.a.o.a.a(inputStream, "Output");
        this.a(">> ", inputStream);
    }

    public void b(InputStream inputStream) {
        org.apache.a.o.a.a(inputStream, "Input");
        this.a("<< ", inputStream);
    }

    public void a(byte[] arrby, int n2, int n3) {
        org.apache.a.o.a.a(arrby, "Output");
        this.a(">> ", new ByteArrayInputStream(arrby, n2, n3));
    }

    public void b(byte[] arrby, int n2, int n3) {
        org.apache.a.o.a.a(arrby, "Input");
        this.a("<< ", new ByteArrayInputStream(arrby, n2, n3));
    }

    public void a(byte[] arrby) {
        org.apache.a.o.a.a(arrby, "Output");
        this.a(">> ", new ByteArrayInputStream(arrby));
    }

    public void b(byte[] arrby) {
        org.apache.a.o.a.a(arrby, "Input");
        this.a("<< ", new ByteArrayInputStream(arrby));
    }

    public void a(int n2) {
        this.a(new byte[]{(byte)n2});
    }

    public void b(int n2) {
        this.b(new byte[]{(byte)n2});
    }

    public void a(String string) {
        org.apache.a.o.a.a((Object)string, "Output");
        this.a(string.getBytes());
    }

    public void b(String string) {
        org.apache.a.o.a.a((Object)string, "Input");
        this.b(string.getBytes());
    }
}

