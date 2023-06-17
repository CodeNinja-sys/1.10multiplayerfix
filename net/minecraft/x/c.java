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
import net.minecraft.c.c.b;
import net.minecraft.x.ag;
import net.minecraft.x.ak;
import net.minecraft.x.al;
import net.minecraft.x.at;
import net.minecraft.x.av;
import net.minecraft.x.d;
import net.minecraft.x.n;
import net.minecraft.x.s;

class c
extends bg {
    final /* synthetic */ av a;

    c(av av2) {
        this.a = av2;
    }

    @Override
    protected void a(an an2) {
        try {
            an2.G().a(bi.y, true);
        }
        catch (ar ar2) {
            // empty catch block
        }
        an2.c().b("timeout", (ba)new i(30)).b("legacy_query", (ba)new s(this.a)).b("splitter", (ba)new al()).b("decoder", (ba)new n(at.a)).b("prepender", (ba)new ag()).b("encoder", (ba)new d(at.b));
        ak ak2 = new ak(at.a);
        av.a(this.a).add(ak2);
        an2.c().b("packet_handler", (ba)ak2);
        ak2.a(new b(av.b(this.a), ak2));
    }
}

