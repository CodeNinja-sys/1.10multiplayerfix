/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.util.ag;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

class t {
    private char[] a = null;
    private ag b = null;
    private int c;
    private short[] d = null;
    private short[] e = null;
    private int[] f = null;
    private short[] g = null;
    private byte[] h = null;

    static void a(String string, String string2) {
        t t2 = new t(new FileInputStream(string));
        PrintWriter printWriter = null;
        if (string2 != null) {
            printWriter = new PrintWriter(new OutputStreamWriter((OutputStream)new FileOutputStream(string2), "UnicodeLittle"));
        }
        t2.a("", 0, printWriter);
        if (printWriter != null) {
            printWriter.close();
        }
    }

    void a(String string, int n2, PrintWriter printWriter) {
        if (n2 == 65535) {
            System.out.println(string);
            if (printWriter != null) {
                printWriter.println(string);
            }
        } else {
            for (int i2 = 0; i2 < this.c; ++i2) {
                int n3 = this.a(n2, i2) & 0xFFFF;
                if (n3 == 0) continue;
                char c2 = this.a[i2];
                String string2 = string;
                if (c2 != '\u0000') {
                    string2 = string2 + c2;
                }
                this.a(string2, n3, printWriter);
            }
        }
    }

    t(InputStream inputStream) {
        this.a(new DataInputStream(inputStream));
    }

    void a(DataInputStream dataInputStream) {
        char c2;
        dataInputStream.readInt();
        int n2 = dataInputStream.readInt();
        char[] arrc = new char[n2];
        for (int i2 = 0; i2 < arrc.length; ++i2) {
            arrc[i2] = (char)dataInputStream.readShort();
        }
        n2 = dataInputStream.readInt();
        byte[] arrby = new byte[n2];
        for (c2 = '\u0000'; c2 < arrby.length; ++c2) {
            arrby[c2] = dataInputStream.readByte();
        }
        this.b = new ag(arrc, arrby);
        this.c = dataInputStream.readInt();
        dataInputStream.readInt();
        n2 = dataInputStream.readInt();
        this.e = new short[n2];
        for (c2 = '\u0000'; c2 < this.e.length; ++c2) {
            this.e[c2] = dataInputStream.readShort();
        }
        n2 = dataInputStream.readInt();
        this.g = new short[n2];
        for (c2 = '\u0000'; c2 < this.g.length; ++c2) {
            this.g[c2] = dataInputStream.readShort();
        }
        n2 = dataInputStream.readInt();
        this.f = new int[n2];
        for (c2 = '\u0000'; c2 < this.f.length; ++c2) {
            this.f[c2] = dataInputStream.readInt();
        }
        n2 = dataInputStream.readInt();
        this.h = new byte[n2];
        for (c2 = '\u0000'; c2 < this.h.length; ++c2) {
            this.h[c2] = dataInputStream.readByte();
        }
        n2 = dataInputStream.readInt();
        this.d = new short[n2];
        for (c2 = '\u0000'; c2 < this.d.length; ++c2) {
            this.d[c2] = dataInputStream.readShort();
        }
        this.a = new char[this.c];
        for (c2 = '\u0000'; c2 < '\uffff'; c2 = (char)(c2 + '\u0001')) {
            byte by2 = this.b.a(c2);
            if (by2 == 0) continue;
            this.a[by2] = c2;
        }
        dataInputStream.close();
    }

    final short a(int n2, char c2) {
        byte by2 = this.b.a(c2);
        return this.a(n2, by2);
    }

    final short a(int n2, int n3) {
        if (this.b(n2, n3)) {
            return this.c(this.e[n2], n3 + this.h[n2]);
        }
        return 0;
    }

    private final boolean b(int n2, int n3) {
        if (this.g[n2] < 0) {
            return n3 == -this.g[n2];
        }
        int n4 = this.f[this.g[n2] + (n3 >> 5)];
        return (n4 & 1 << (n3 & 0x1F)) != 0;
    }

    private final short c(int n2, int n3) {
        return this.d[n2 * this.c + n3];
    }
}

