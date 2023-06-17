/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x;

import io.netty.channel.bd;
import java.io.IOException;
import net.minecraft.x.a;
import net.minecraft.x.ak;
import net.minecraft.x.at;
import net.minecraft.x.p;
import net.minecraft.x.q;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.f;
import org.apache.logging.log4j.g;

public class d
extends io.netty.c.a.p {
    private static final org.apache.logging.log4j.d a = org.apache.logging.log4j.c.c();
    private static final f b = g.a("PACKET_SENT", ak.b);
    private final at c;

    public d(at at2) {
        this.c = at2;
    }

    protected void a(bd bd2, p p2, io.netty.b.g g2) {
        Integer n2 = ((q)((Object)bd2.b().a(ak.c).get())).a(this.c, p2);
        if (a.e()) {
            a.a(b, "OUT: [{}:{}] {}", bd2.b().a(ak.c).get(), n2, p2.getClass().getName());
        }
        if (n2 == null) {
            throw new IOException("Can't serialize unregistered packet");
        }
        a a2 = new a(g2);
        a2.d(n2);
        try {
            p2.b(a2);
        }
        catch (Throwable throwable) {
            a.b((Object)throwable);
        }
    }

    @Override
    protected /* synthetic */ void a(bd bd2, Object object, io.netty.b.g g2) {
        this.a(bd2, (p)object, g2);
    }
}

