/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.aj;
import io.netty.b.bi;
import io.netty.b.g;
import io.netty.channel.aw;
import io.netty.channel.bd;
import io.netty.channel.bf;
import io.netty.util.b.ad;
import java.net.InetSocketAddress;
import net.minecraft.c.a;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class dba
extends bf {
    private static final d a = c.c();
    private final afx b;

    public dba(afx afx2) {
        this.b = afx2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a_(bd bd2, Object object) {
        g g2 = (g)object;
        g2.x();
        boolean bl2 = true;
        try {
            if (g2.F() != 254) {
                return;
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress)bd2.b().h();
            a a2 = this.b.d();
            int n2 = g2.r();
            switch (n2) {
                case 0: {
                    a.a("Ping: (<1.3.x) from {}:{}", inetSocketAddress.getAddress(), inetSocketAddress.getPort());
                    String string = String.format("%s\u00a7%d\u00a7%d", a2.ai(), a2.H(), a2.I());
                    this.a(bd2, this.a(string));
                    break;
                }
                case 1: {
                    if (g2.F() != 1) {
                        return;
                    }
                    a.a("Ping: (1.4-1.5.x) from {}:{}", inetSocketAddress.getAddress(), inetSocketAddress.getPort());
                    String string = String.format("\u00a71\u0000%d\u0000%s\u0000%s\u0000%d\u0000%d", 127, a2.G(), a2.ai(), a2.H(), a2.I());
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
                    String string = String.format("\u00a71\u0000%d\u0000%s\u0000%s\u0000%d\u0000%d", 127, a2.G(), a2.ai(), a2.H(), a2.I());
                    g g3 = this.a(string);
                    try {
                        this.a(bd2, g3);
                        break;
                    }
                    finally {
                        g3.ad();
                    }
                }
            }
            g2.ad();
            bl2 = false;
        }
        catch (RuntimeException runtimeException) {
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
        for (char c2 : arrc) {
            g2.F(c2);
        }
        return g2;
    }
}

