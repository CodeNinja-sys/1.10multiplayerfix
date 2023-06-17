/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.g;

import com.a.a.g.ae;
import com.a.a.g.aj;
import com.a.a.g.bk;
import com.a.a.g.d;
import com.a.a.g.e;
import com.a.a.g.g;
import com.a.a.g.u;
import java.io.IOException;

final class f
extends d {
    final g a;
    static final int b = 255;
    final /* synthetic */ e c;

    f(e e2, int n2) {
        this.c = e2;
        this.a = new g(n2);
    }

    @Override
    public aj b(byte by2) {
        this.a.write(by2);
        return this;
    }

    @Override
    public aj b(byte[] arrby) {
        try {
            this.a.write(arrby);
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
        return this;
    }

    @Override
    public aj b(byte[] arrby, int n2, int n3) {
        this.a.write(arrby, n2, n3);
        return this;
    }

    @Override
    public aj a(short s2) {
        this.a.write(s2 & 0xFF);
        this.a.write(s2 >>> 8 & 0xFF);
        return this;
    }

    @Override
    public aj a(int n2) {
        this.a.write(n2 & 0xFF);
        this.a.write(n2 >>> 8 & 0xFF);
        this.a.write(n2 >>> 16 & 0xFF);
        this.a.write(n2 >>> 24 & 0xFF);
        return this;
    }

    @Override
    public aj a(long l2) {
        for (int i2 = 0; i2 < 64; i2 += 8) {
            this.a.write((byte)(l2 >>> i2 & 0xFFL));
        }
        return this;
    }

    @Override
    public aj a(char c2) {
        this.a.write(c2 & 0xFF);
        this.a.write(c2 >>> 8 & 0xFF);
        return this;
    }

    @Override
    public aj a(Object object, u u2) {
        u2.a(object, this);
        return this;
    }

    @Override
    public ae a() {
        return this.c.a(this.a.a(), 0, this.a.b());
    }

    @Override
    public /* synthetic */ bk b(char c2) {
        return this.a(c2);
    }

    @Override
    public /* synthetic */ bk b(long l2) {
        return this.a(l2);
    }

    @Override
    public /* synthetic */ bk b(int n2) {
        return this.a(n2);
    }

    @Override
    public /* synthetic */ bk b(short s2) {
        return this.a(s2);
    }

    @Override
    public /* synthetic */ bk c(byte[] arrby, int n2, int n3) {
        return this.b(arrby, n2, n3);
    }

    @Override
    public /* synthetic */ bk c(byte[] arrby) {
        return this.b(arrby);
    }

    @Override
    public /* synthetic */ bk c(byte by2) {
        return this.b(by2);
    }
}

