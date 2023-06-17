/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.b.cl;
import com.a.a.i.ak;
import com.a.a.i.v;
import java.nio.charset.Charset;

final class x
extends v {
    private static final x b = new x();

    private x() {
        super(new byte[0]);
    }

    @Override
    public ak a(Charset charset) {
        cl.a(charset);
        return ak.i();
    }

    @Override
    public byte[] f() {
        return this.a;
    }

    @Override
    public String toString() {
        return "ByteSource.empty()";
    }

    static /* synthetic */ x i() {
        return b;
    }
}

