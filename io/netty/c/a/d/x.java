/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d;

import io.netty.b.g;
import io.netty.c.a.d.ad;
import io.netty.c.a.d.bs;
import io.netty.c.a.d.j;
import io.netty.c.d.b;
import io.netty.channel.bd;

public class x
implements b {
    private final b a;
    private final bs b;
    private boolean c;

    public x(b b2) {
        this.a = b2;
        this.b = bs.b;
    }

    public x(b b2, bs bs2) {
        this.a = b2;
        this.b = bs2;
    }

    @Override
    public boolean a() {
        if (this.a.a()) {
            return this.c;
        }
        return false;
    }

    @Override
    public void b() {
        this.a.b();
    }

    public ad a(bd bd2) {
        if (this.a.a()) {
            if (this.c) {
                return null;
            }
            this.c = true;
            return this.b;
        }
        g g2 = (g)this.a.b(bd2);
        return new j(g2);
    }

    @Override
    public /* synthetic */ Object b(bd bd2) {
        return this.a(bd2);
    }
}

