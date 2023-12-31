/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.e;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.b.c.aa;

public class s
extends Writer {
    private static final int b = 4096;
    private final OutputStream c;
    private final String d;
    private StringWriter e = new StringWriter(4096);
    private Writer f;
    private String g;
    static final Pattern a = aa.a;

    public s(OutputStream outputStream) {
        this(outputStream, null);
    }

    public s(OutputStream outputStream, String string) {
        this.c = outputStream;
        this.d = string != null ? string : "UTF-8";
    }

    public s(File file) {
        this(file, null);
    }

    public s(File file, String string) {
        this(new FileOutputStream(file), string);
    }

    public String a() {
        return this.g;
    }

    public String b() {
        return this.d;
    }

    @Override
    public void close() {
        if (this.f == null) {
            this.g = this.d;
            this.f = new OutputStreamWriter(this.c, this.g);
            this.f.write(this.e.toString());
        }
        this.f.close();
    }

    @Override
    public void flush() {
        if (this.f != null) {
            this.f.flush();
        }
    }

    private void a(char[] arrc, int n2, int n3) {
        int n4 = n3;
        StringBuffer stringBuffer = this.e.getBuffer();
        if (stringBuffer.length() + n3 > 4096) {
            n4 = 4096 - stringBuffer.length();
        }
        this.e.write(arrc, n2, n4);
        if (stringBuffer.length() >= 5) {
            if (stringBuffer.substring(0, 5).equals("<?xml")) {
                int n5 = stringBuffer.indexOf("?>");
                if (n5 > 0) {
                    Matcher matcher = a.matcher(stringBuffer.substring(0, n5));
                    if (matcher.find()) {
                        this.g = matcher.group(1).toUpperCase();
                        this.g = this.g.substring(1, this.g.length() - 1);
                    } else {
                        this.g = this.d;
                    }
                } else if (stringBuffer.length() >= 4096) {
                    this.g = this.d;
                }
            } else {
                this.g = this.d;
            }
            if (this.g != null) {
                this.e = null;
                this.f = new OutputStreamWriter(this.c, this.g);
                this.f.write(stringBuffer.toString());
                if (n3 > n4) {
                    this.f.write(arrc, n2 + n4, n3 - n4);
                }
            }
        }
    }

    @Override
    public void write(char[] arrc, int n2, int n3) {
        if (this.e != null) {
            this.a(arrc, n2, n3);
        } else {
            this.f.write(arrc, n2, n3);
        }
    }
}

