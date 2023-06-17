/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x;

import io.netty.b.g;
import io.netty.c.a.p;
import io.netty.channel.bd;
import javax.crypto.Cipher;
import net.minecraft.x.am;

public class h
extends p {
    private final am a;

    public h(Cipher cipher) {
        this.a = new am(cipher);
    }

    protected void a(bd bd2, g g2, g g3) {
        this.a.a(g2, g3);
    }

    @Override
    protected /* synthetic */ void a(bd bd2, Object object, g g2) {
        this.a(bd2, (g)object, g2);
    }
}

