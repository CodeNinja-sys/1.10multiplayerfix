/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x;

import io.netty.c.a.d;
import io.netty.channel.bd;
import java.io.IOException;
import java.util.List;
import net.minecraft.x.a;
import net.minecraft.x.ak;
import net.minecraft.x.at;
import net.minecraft.x.p;
import net.minecraft.x.q;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.f;
import org.apache.logging.log4j.g;

public class n
extends d {
    private static final org.apache.logging.log4j.d a = org.apache.logging.log4j.c.c();
    private static final f c = g.a("PACKET_RECEIVED", ak.b);
    private final at d;

    public n(at at2) {
        this.d = at2;
    }

    @Override
    protected void a(bd bd2, io.netty.b.g g2, List list) {
        if (g2.r() != 0) {
            a a2 = new a(g2);
            int n2 = a2.e();
            p p2 = ((q)((Object)bd2.b().a(ak.c).get())).a(this.d, n2);
            if (p2 == null) {
                throw new IOException("Bad packet id " + n2);
            }
            p2.a(a2);
            if (a2.r() > 0) {
                throw new IOException("Packet " + ((q)((Object)bd2.b().a(ak.c).get())).a() + "/" + n2 + " (" + p2.getClass().getSimpleName() + ") was larger than I expected, found " + a2.r() + " bytes extra whilst reading packet " + n2);
            }
            list.add(p2);
            if (a.e()) {
                a.a(c, " IN: [{}:{}] {}", bd2.b().a(ak.c).get(), n2, p2.getClass().getName());
            }
        }
    }
}

