/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.l;

import io.netty.channel.an;
import io.netty.channel.ar;
import io.netty.channel.ba;
import io.netty.channel.bg;
import io.netty.channel.bi;
import net.minecraft.client.i.a;
import net.minecraft.client.i.o;
import net.minecraft.client.l.c;
import net.minecraft.client.l.n;

class b
extends bg {
    final /* synthetic */ c a;
    private final /* synthetic */ o b;
    private final /* synthetic */ a c;

    b(c c2, o o2, a a2) {
        this.a = c2;
        this.b = o2;
        this.c = a2;
    }

    @Override
    protected void a(an an2) {
        try {
            an2.G().a(bi.y, true);
        }
        catch (ar ar2) {
            // empty catch block
        }
        an2.c().b(new ba[]{new n(this, this.b, this.c)});
    }
}

