/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.l;

import com.a.a.b.aj;
import com.a.a.d.mq;
import io.netty.b.bi;
import io.netty.b.g;
import io.netty.channel.aw;
import io.netty.channel.bd;
import io.netty.channel.di;
import io.netty.util.b.ad;
import net.minecraft.client.i.a;
import net.minecraft.client.l.b;
import net.minecraft.client.l.c;
import net.minecraft.u.d.o;

class n
extends di {
    final /* synthetic */ b a;
    private final /* synthetic */ net.minecraft.client.i.o b;
    private final /* synthetic */ a c;

    n(b b2, net.minecraft.client.i.o o2, a a2) {
        this.a = b2;
        this.b = o2;
        this.c = a2;
    }

    @Override
    public void a(bd bd2) {
        super.a(bd2);
        g g2 = bi.a();
        try {
            char c2;
            int n2;
            g2.B(254);
            g2.B(1);
            g2.B(250);
            char[] arrc = "MC|PingHost".toCharArray();
            g2.C(arrc.length);
            char[] arrc2 = arrc;
            int n3 = arrc.length;
            for (n2 = 0; n2 < n3; ++n2) {
                c2 = arrc2[n2];
                g2.F(c2);
            }
            g2.C(7 + 2 * this.b.a().length());
            g2.B(127);
            arrc = this.b.a().toCharArray();
            g2.C(arrc.length);
            arrc2 = arrc;
            n3 = arrc.length;
            for (n2 = 0; n2 < n3; ++n2) {
                c2 = arrc2[n2];
                g2.F(c2);
            }
            g2.E(this.b.b());
            bd2.b().b(g2).a((ad)aw.h);
        }
        finally {
            g2.ad();
        }
    }

    protected void a(bd bd2, g g2) {
        short s2 = g2.F();
        if (s2 == 255) {
            String string = new String(g2.y(g2.G() * 2).X(), aj.d);
            String[] arrstring = (String[])mq.a(net.minecraft.client.l.c.d().a(string), String.class);
            if ("\u00a71".equals(arrstring[0])) {
                int n2 = net.minecraft.u.b.n.a(arrstring[1], 0);
                String string2 = arrstring[2];
                String string3 = arrstring[3];
                int n3 = net.minecraft.u.b.n.a(arrstring[4], -1);
                int n4 = net.minecraft.u.b.n.a(arrstring[5], -1);
                this.c.f = -1;
                this.c.g = string2;
                this.c.d = string3;
                this.c.c = (Object)((Object)o.h) + n3 + (Object)((Object)o.i) + "/" + (Object)((Object)o.h) + n4;
            }
        }
        bd2.n();
    }

    @Override
    public void a(bd bd2, Throwable throwable) {
        bd2.n();
    }

    @Override
    protected /* synthetic */ void a(bd bd2, Object object) {
        this.a(bd2, (g)object);
    }
}

