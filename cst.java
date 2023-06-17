/*
 * Decompiled with CFR 0.150.
 */
import io.netty.b.bi;
import io.netty.b.g;
import io.netty.c.a.d;
import io.netty.c.a.f;
import io.netty.channel.bd;
import java.util.List;

public class cst
extends d {
    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
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
            si si2 = new si(bi.a(arrby));
            try {
                int n2 = si2.e();
                if (g2.r() < n2) {
                    g2.y();
                    return;
                }
                list.add(g2.y(n2));
                return;
            }
            finally {
                si2.ad();
            }
        }
        throw new f("length wider than 21-bit");
    }
}

