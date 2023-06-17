/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.am;
import com.ibm.icu.a.gg;
import com.ibm.icu.d.jd;
import com.ibm.icu.d.jo;
import com.ibm.icu.d.jq;
import com.ibm.icu.d.jr;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.InputStream;

class jp {
    jr a;
    int[] b;
    short[] c;
    jq[] d;
    char[] e;
    gg f;
    gg g;
    jo[] h;
    static final /* synthetic */ boolean i;

    public static jp a() {
        InputStream inputStream = am.c("data/icudt51b/confusables.cfu");
        jp jp2 = new jp(inputStream);
        return jp2;
    }

    public jp() {
        this.a = new jr();
        this.a.a = 944111087;
        this.a.b[0] = 1;
        this.a.b[1] = 0;
        this.a.b[2] = 0;
        this.a.b[3] = 0;
    }

    public jp(InputStream inputStream) {
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(inputStream));
        dataInputStream.skip(128L);
        if (!i && !dataInputStream.markSupported()) {
            throw new AssertionError();
        }
        dataInputStream.mark(Integer.MAX_VALUE);
        this.a = new jr(dataInputStream);
        this.a(dataInputStream);
    }

    static boolean a(jr jr2) {
        return jr2 != null && jr2.a == 944111087 && jr2.b[0] <= 1 && jr2.b[1] <= 0;
    }

    void a(DataInputStream dataInputStream) {
        int n2;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        dataInputStream.reset();
        dataInputStream.skip(this.a.d);
        if (this.a.d != 0) {
            this.b = new int[this.a.e];
            for (n2 = 0; n2 < this.a.e; ++n2) {
                this.b[n2] = dataInputStream.readInt();
            }
        }
        dataInputStream.reset();
        dataInputStream.skip(this.a.f);
        if (this.a.f != 0) {
            this.c = new short[this.a.g];
            for (n2 = 0; n2 < this.a.g; ++n2) {
                this.c[n2] = dataInputStream.readShort();
            }
        }
        dataInputStream.reset();
        dataInputStream.skip(this.a.h);
        if (this.a.h != 0) {
            this.e = new char[this.a.i];
            for (n2 = 0; n2 < this.a.i; ++n2) {
                this.e[n2] = dataInputStream.readChar();
            }
        }
        dataInputStream.reset();
        dataInputStream.skip(this.a.j);
        if (this.a.j != 0) {
            this.d = new jq[this.a.k];
            for (n2 = 0; n2 < this.a.k; ++n2) {
                this.d[n2] = new jq(null);
                this.d[n2].a = dataInputStream.readShort();
                this.d[n2].b = dataInputStream.readShort();
            }
        }
        dataInputStream.reset();
        dataInputStream.skip(this.a.l);
        if (this.f == null && this.a.l != 0) {
            this.f = gg.a(dataInputStream);
        }
        dataInputStream.reset();
        dataInputStream.skip(this.a.n);
        if (this.g == null && this.a.n != 0) {
            this.g = gg.a(dataInputStream);
        }
        dataInputStream.reset();
        dataInputStream.skip(this.a.p);
        if (this.a.p != 0) {
            this.h = new jo[this.a.q];
            for (n2 = 0; n2 < this.a.q; ++n2) {
                this.h[n2] = new jo(dataInputStream);
            }
        }
    }

    static {
        i = !jd.class.desiredAssertionStatus();
    }
}

