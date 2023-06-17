/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x;

import io.netty.channel.an;
import io.netty.channel.ba;
import io.netty.channel.bg;
import net.minecraft.x.ak;

class ac
extends bg {
    private final /* synthetic */ ak a;

    ac(ak ak2) {
        this.a = ak2;
    }

    @Override
    protected void a(an an2) {
        an2.c().b("packet_handler", (ba)this.a);
    }
}

