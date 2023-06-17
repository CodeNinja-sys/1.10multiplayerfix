/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.ag;
import com.ibm.icu.a.ah;
import com.ibm.icu.a.bq;
import com.ibm.icu.a.br;
import com.ibm.icu.a.bs;
import com.ibm.icu.a.bt;
import com.ibm.icu.a.bu;
import com.ibm.icu.a.bv;
import com.ibm.icu.a.bw;
import com.ibm.icu.a.bx;
import com.ibm.icu.a.by;
import com.ibm.icu.a.bz;
import com.ibm.icu.a.ca;
import com.ibm.icu.util.VersionInfo;
import com.ibm.icu.util.dn;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class bp
implements ah {
    private static final byte[] a = new byte[]{82, 101, 115, 66};
    private static final int b = 0;
    private static final int c = 1;
    private static final int d = 3;
    private static final int e = 5;
    private static final int f = 6;
    private static final int g = 7;
    private static final int h = 1;
    private static final int i = 2;
    private static final int j = 4;
    private static final boolean k = false;
    private byte[] l;
    private String m;
    private byte[] n;
    private String o;
    private int p;
    private int q;
    private boolean r;
    private boolean s;
    private boolean t;
    private int[] u;
    private byte[] v;
    private String w;
    private byte[] x;
    private int y;
    private static bv z = new bv(null);
    private static final bp A = new bp();
    private static byte[] B = new byte[0];
    private static ByteBuffer C = ByteBuffer.allocate(0).asReadOnlyBuffer();
    private static char[] D = new char[0];
    private static int[] E = new int[0];
    private static String F = "";
    private static final String G = ".res";

    private bp() {
    }

    private bp(InputStream inputStream, String string, String string2, ClassLoader classLoader) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            this.l = ag.a(bufferedInputStream, a, this);
            this.a(bufferedInputStream);
            inputStream.close();
        }
        catch (IOException iOException) {
            String string3 = bp.a(string, string2);
            throw new RuntimeException("Data file " + string3 + " is corrupt - " + iOException.getMessage());
        }
        if (this.t) {
            bp bp2 = bp.a(string, "pool", classLoader);
            if (!bp2.s) {
                throw new IllegalStateException("pool.res is not a pool bundle");
            }
            if (bp2.u[7] != this.u[7]) {
                throw new IllegalStateException("pool.res has a different checksum than this bundle");
            }
            this.n = bp2.v;
            this.o = bp2.w;
        }
    }

    static bp a(String string, String string2, ClassLoader classLoader) {
        bw bw2 = new bw(string, string2, classLoader);
        bp bp2 = (bp)z.a((Object)bw2, (Object)bw2);
        if (bp2 == A) {
            return null;
        }
        return bp2;
    }

    private void a(InputStream inputStream) {
        int n2;
        int n3;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.p = dataInputStream.readInt();
        int n4 = dataInputStream.readInt();
        int n5 = n4 & 0xFF;
        this.u = new int[n5];
        this.u[0] = n4;
        for (n3 = 1; n3 < n5; ++n3) {
            this.u[n3] = dataInputStream.readInt();
        }
        this.y = 1 + n5 << 2;
        if (n5 > 5) {
            n3 = this.u[5];
            this.r = (n3 & 1) != 0;
            this.s = (n3 & 2) != 0;
            this.t = (n3 & 4) != 0;
        }
        n3 = this.u[3] * 4;
        if (this.u[1] > 1 + n5) {
            int n6;
            n2 = 1 + n5 << 2;
            this.y = n6 = this.u[1] << 2;
            if (this.s) {
                n6 -= n2;
                n2 = 0;
            } else {
                this.q = n6;
            }
            this.v = new byte[n6];
            dataInputStream.readFully(this.v, n2, n6 - n2);
            if (this.s) {
                while (n2 < n6 && this.v[n6 - 1] == -86) {
                    this.v[--n6] = 0;
                }
                this.w = new String(this.v, "US-ASCII");
            }
        }
        if (n5 > 6 && this.u[6] > this.u[1]) {
            n2 = (this.u[6] - this.u[1]) * 2;
            char[] arrc = new char[n2];
            byte[] arrby = new byte[n2 * 2];
            dataInputStream.readFully(arrby);
            for (int i2 = 0; i2 < n2; ++i2) {
                arrc[i2] = (char)(arrby[i2 * 2] << 8 | arrby[i2 * 2 + 1] & 0xFF);
            }
            this.m = new String(arrc);
            this.y = this.u[6] << 2;
        } else {
            this.m = "\u0000";
        }
        this.x = new byte[n3 - this.y];
        dataInputStream.readFully(this.x);
    }

    VersionInfo a() {
        return VersionInfo.a(this.l[0], this.l[1], this.l[2], this.l[3]);
    }

    public boolean a(byte[] arrby) {
        return arrby[0] == 1 && arrby[1] >= 1 || arrby[0] == 2;
    }

    int b() {
        return this.p;
    }

    boolean c() {
        return this.r;
    }

    boolean d() {
        return this.t;
    }

    static int a(int n2) {
        return n2 >>> 28;
    }

    private static int k(int n2) {
        return n2 & 0xFFFFFFF;
    }

    private int l(int n2) {
        return (n2 << 2) - this.y;
    }

    static int b(int n2) {
        return n2 << 4 >> 4;
    }

    static int c(int n2) {
        return n2 & 0xFFFFFFF;
    }

    static boolean d(int n2) {
        return n2 == 2 || n2 == 5 || n2 == 4;
    }

    private char m(int n2) {
        return (char)(this.x[n2] << 8 | this.x[n2 + 1] & 0xFF);
    }

    private char[] a(int n2, int n3) {
        char[] arrc = new char[n3];
        for (int i2 = 0; i2 < n3; ++i2) {
            arrc[i2] = (char)(this.x[n2] << 8 | this.x[n2 + 1] & 0xFF);
            n2 += 2;
        }
        return arrc;
    }

    private int n(int n2) {
        return this.x[n2] << 24 | (this.x[n2 + 1] & 0xFF) << 16 | (this.x[n2 + 2] & 0xFF) << 8 | this.x[n2 + 3] & 0xFF;
    }

    private int[] b(int n2, int n3) {
        int[] arrn = new int[n3];
        for (int i2 = 0; i2 < n3; ++i2) {
            arrn[i2] = this.x[n2] << 24 | (this.x[n2 + 1] & 0xFF) << 16 | (this.x[n2 + 2] & 0xFF) << 8 | this.x[n2 + 3] & 0xFF;
            n2 += 4;
        }
        return arrn;
    }

    private char[] o(int n2) {
        char c2;
        if ((c2 = this.m.charAt(n2++)) > '\u0000') {
            return this.m.substring(n2, n2 + c2).toCharArray();
        }
        return D;
    }

    private char[] p(int n2) {
        char c2 = this.m(n2);
        if (c2 > '\u0000') {
            return this.a(n2 + 2, (int)c2);
        }
        return D;
    }

    private int[] q(int n2) {
        int n3 = this.n(n2);
        if (n3 > 0) {
            return this.b(n2 + 4, n3);
        }
        return E;
    }

    private String r(int n2) {
        byte by2;
        StringBuilder stringBuilder = new StringBuilder();
        while ((by2 = this.v[n2++]) != 0) {
            stringBuilder.append((char)by2);
        }
        return stringBuilder.toString();
    }

    private String s(int n2) {
        int n3 = n2;
        while (this.o.charAt(n3) != '\u0000') {
            ++n3;
        }
        return this.o.substring(n2, n3);
    }

    private bt a(char c2) {
        if (c2 < this.q) {
            return new bt(this.v, c2);
        }
        return new bt(this.n, c2 - this.q);
    }

    private String t(int n2) {
        if (n2 < this.q) {
            return this.r(n2);
        }
        return this.s(n2 - this.q);
    }

    private bt u(int n2) {
        if (n2 >= 0) {
            return new bt(this.v, n2);
        }
        return new bt(this.n, n2 & Integer.MAX_VALUE);
    }

    private String v(int n2) {
        if (n2 >= 0) {
            return this.r(n2);
        }
        return this.s(n2 & Integer.MAX_VALUE);
    }

    private static int a(CharSequence charSequence, bt bt2) {
        int n2;
        for (n2 = 0; n2 < charSequence.length(); ++n2) {
            byte by2 = bt2.a(n2);
            if (by2 == 0) {
                return 1;
            }
            int n3 = charSequence.charAt(n2) - by2;
            if (n3 == 0) continue;
            return n3;
        }
        return -bt2.a(n2);
    }

    private int a(CharSequence charSequence, char c2) {
        return bp.a(charSequence, this.a(c2));
    }

    private int a(CharSequence charSequence, int n2) {
        return bp.a(charSequence, this.u(n2));
    }

    String e(int n2) {
        int n3 = bp.k(n2);
        if (bp.a(n2) == 6) {
            int n4;
            char c2 = this.m.charAt(n3);
            if ((c2 & 0xFFFFFC00) != 56320) {
                if (c2 == '\u0000') {
                    return F;
                }
                int n5 = n3 + 1;
                while (this.m.charAt(n5) != '\u0000') {
                    ++n5;
                }
                return this.m.substring(n3, n5);
            }
            if (c2 < '\udfef') {
                n4 = c2 & 0x3FF;
                ++n3;
            } else if (c2 < '\udfff') {
                n4 = c2 - 57327 << 16 | this.m.charAt(n3 + 1);
                n3 += 2;
            } else {
                n4 = this.m.charAt(n3 + 1) << 16 | this.m.charAt(n3 + 2);
                n3 += 3;
            }
            return this.m.substring(n3, n3 + n4);
        }
        if (n2 == n3) {
            if (n2 == 0) {
                return F;
            }
            n3 = this.l(n3);
            int n6 = this.n(n3);
            return new String(this.a(n3 + 4, n6));
        }
        return null;
    }

    String f(int n2) {
        int n3 = bp.k(n2);
        if (bp.a(n2) == 3) {
            if (n3 == 0) {
                return F;
            }
            n3 = this.l(n3);
            int n4 = this.n(n3);
            return new String(this.a(n3 + 4, n4));
        }
        return null;
    }

    byte[] a(int n2, byte[] arrby) {
        int n3 = bp.k(n2);
        if (bp.a(n2) == 1) {
            if (n3 == 0) {
                return B;
            }
            n3 = this.l(n3);
            int n4 = this.n(n3);
            if (arrby == null || arrby.length != n4) {
                arrby = new byte[n4];
            }
            System.arraycopy(this.x, n3 + 4, arrby, 0, n4);
            return arrby;
        }
        return null;
    }

    ByteBuffer g(int n2) {
        int n3 = bp.k(n2);
        if (bp.a(n2) == 1) {
            if (n3 == 0) {
                return C.duplicate();
            }
            n3 = this.l(n3);
            int n4 = this.n(n3);
            return ByteBuffer.wrap(this.x, n3 + 4, n4).slice().asReadOnlyBuffer();
        }
        return null;
    }

    int[] h(int n2) {
        int n3 = bp.k(n2);
        if (bp.a(n2) == 14) {
            if (n3 == 0) {
                return E;
            }
            n3 = this.l(n3);
            int n4 = this.n(n3);
            return this.b(n3 + 4, n4);
        }
        return null;
    }

    bu i(int n2) {
        int n3 = bp.a(n2);
        int n4 = bp.k(n2);
        switch (n3) {
            case 8: 
            case 9: {
                if (n4 != 0) break;
                return new bu(this);
            }
            default: {
                return null;
            }
        }
        switch (n3) {
            case 8: {
                return new br(this, n4);
            }
            case 9: {
                return new bs(this, n4);
            }
        }
        return null;
    }

    bx j(int n2) {
        int n3 = bp.a(n2);
        int n4 = bp.k(n2);
        switch (n3) {
            case 2: 
            case 4: 
            case 5: {
                if (n4 != 0) break;
                return new bx(this);
            }
            default: {
                return null;
            }
        }
        switch (n3) {
            case 2: {
                return new bz(this, n4);
            }
            case 5: {
                return new by(this, n4);
            }
            case 4: {
                return new ca(this, n4);
            }
        }
        return null;
    }

    public static String a(String string, String string2) {
        if (string == null || string.length() == 0) {
            if (string2.length() == 0) {
                string2 = dn.b().toString();
                return string2;
            }
            return string2 + G;
        }
        if (string.indexOf(46) == -1) {
            if (string.charAt(string.length() - 1) != '/') {
                return string + "/" + string2 + G;
            }
            return string + string2 + G;
        }
        string = string.replace('.', '/');
        if (string2.length() == 0) {
            return string + G;
        }
        return string + "_" + string2 + G;
    }

    static /* synthetic */ bp e() {
        return A;
    }

    /* synthetic */ bp(InputStream inputStream, String string, String string2, ClassLoader classLoader, bq bq2) {
        this(inputStream, string, string2, classLoader);
    }

    static /* synthetic */ String a(bp bp2) {
        return bp2.m;
    }

    static /* synthetic */ int a(bp bp2, int n2) {
        return bp2.n(n2);
    }

    static /* synthetic */ int b(bp bp2, int n2) {
        return bp2.l(n2);
    }

    static /* synthetic */ String c(bp bp2, int n2) {
        return bp2.t(n2);
    }

    static /* synthetic */ String d(bp bp2, int n2) {
        return bp2.v(n2);
    }

    static /* synthetic */ int a(bp bp2, CharSequence charSequence, char c2) {
        return bp2.a(charSequence, c2);
    }

    static /* synthetic */ int a(bp bp2, CharSequence charSequence, int n2) {
        return bp2.a(charSequence, n2);
    }

    static /* synthetic */ char[] e(bp bp2, int n2) {
        return bp2.p(n2);
    }

    static /* synthetic */ char[] f(bp bp2, int n2) {
        return bp2.o(n2);
    }

    static /* synthetic */ int[] g(bp bp2, int n2) {
        return bp2.q(n2);
    }
}

