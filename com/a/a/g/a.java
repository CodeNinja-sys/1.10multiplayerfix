/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.g;

import com.a.a.b.cl;
import com.a.a.g.aj;
import com.a.a.g.bk;
import com.a.a.g.d;
import com.a.a.g.u;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

abstract class a
extends d {
    private final ByteBuffer a = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);

    a() {
    }

    protected abstract void a(byte var1);

    protected void a(byte[] arrby) {
        this.a(arrby, 0, arrby.length);
    }

    protected void a(byte[] arrby, int n2, int n3) {
        for (int i2 = n2; i2 < n2 + n3; ++i2) {
            this.a(arrby[i2]);
        }
    }

    @Override
    public aj b(byte by2) {
        this.a(by2);
        return this;
    }

    @Override
    public aj b(byte[] arrby) {
        cl.a(arrby);
        this.a(arrby);
        return this;
    }

    @Override
    public aj b(byte[] arrby, int n2, int n3) {
        cl.a(n2, n2 + n3, arrby.length);
        this.a(arrby, n2, n3);
        return this;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private aj c(int n2) {
        try {
            this.a(this.a.array(), 0, n2);
        }
        finally {
            this.a.clear();
        }
        return this;
    }

    @Override
    public aj a(short s2) {
        this.a.putShort(s2);
        return this.c(2);
    }

    @Override
    public aj a(int n2) {
        this.a.putInt(n2);
        return this.c(4);
    }

    @Override
    public aj a(long l2) {
        this.a.putLong(l2);
        return this.c(8);
    }

    @Override
    public aj a(char c2) {
        this.a.putChar(c2);
        return this.c(2);
    }

    @Override
    public aj a(Object object, u u2) {
        u2.a(object, this);
        return this;
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

