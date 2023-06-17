/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.g;

import com.a.a.b.cl;
import com.a.a.g.a;
import com.a.a.g.ae;
import com.a.a.g.r;
import com.a.a.g.s;
import java.util.zip.Checksum;

final class t
extends a {
    private final Checksum b;
    final /* synthetic */ r a;

    private t(r r2, Checksum checksum) {
        this.a = r2;
        this.b = (Checksum)cl.a(checksum);
    }

    @Override
    protected void a(byte by2) {
        this.b.update(by2);
    }

    @Override
    protected void a(byte[] arrby, int n2, int n3) {
        this.b.update(arrby, n2, n3);
    }

    @Override
    public ae a() {
        long l2 = this.b.getValue();
        if (r.a(this.a) == 32) {
            return ae.a((int)l2);
        }
        return ae.a(l2);
    }

    /* synthetic */ t(r r2, Checksum checksum, s s2) {
        this(r2, checksum);
    }
}

