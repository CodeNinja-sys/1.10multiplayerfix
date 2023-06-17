/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.gh;
import com.ibm.icu.a.gj;
import com.ibm.icu.a.gl;
import com.ibm.icu.a.gm;
import com.ibm.icu.a.gn;
import com.ibm.icu.a.go;
import com.ibm.icu.a.gp;
import com.ibm.icu.a.gs;
import com.ibm.icu.a.gt;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.util.Iterator;

public abstract class gg
implements Iterable {
    private static go O = new gh();
    gn a;
    char[] b;
    int c;
    int[] d;
    int e;
    int f;
    int g;
    int h;
    int i;
    int j;
    int k;
    int l;
    int m;
    static final int n = 15;
    static final int o = 11;
    static final int p = 5;
    static final int q = 6;
    static final int r = 32;
    static final int s = 2048;
    static final int t = 64;
    static final int u = 63;
    static final int v = 32;
    static final int w = 31;
    static final int x = 2;
    static final int y = 4;
    static final int z = 0;
    static final int A = 2048;
    static final int B = 32;
    static final int C = 2080;
    static final int D = 2080;
    static final int E = 32;
    static final int F = 2112;
    static final int G = 512;
    static final int H = 128;
    static final int I = 192;
    static final int J = 2080;
    static final int K = 576;
    static final int L = 35488;
    static final int M = 544;
    static final int N = 1115264;

    public static gg a(InputStream inputStream) {
        int n2;
        gg gg2;
        gp gp2;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        boolean bl2 = false;
        gn gn2 = new gn();
        gn2.a = dataInputStream.readInt();
        switch (gn2.a) {
            case 1416784178: {
                bl2 = false;
                break;
            }
            case 845771348: {
                bl2 = true;
                gn2.a = Integer.reverseBytes(gn2.a);
                break;
            }
            default: {
                throw new IllegalArgumentException("Stream does not contain a serialized UTrie2");
            }
        }
        gn2.b = gg.a(bl2, dataInputStream.readUnsignedShort());
        gn2.c = gg.a(bl2, dataInputStream.readUnsignedShort());
        gn2.d = gg.a(bl2, dataInputStream.readUnsignedShort());
        gn2.e = gg.a(bl2, dataInputStream.readUnsignedShort());
        gn2.f = gg.a(bl2, dataInputStream.readUnsignedShort());
        gn2.g = gg.a(bl2, dataInputStream.readUnsignedShort());
        if ((gn2.b & 0xF) > 1) {
            throw new IllegalArgumentException("UTrie2 serialized format error.");
        }
        if ((gn2.b & 0xF) == 0) {
            gp2 = gp.a;
            gg2 = new gs();
        } else {
            gp2 = gp.b;
            gg2 = new gt();
        }
        gg2.a = gn2;
        gg2.e = gn2.c;
        gg2.f = gn2.d << 2;
        gg2.g = gn2.e;
        gg2.l = gn2.f;
        gg2.j = gn2.g << 11;
        gg2.k = gg2.f - 4;
        if (gp2 == gp.a) {
            gg2.k += gg2.e;
        }
        int n3 = gg2.e;
        if (gp2 == gp.a) {
            n3 += gg2.f;
        }
        gg2.b = new char[n3];
        for (n2 = 0; n2 < gg2.e; ++n2) {
            gg2.b[n2] = gg.a(bl2, dataInputStream.readChar());
        }
        if (gp2 == gp.a) {
            gg2.c = gg2.e;
            for (n2 = 0; n2 < gg2.f; ++n2) {
                gg2.b[gg2.c + n2] = gg.a(bl2, dataInputStream.readChar());
            }
        } else {
            gg2.d = new int[gg2.f];
            for (n2 = 0; n2 < gg2.f; ++n2) {
                gg2.d[n2] = gg.b(bl2, dataInputStream.readInt());
            }
        }
        switch (gp2) {
            case a: {
                gg2.d = null;
                gg2.h = gg2.b[gg2.l];
                gg2.i = gg2.b[gg2.c + 128];
                break;
            }
            case b: {
                gg2.c = 0;
                gg2.h = gg2.d[gg2.l];
                gg2.i = gg2.d[128];
                break;
            }
            default: {
                throw new IllegalArgumentException("UTrie2 serialized format error.");
            }
        }
        return gg2;
    }

    private static int a(boolean bl2, int n2) {
        return bl2 ? Short.reverseBytes((short)n2) & 0xFFFF : n2;
    }

    private static char a(boolean bl2, char c2) {
        return bl2 ? (char)Short.reverseBytes((short)c2) : c2;
    }

    private static int b(boolean bl2, int n2) {
        return bl2 ? Integer.reverseBytes(n2) : n2;
    }

    public static int a(InputStream inputStream, boolean bl2) {
        if (!inputStream.markSupported()) {
            throw new IllegalArgumentException("Input stream must support mark().");
        }
        inputStream.mark(4);
        byte[] arrby = new byte[4];
        int n2 = inputStream.read(arrby);
        inputStream.reset();
        if (n2 != arrby.length) {
            return 0;
        }
        if (arrby[0] == 84 && arrby[1] == 114 && arrby[2] == 105 && arrby[3] == 101) {
            return 1;
        }
        if (arrby[0] == 84 && arrby[1] == 114 && arrby[2] == 105 && arrby[3] == 50) {
            return 2;
        }
        if (bl2) {
            if (arrby[0] == 101 && arrby[1] == 105 && arrby[2] == 114 && arrby[3] == 84) {
                return 1;
            }
            if (arrby[0] == 50 && arrby[1] == 105 && arrby[2] == 114 && arrby[3] == 84) {
                return 2;
            }
        }
        return 0;
    }

    public abstract int a(int var1);

    public abstract int a(char var1);

    public final boolean equals(Object object) {
        if (!(object instanceof gg)) {
            return false;
        }
        gg gg2 = (gg)object;
        Iterator iterator = gg2.iterator();
        for (gl gl2 : this) {
            if (!iterator.hasNext()) {
                return false;
            }
            gl gl3 = (gl)iterator.next();
            if (gl2.equals(gl3)) continue;
            return false;
        }
        if (iterator.hasNext()) {
            return false;
        }
        return this.i == gg2.i && this.h == gg2.h;
    }

    public int hashCode() {
        if (this.m == 0) {
            int n2 = gg.b();
            for (gl gl2 : this) {
                n2 = gg.f(n2, gl2.hashCode());
            }
            if (n2 == 0) {
                n2 = 1;
            }
            this.m = n2;
        }
        return this.m;
    }

    public Iterator iterator() {
        return this.a(O);
    }

    public Iterator a(go go2) {
        return new gm(this, go2);
    }

    public Iterator a(char c2, go go2) {
        return new gm(this, c2, go2);
    }

    public Iterator b(char c2) {
        return new gm(this, c2, O);
    }

    protected int a(DataOutputStream dataOutputStream) {
        int n2 = 0;
        dataOutputStream.writeInt(this.a.a);
        dataOutputStream.writeShort(this.a.b);
        dataOutputStream.writeShort(this.a.c);
        dataOutputStream.writeShort(this.a.d);
        dataOutputStream.writeShort(this.a.e);
        dataOutputStream.writeShort(this.a.f);
        dataOutputStream.writeShort(this.a.g);
        n2 += 16;
        for (int i2 = 0; i2 < this.a.c; ++i2) {
            dataOutputStream.writeChar(this.b[i2]);
        }
        return n2 += this.a.c;
    }

    public gj a(CharSequence charSequence, int n2) {
        return new gj(this, charSequence, n2);
    }

    int a(int n2, int n3, int n4) {
        int n5;
        int n6 = Math.min(this.j, n3);
        for (n5 = n2 + 1; n5 < n6 && this.a(n5) == n4; ++n5) {
        }
        if (n5 >= this.j) {
            n5 = n3;
        }
        return n5 - 1;
    }

    private static int b() {
        return -2128831035;
    }

    private static int d(int n2, int n3) {
        n2 *= 16777619;
        return n2 ^= n3;
    }

    private static int e(int n2, int n3) {
        n2 = gg.d(n2, n3 & 0xFF);
        n2 = gg.d(n2, n3 >> 8 & 0xFF);
        n2 = gg.d(n2, n3 >> 16);
        return n2;
    }

    private static int f(int n2, int n3) {
        n2 = gg.d(n2, n3 & 0xFF);
        n2 = gg.d(n2, n3 >> 8 & 0xFF);
        n2 = gg.d(n2, n3 >> 16 & 0xFF);
        n2 = gg.d(n2, n3 >> 24 & 0xFF);
        return n2;
    }

    static /* synthetic */ int a() {
        return gg.b();
    }

    static /* synthetic */ int a(int n2, int n3) {
        return gg.e(n2, n3);
    }

    static /* synthetic */ int b(int n2, int n3) {
        return gg.f(n2, n3);
    }

    static /* synthetic */ int c(int n2, int n3) {
        return gg.d(n2, n3);
    }
}

