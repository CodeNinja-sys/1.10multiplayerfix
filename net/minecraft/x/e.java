/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x;

import io.netty.channel.an;
import io.netty.channel.ba;
import io.netty.channel.bg;
import net.minecraft.client.l.m;
import net.minecraft.x.ak;
import net.minecraft.x.at;
import net.minecraft.x.av;

class e
extends bg {
    final /* synthetic */ av a;

    e(av av2) {
        this.a = av2;
    }

    @Override
    protected void a(an an2) {
        ak ak2 = new ak(at.a);
        ak2.a(new m(av.b(this.a), ak2));
        av.a(this.a).add(ak2);
        an2.c().b("packet_handler", (ba)ak2);
    }
}

