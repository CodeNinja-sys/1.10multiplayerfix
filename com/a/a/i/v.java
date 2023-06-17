/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.b.cl;
import com.a.a.b.e;
import com.a.a.g.ae;
import com.a.a.g.ai;
import com.a.a.i.b;
import com.a.a.i.o;
import com.a.a.i.s;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;

class v
extends s {
    protected final byte[] a;

    protected v(byte[] arrby) {
        this.a = (byte[])cl.a(arrby);
    }

    @Override
    public InputStream a() {
        return new ByteArrayInputStream(this.a);
    }

    @Override
    public InputStream c() {
        return this.a();
    }

    @Override
    public boolean d() {
        return this.a.length == 0;
    }

    @Override
    public long e() {
        return this.a.length;
    }

    @Override
    public byte[] f() {
        return (byte[])this.a.clone();
    }

    @Override
    public long a(OutputStream outputStream) {
        outputStream.write(this.a);
        return this.a.length;
    }

    @Override
    public Object a(o o2) {
        o2.a(this.a, 0, this.a.length);
        return o2.a();
    }

    @Override
    public ae a(ai ai2) {
        return ai2.a(this.a);
    }

    public String toString() {
        return "ByteSource.wrap(" + e.a(b.i().a(this.a), 30, "...") + ")";
    }

    @Override
    public /* synthetic */ Object h() {
        return super.b();
    }
}

