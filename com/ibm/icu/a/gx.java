/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.ag;
import com.ibm.icu.a.am;
import com.ibm.icu.a.gl;
import com.ibm.icu.a.gs;
import com.ibm.icu.a.gz;
import com.ibm.icu.d.lf;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class gx {
    private int[] b;
    private int[] c;
    private byte[] d;
    private gs e;
    private static final String f = "ubidi";
    private static final String g = "icu";
    private static final String h = "ubidi.icu";
    private static final byte[] i = new byte[]{66, 105, 68, 105};
    private static final int j = 2;
    private static final int k = 3;
    private static final int l = 4;
    private static final int m = 5;
    private static final int n = 15;
    private static final int o = 16;
    private static final int p = 5;
    private static final int q = 10;
    private static final int r = 11;
    private static final int s = 12;
    private static final int t = 13;
    private static final int u = 16;
    private static final int v = 31;
    private static final int w = 224;
    private static final int x = 0xFF0000;
    private static final int y = -4;
    private static final int z = 21;
    public static final gx a;

    private gx() {
        InputStream inputStream = am.b("data/icudt51b/ubidi.icu");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 4096);
        this.a(bufferedInputStream);
        bufferedInputStream.close();
        inputStream.close();
    }

    private void a(InputStream inputStream) {
        int n2;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        ag.a(dataInputStream, i, new gz(null));
        int n3 = dataInputStream.readInt();
        if (n3 < 16) {
            throw new IOException("indexes[0] too small in ubidi.icu");
        }
        this.b = new int[n3];
        this.b[0] = n3;
        for (n2 = 1; n2 < n3; ++n2) {
            this.b[n2] = dataInputStream.readInt();
        }
        this.e = gs.b(dataInputStream);
        int n4 = this.b[2];
        int n5 = this.e.b();
        if (n5 > n4) {
            throw new IOException("ubidi.icu: not enough bytes for the trie");
        }
        dataInputStream.skipBytes(n4 - n5);
        n3 = this.b[3];
        if (n3 > 0) {
            this.c = new int[n3];
            for (n2 = 0; n2 < n3; ++n2) {
                this.c[n2] = dataInputStream.readInt();
            }
        }
        n3 = this.b[5] - this.b[4];
        this.d = new byte[n3];
        for (n2 = 0; n2 < n3; ++n2) {
            this.d[n2] = dataInputStream.readByte();
        }
    }

    public final void a(lf lf2) {
        int n2;
        for (gl gl2 : this.e) {
            if (gl2.d) break;
            lf2.e(gl2.a);
        }
        int n3 = this.b[3];
        for (n2 = 0; n2 < n3; ++n2) {
            int n4 = gx.j(this.c[n2]);
            lf2.b(n4, n4 + 1);
        }
        int n5 = this.b[4];
        int n6 = this.b[5];
        n3 = n6 - n5;
        byte by2 = 0;
        for (n2 = 0; n2 < n3; ++n2) {
            byte by3 = this.d[n2];
            if (by3 != by2) {
                lf2.e(n5);
                by2 = by3;
            }
            ++n5;
        }
        if (by2 != 0) {
            lf2.e(n6);
        }
    }

    public final int a(int n2) {
        int n3 = this.b[15];
        switch (n2) {
            case 4096: {
                return n3 & 0x1F;
            }
            case 4102: {
                return (n3 & 0xFF0000) >> 16;
            }
            case 4103: {
                return (n3 & 0xE0) >> 5;
            }
        }
        return -1;
    }

    public final int b(int n2) {
        return gx.i(this.e.a(n2));
    }

    public final boolean c(int n2) {
        return gx.a(this.e.a(n2), 12);
    }

    public final int d(int n2) {
        int n3 = this.e.a(n2);
        int n4 = (short)n3 >> 13;
        if (n4 != -4) {
            return n2 + n4;
        }
        int n5 = this.b[3];
        for (int i2 = 0; i2 < n5; ++i2) {
            int n6 = this.c[i2];
            int n7 = gx.j(n6);
            if (n2 == n7) {
                return gx.j(this.c[gx.k(n6)]);
            }
            if (n2 < n7) break;
        }
        return n2;
    }

    public final boolean e(int n2) {
        return gx.a(this.e.a(n2), 11);
    }

    public final boolean f(int n2) {
        return gx.a(this.e.a(n2), 10);
    }

    public final int g(int n2) {
        return (this.e.a(n2) & 0xE0) >> 5;
    }

    public final int h(int n2) {
        int n3 = this.b[4];
        int n4 = this.b[5];
        if (n3 <= n2 && n2 < n4) {
            return this.d[n2 - n3] & 0xFF;
        }
        return 0;
    }

    private static final int i(int n2) {
        return n2 & 0x1F;
    }

    private static final boolean a(int n2, int n3) {
        return (n2 >> n3 & 1) != 0;
    }

    private static final int j(int n2) {
        return n2 & 0x1FFFFF;
    }

    private static final int k(int n2) {
        return n2 >>> 21;
    }

    static {
        try {
            a = new gx();
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }
}

