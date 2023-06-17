/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x;

import io.netty.c.e.i;
import io.netty.channel.an;
import io.netty.channel.ar;
import io.netty.channel.ba;
import io.netty.channel.bg;
import io.netty.channel.bi;
import net.minecraft.x.ag;
import net.minecraft.x.ak;
import net.minecraft.x.al;
import net.minecraft.x.at;
import net.minecraft.x.d;
import net.minecraft.x.n;

class g
extends bg {
    private final /* synthetic */ ak a;

    g(ak ak2) {
        this.a = ak2;
    }

    @Override
    protected void a(an an2) {
        try {
            an2.G().a(bi.y, true);
        }
        catch (ar ar2) {
            // empty catch block
        }
        an2.c().b("timeout", (ba)new i(30)).b("splitter", (ba)new al()).b("decoder", (ba)new n(at.b)).b("prepender", (ba)new ag()).b("encoder", (ba)new d(at.a)).b("packet_handler", (ba)this.a);
    }
}

