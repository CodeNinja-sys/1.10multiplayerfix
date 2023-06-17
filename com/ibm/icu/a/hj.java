/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.ag;
import com.ibm.icu.a.ah;
import com.ibm.icu.a.hg;
import com.ibm.icu.a.hh;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

final class hj
implements ah {
    private DataInputStream a;
    private static final int b = 3;
    private int c;
    private int d;
    private int e;
    private int f;
    private static final int g = 12;
    private static final byte[] h = new byte[]{1, 0, 0, 0};
    private static final byte[] i = new byte[]{117, 110, 97, 109};

    public boolean a(byte[] arrby) {
        return arrby[0] == h[0];
    }

    protected hj(InputStream inputStream) {
        ag.a(inputStream, i, this);
        this.a = new DataInputStream(inputStream);
    }

    protected void a(hg hg2) {
        int n2;
        this.c = this.a.readInt();
        this.d = this.a.readInt();
        this.e = this.a.readInt();
        this.f = this.a.readInt();
        int n3 = this.a.readChar();
        char[] arrc = new char[n3];
        for (n2 = 0; n2 < n3; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = this.a.readChar();
        }
        n2 = this.d - this.c;
        byte[] arrby = new byte[n2];
        this.a.readFully(arrby);
        hg2.a(arrc, arrby);
        n3 = this.a.readChar();
        hg2.d(n3, 3);
        char[] arrc2 = new char[n3 *= 3];
        for (int i2 = 0; i2 < n3; ++i2) {
            arrc2[i2] = this.a.readChar();
        }
        n2 = this.f - this.e;
        byte[] arrby2 = new byte[n2];
        this.a.readFully(arrby2);
        hg2.b(arrc2, arrby2);
        n3 = this.a.readInt();
        hh[] arrhh = new hh[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            hh hh2 = this.a();
            if (hh2 == null) {
                throw new IOException("unames.icu read error: Algorithmic names creation error");
            }
            arrhh[i3] = hh2;
        }
        hg2.a(arrhh);
    }

    protected boolean a(byte[] arrby, byte[] arrby2) {
        return Arrays.equals(i, arrby) && Arrays.equals(h, arrby2);
    }

    private hh a() {
        char c2;
        Object object;
        char c3;
        byte by2;
        int n2;
        hh hh2 = new hh();
        int n3 = this.a.readInt();
        if (!hh2.a(n3, n2 = this.a.readInt(), by2 = this.a.readByte(), (byte)(c3 = this.a.readByte()))) {
            return null;
        }
        int n4 = this.a.readChar();
        if (by2 == 1) {
            object = new char[c3];
            for (c2 = '\u0000'; c2 < c3; c2 = (char)(c2 + 1)) {
                object[c2] = this.a.readChar();
            }
            hh2.a((char[])object);
            n4 -= c3 << 1;
        }
        object = new StringBuilder();
        c2 = (char)(this.a.readByte() & 0xFF);
        while (c2 != '\u0000') {
            ((StringBuilder)object).append(c2);
            c2 = (char)(this.a.readByte() & 0xFF);
        }
        hh2.a(((StringBuilder)object).toString());
        if ((n4 -= 12 + ((StringBuilder)object).length() + 1) > 0) {
            byte[] arrby = new byte[n4];
            this.a.readFully(arrby);
            hh2.a(arrby);
        }
        return hh2;
    }
}

