/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.aj;
import com.a.a.d.mq;
import io.netty.b.bi;
import io.netty.b.g;
import io.netty.channel.aw;
import io.netty.channel.bd;
import io.netty.channel.di;
import io.netty.util.b.ad;

class clc
extends di {
    final /* synthetic */ auw a;

    clc(auw auw2) {
        this.a = auw2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(bd bd2) {
        super.a(bd2);
        g g2 = bi.a();
        try {
            g2.B(254);
            g2.B(1);
            g2.B(250);
            char[] arrc = "MC|PingHost".toCharArray();
            g2.C(arrc.length);
            for (char c2 : arrc) {
                g2.F(c2);
            }
            g2.C(7 + 2 * this.a.a.a().length());
            g2.B(127);
            arrc = this.a.a.a().toCharArray();
            g2.C(arrc.length);
            for (char c2 : arrc) {
                g2.F(c2);
            }
            g2.E(this.a.a.b());
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
            String[] arrstring = (String[])mq.a(lq.d().a(string), String.class);
            if ("\u00a71".equals(arrstring[0])) {
                int n2 = cmk.a(arrstring[1], 0);
                String string2 = arrstring[2];
                String string3 = arrstring[3];
                int n3 = cmk.a(arrstring[4], -1);
                int n4 = cmk.a(arrstring[5], -1);
                this.a.b.f = -1;
                this.a.b.g = string2;
                this.a.b.d = string3;
                this.a.b.c = (Object)((Object)aug.h) + "" + n3 + "" + (Object)((Object)aug.i) + "/" + (Object)((Object)aug.h) + n4;
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

