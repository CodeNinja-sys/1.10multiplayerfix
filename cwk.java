/*
 * Decompiled with CFR 0.150.
 */
import io.netty.c.a.p;
import io.netty.channel.bd;
import java.io.IOException;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;
import org.apache.logging.log4j.f;
import org.apache.logging.log4j.g;

public class cwk
extends p {
    private static final d a = org.apache.logging.log4j.c.c();
    private static final f b = g.a("PACKET_SENT", sz.b);
    private final cdz c;

    public cwk(cdz cdz2) {
        this.c = cdz2;
    }

    protected void a(bd bd2, ds ds2, io.netty.b.g g2) {
        Integer n2 = ((dfj)((Object)bd2.b().a(sz.c).get())).a(this.c, ds2);
        if (a.e()) {
            a.a(b, "OUT: [{}:{}] {}", bd2.b().a(sz.c).get(), n2, ds2.getClass().getName());
        }
        if (n2 == null) {
            throw new IOException("Can't serialize unregistered packet");
        }
        si si2 = new si(g2);
        si2.d(n2);
        try {
            ds2.b(si2);
        }
        catch (Throwable throwable) {
            a.b((Object)throwable);
        }
    }

    @Override
    protected /* synthetic */ void a(bd bd2, Object object, io.netty.b.g g2) {
        this.a(bd2, (ds)object, g2);
    }
}

