/*
 * Decompiled with CFR 0.150.
 */
import io.netty.c.a.d;
import io.netty.channel.bd;
import java.io.IOException;
import java.util.List;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.f;
import org.apache.logging.log4j.g;

public class bko
extends d {
    private static final org.apache.logging.log4j.d a = org.apache.logging.log4j.c.c();
    private static final f c = g.a("PACKET_RECEIVED", sz.b);
    private final cdz d;

    public bko(cdz cdz2) {
        this.d = cdz2;
    }

    @Override
    protected void a(bd bd2, io.netty.b.g g2, List list) {
        if (g2.r() == 0) {
            return;
        }
        si si2 = new si(g2);
        int n2 = si2.e();
        ds ds2 = ((dfj)((Object)bd2.b().a(sz.c).get())).a(this.d, n2);
        if (ds2 == null) {
            throw new IOException("Bad packet id " + n2);
        }
        ds2.a(si2);
        if (si2.r() > 0) {
            throw new IOException("Packet " + ((dfj)((Object)bd2.b().a(sz.c).get())).a() + "/" + n2 + " (" + ds2.getClass().getSimpleName() + ") was larger than I expected, found " + si2.r() + " bytes extra whilst reading packet " + n2);
        }
        list.add(ds2);
        if (a.e()) {
            a.a(c, " IN: [{}:{}] {}", bd2.b().a(sz.c).get(), n2, ds2.getClass().getName());
        }
    }
}

