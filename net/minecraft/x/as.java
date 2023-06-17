/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x;

import com.a.a.n.a.gf;
import io.netty.channel.c.k;
import net.minecraft.u.bd;

class as
extends bd {
    as() {
    }

    protected k c() {
        return new k(0, new gf().a("Netty Local Client IO #%d").a(true).a());
    }

    @Override
    protected /* synthetic */ Object b() {
        return this.c();
    }
}

