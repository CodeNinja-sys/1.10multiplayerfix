/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x;

import com.a.a.n.a.gf;
import io.netty.channel.epoll.i;
import net.minecraft.u.bd;

class aq
extends bd {
    aq() {
    }

    protected i c() {
        return new i(0, new gf().a("Netty Epoll Client IO #%d").a(true).a());
    }

    @Override
    protected /* synthetic */ Object b() {
        return this.c();
    }
}

