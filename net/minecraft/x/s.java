/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x;

import com.a.a.b.aj;
import io.netty.b.bi;
import io.netty.b.g;
import io.netty.channel.aw;
import io.netty.channel.bd;
import io.netty.channel.bf;
import io.netty.util.b.ad;
import java.net.InetSocketAddress;
import net.minecraft.c.a;
import net.minecraft.x.av;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class s
extends bf {
    private static final d a = c.c();
    private final av b;

    public s(av av2) {
        this.b = av2;
    }

    @Override
    public void a_(bd bd2, Object object) {
        g g2 = (g)object;
        g2.x();
        boolean bl2 = true;
        try {
            if (g2.F() == 254) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress)bd2.b().h();
                a a2 = this.b.d();
                int n2 = g2.r();
                switch (n2) {
                    case 0: {
                        a.a("Ping: (<1.3.x) from {}:{}", inetSocketAddress.getAddress(), inetSocketAddress.getPort());
                        String string = String.format("%s\u00a7%d\u00a7%d", a2.as(), a2.R(), a2.S());
                        this.a(bd2, this.a(string));
                        break;
                    }
                    case 1: {
                        if (g2.F() != 1) {
                            return;
                        }
                        a.a("Ping: (1.4-1.5.x) from {}:{}", inetSocketAddress.getAddress(), inetSocketAddress.getPort());
                        String string = String.format("\u00a71\u0000%d\u0000%s\u0000%s\u0000%d\u0000%d", 127, a2.Q(), a2.as(), a2.R(), a2.S());
                        this.a(bd2, this.a(string));
                        break;
                    }
                    default: {
                        boolean bl3 = g2.F() == 1;
                        bl3 &= g2.F() == 250;
                        bl3 &= "MC|PingHost".equals(new String(g2.y(g2.G() * 2).X(), aj.d));
                        int n3 = g2.H();
                        bl3 &= g2.F() >= 73;
                        bl3 &= 3 + g2.y(g2.G() * 2).X().length + 4 == n3;
                        bl3 &= g2.K() <= 65535;
                        if (!(bl3 &= g2.r() == 0)) {
                            return;
                        }
                        a.a("Ping: (1.6) from {}:{}", inetSocketAddress.getAddress(), inetSocketAddress.getPort());
                        String string = String.format("\u00a71\u0000%d\u0000%s\u0000%s\u0000%d\u0000%d", 127, a2.Q(), a2.as(), a2.R(), a2.S());
                        g g3 = this.a(string);
                        try {
                            this.a(bd2, g3);
                        }
                        finally {
                            g3.ad();
                        }
                    }
                }
                g2.ad();
                bl2 = false;
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            return;
        }
        finally {
            if (bl2) {
                g2.y();
                bd2.b().c().a("legacy_query");
                bd2.b(object);
            }
        }
    }

    private void a(bd bd2, g g2) {
        bd2.c().d().d(g2).a((ad)aw.g);
    }

    private g a(String string) {
        g g2 = bi.a();
        g2.B(255);
        char[] arrc = string.toCharArray();
        g2.C(arrc.length);
        char[] arrc2 = arrc;
        int n2 = arrc.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            char c2 = arrc2[i2];
            g2.F(c2);
        }
        return g2;
    }
}

