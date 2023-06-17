/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x;

import com.a.a.n.a.gf;
import io.netty.channel.d.n;
import net.minecraft.u.bd;

class an
extends bd {
    an() {
    }

    protected n c() {
        return new n(0, new gf().a("Netty Client IO #%d").a(true).a());
    }

    @Override
    protected /* synthetic */ Object b() {
        return this.c();
    }
}

