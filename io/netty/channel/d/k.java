/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.d;

import io.netty.channel.ap;
import io.netty.channel.br;
import io.netty.channel.d.e;
import io.netty.channel.d.i;
import io.netty.channel.d.j;
import io.netty.channel.dh;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

final class k
extends e {
    private final List f;
    static final /* synthetic */ boolean b;
    final /* synthetic */ i e;

    private k(i i2) {
        this.e = i2;
        super(i2);
        this.f = new ArrayList();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void j() {
        if (!b && !this.e.W().bt_()) {
            throw new AssertionError();
        }
        ap ap2 = this.e.G();
        if (!ap2.g() && !this.e.Y()) {
            this.k();
            return;
        }
        int n2 = ap2.c();
        br br2 = this.e.c();
        boolean bl2 = false;
        Throwable throwable = null;
        try {
            int n3;
            try {
                while ((n3 = this.e.a(this.f)) != 0) {
                    if (n3 < 0) {
                        bl2 = true;
                    } else if (ap2.g() && this.f.size() < n2) continue;
                    break;
                }
            }
            catch (Throwable throwable2) {
                throwable = throwable2;
            }
            this.e.b(false);
            n3 = this.f.size();
            for (int i2 = 0; i2 < n3; ++i2) {
                br2.b(this.f.get(i2));
            }
            this.f.clear();
            br2.n();
            if (throwable != null) {
                if (throwable instanceof IOException) {
                    bl2 = !(this.e instanceof dh);
                }
                br2.a(throwable);
            }
            if (bl2 && this.e.H()) {
                this.b(this.h());
            }
        }
        finally {
            if (!ap2.g() && !this.e.Y()) {
                this.k();
            }
        }
    }

    /* synthetic */ k(i i2, j j2) {
        this(i2);
    }

    static {
        b = !i.class.desiredAssertionStatus();
    }
}

