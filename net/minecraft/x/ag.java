/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x;

import io.netty.b.g;
import io.netty.c.a.p;
import io.netty.channel.bd;
import net.minecraft.x.a;

public class ag
extends p {
    protected void a(bd bd2, g g2, g g3) {
        int n2 = g2.r();
        int n3 = a.a(n2);
        if (n3 > 3) {
            throw new IllegalArgumentException("unable to fit " + n2 + " into " + 3);
        }
        a a2 = new a(g3);
        a2.k(n3 + n2);
        a2.d(n2);
        a2.b(g2, g2.p(), n2);
    }

    @Override
    protected /* synthetic */ void a(bd bd2, Object object, g g2) {
        this.a(bd2, (g)object, g2);
    }
}

