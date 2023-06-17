/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.d;

import io.netty.b.g;
import io.netty.b.h;
import io.netty.channel.ap;
import io.netty.channel.bi;
import io.netty.channel.br;
import io.netty.channel.d.a;
import io.netty.channel.d.b;
import io.netty.channel.d.e;
import io.netty.channel.dg;
import java.io.IOException;
import java.nio.channels.SelectionKey;

final class c
extends e {
    private dg e;
    final /* synthetic */ a b;

    private c(a a2) {
        this.b = a2;
        super(a2);
    }

    private void a(br br2) {
        SelectionKey selectionKey = this.b.X();
        this.b.Z();
        if (this.b.H()) {
            if (Boolean.TRUE.equals(this.b.G().a(bi.i))) {
                selectionKey.interestOps(selectionKey.interestOps() & ~this.b.c);
                br2.a(io.netty.channel.h.a.a);
            } else {
                this.b(this.h());
            }
        }
    }

    private void a(br br2, g g2, Throwable throwable, boolean bl2) {
        if (g2 != null) {
            if (g2.u()) {
                this.b.b(false);
                br2.b(g2);
            } else {
                g2.ad();
            }
        }
        br2.n();
        br2.a(throwable);
        if (bl2 || throwable instanceof IOException) {
            this.a(br2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void j() {
        ap ap2 = this.b.G();
        if (!ap2.g() && !this.b.Y()) {
            this.k();
            return;
        }
        br br2 = this.b.c();
        h h2 = ap2.e();
        int n2 = ap2.c();
        dg dg2 = this.e;
        if (dg2 == null) {
            this.e = dg2 = ap2.f().a();
        }
        g g2 = null;
        int n3 = 0;
        boolean bl2 = false;
        try {
            int n4;
            int n5;
            int n6 = 0;
            boolean bl3 = false;
            do {
                g2 = dg2.a(h2);
                n4 = g2.s();
                n5 = this.b.a(g2);
                if (n5 <= 0) {
                    g2.ad();
                    bl2 = n5 < 0;
                    break;
                }
                if (!bl3) {
                    bl3 = true;
                    this.b.b(false);
                }
                br2.b(g2);
                g2 = null;
                if (n6 >= Integer.MAX_VALUE - n5) {
                    n6 = Integer.MAX_VALUE;
                    break;
                }
                n6 += n5;
            } while (ap2.g() && n5 >= n4 && ++n3 < n2);
            br2.n();
            dg2.a(n6);
            if (bl2) {
                this.a(br2);
                bl2 = false;
            }
        }
        catch (Throwable throwable) {
            this.a(br2, g2, throwable, bl2);
        }
        finally {
            if (!ap2.g() && !this.b.Y()) {
                this.k();
            }
        }
    }

    /* synthetic */ c(a a2, b b2) {
        this(a2);
    }
}

