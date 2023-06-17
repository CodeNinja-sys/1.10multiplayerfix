/*
 * Decompiled with CFR 0.150.
 */
import io.netty.b.g;
import io.netty.c.a.p;
import io.netty.channel.bd;

public class bzp
extends p {
    protected void a(bd bd2, g g2, g g3) {
        int n2 = g2.r();
        int n3 = si.a(n2);
        if (n3 > 3) {
            throw new IllegalArgumentException("unable to fit " + n2 + " into " + 3);
        }
        si si2 = new si(g3);
        si2.k(n3 + n2);
        si2.d(n2);
        si2.b(g2, g2.p(), n2);
    }

    @Override
    protected /* synthetic */ void a(bd bd2, Object object, g g2) {
        this.a(bd2, (g)object, g2);
    }
}

