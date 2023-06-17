/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x;

import io.netty.b.bi;
import io.netty.b.g;
import io.netty.c.a.d;
import io.netty.c.a.f;
import io.netty.channel.bd;
import java.util.List;
import net.minecraft.x.a;

public class al
extends d {
    @Override
    protected void a(bd bd2, g g2, List list) {
        g2.x();
        byte[] arrby = new byte[3];
        for (int i2 = 0; i2 < arrby.length; ++i2) {
            if (!g2.u()) {
                g2.y();
                return;
            }
            arrby[i2] = g2.E();
            if (arrby[i2] < 0) continue;
            a a2 = new a(bi.a(arrby));
            try {
                int n2 = a2.e();
                if (g2.r() >= n2) {
                    list.add(g2.y(n2));
                    return;
                }
                g2.y();
            }
            finally {
                a2.ad();
            }
            return;
        }
        throw new f("length wider than 21-bit");
    }
}

