/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x;

import io.netty.b.g;
import io.netty.c.a.t;
import io.netty.channel.bd;
import java.util.List;
import javax.crypto.Cipher;
import net.minecraft.x.am;

public class u
extends t {
    private final am a;

    public u(Cipher cipher) {
        this.a = new am(cipher);
    }

    protected void a(bd bd2, g g2, List list) {
        list.add(this.a.a(bd2, g2));
    }

    @Override
    protected /* synthetic */ void a(bd bd2, Object object, List list) {
        this.a(bd2, (g)object, list);
    }
}

