/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.c;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.b.a;
import org.apache.commons.b.c.c;
import org.apache.commons.b.c.o;

public class b
extends o {
    private final boolean a;
    private final List b;
    private a c;
    private int[] d;
    private int e;
    private int f;
    private int g;
    private boolean h;
    private static final Comparator i = new c();

    public b(InputStream inputStream) {
        this(inputStream, false, org.apache.commons.b.a.a);
    }

    public b(InputStream inputStream, boolean bl2) {
        this(inputStream, bl2, org.apache.commons.b.a.a);
    }

    public b(InputStream inputStream, a ... arra) {
        this(inputStream, false, arra);
    }

    public b(InputStream inputStream, boolean bl2, a ... arra) {
        super(inputStream);
        if (arra == null || arra.length == 0) {
            throw new IllegalArgumentException("No BOMs specified");
        }
        this.a = bl2;
        Arrays.sort(arra, i);
        this.b = Arrays.asList(arra);
    }

    public boolean a() {
        return this.b() != null;
    }

    public boolean a(a a2) {
        if (!this.b.contains(a2)) {
            throw new IllegalArgumentException("Stream not configure to detect " + a2);
        }
        return this.c != null && this.b().equals(a2);
    }

    public a b() {
        if (this.d == null) {
            this.e = 0;
            int n2 = ((a)this.b.get(0)).b();
            this.d = new int[n2];
            for (int i2 = 0; i2 < this.d.length; ++i2) {
                this.d[i2] = this.in.read();
                ++this.e;
                if (this.d[i2] < 0) break;
            }
            this.c = this.e();
            if (this.c != null && !this.a) {
                if (this.c.b() < this.d.length) {
                    this.f = this.c.b();
                } else {
                    this.e = 0;
                }
            }
        }
        return this.c;
    }

    public String c() {
        this.b();
        return this.c == null ? null : this.c.a();
    }

    private int d() {
        this.b();
        return this.f < this.e ? this.d[this.f++] : -1;
    }

    private a e() {
        for (a a2 : this.b) {
            if (!this.b(a2)) continue;
            return a2;
        }
        return null;
    }

    private boolean b(a a2) {
        for (int i2 = 0; i2 < a2.b(); ++i2) {
            if (a2.a(i2) == this.d[i2]) continue;
            return false;
        }
        return true;
    }

    @Override
    public int read() {
        int n2 = this.d();
        return n2 >= 0 ? n2 : this.in.read();
    }

    @Override
    public int read(byte[] arrby, int n2, int n3) {
        int n4 = 0;
        int n5 = 0;
        while (n3 > 0 && n5 >= 0) {
            n5 = this.d();
            if (n5 < 0) continue;
            arrby[n2++] = (byte)(n5 & 0xFF);
            --n3;
            ++n4;
        }
        int n6 = this.in.read(arrby, n2, n3);
        return n6 < 0 ? (n4 > 0 ? n4 : -1) : n4 + n6;
    }

    @Override
    public int read(byte[] arrby) {
        return this.read(arrby, 0, arrby.length);
    }

    @Override
    public synchronized void mark(int n2) {
        this.g = this.f;
        this.h = this.d == null;
        this.in.mark(n2);
    }

    @Override
    public synchronized void reset() {
        this.f = this.g;
        if (this.h) {
            this.d = null;
        }
        this.in.reset();
    }

    @Override
    public long skip(long l2) {
        while (l2 > 0L && this.d() >= 0) {
            --l2;
        }
        return this.in.skip(l2);
    }
}

