/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.ag;
import com.ibm.icu.a.ah;
import com.ibm.icu.a.ar;
import java.io.DataInputStream;
import java.io.InputStream;

public final class fb
implements ah {
    private static final boolean a = ar.b("NormalizerDataReader");
    private DataInputStream b;
    private byte[] c;
    private static final byte[] d = new byte[]{83, 80, 82, 80};
    private static final byte[] e = new byte[]{3, 2, 5, 2};

    public fb(InputStream inputStream) {
        if (a) {
            System.out.println("Bytes in inputStream " + inputStream.available());
        }
        this.c = ag.a(inputStream, d, this);
        if (a) {
            System.out.println("Bytes left in inputStream " + inputStream.available());
        }
        this.b = new DataInputStream(inputStream);
        if (a) {
            System.out.println("Bytes left in dataInputStream " + this.b.available());
        }
    }

    public void a(byte[] arrby, char[] arrc) {
        this.b.readFully(arrby);
        for (int i2 = 0; i2 < arrc.length; ++i2) {
            arrc[i2] = this.b.readChar();
        }
    }

    public byte[] a() {
        return e;
    }

    public boolean a(byte[] arrby) {
        return arrby[0] == e[0] && arrby[2] == e[2] && arrby[3] == e[3];
    }

    public int[] a(int n2) {
        int[] arrn = new int[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            arrn[i2] = this.b.readInt();
        }
        return arrn;
    }

    public byte[] b() {
        return this.c;
    }
}

