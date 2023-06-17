/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.dg;
import com.a.a.d.ov;
import io.netty.channel.ct;
import io.netty.channel.h.a.f;
import java.net.InetAddress;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class lq {
    private static final dg a = dg.a('\u0000').b(6);
    private static final d b = org.apache.logging.log4j.c.c();
    private final List c = Collections.synchronizedList(ov.a());

    public void a(cyq cyq2) {
        ri ri2 = ri.a(cyq2.b);
        sz sz2 = sz.a(InetAddress.getByName(ri2.a()), ri2.b(), false);
        this.c.add(sz2);
        cyq2.d = "Pinging...";
        cyq2.e = -1L;
        cyq2.i = null;
        sz2.a(new ann(this, sz2, cyq2));
        try {
            sz2.a(new atm(210, ri2.a(), ri2.b(), dfj.c));
            sz2.a(new cqj());
        }
        catch (Throwable throwable) {
            b.b((Object)throwable);
        }
    }

    private void b(cyq cyq2) {
        ri ri2 = ri.a(cyq2.b);
        ((io.netty.a.f)((io.netty.a.f)((io.netty.a.f)new io.netty.a.f().a((ct)sz.d.c())).a(new auw(this, ri2, cyq2))).a(f.class)).d(ri2.a(), ri2.b());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a() {
        List list = this.c;
        synchronized (list) {
            Iterator iterator = this.c.iterator();
            while (iterator.hasNext()) {
                sz sz2 = (sz)iterator.next();
                if (sz2.e()) {
                    sz2.a();
                    continue;
                }
                iterator.remove();
                sz2.j();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b() {
        List list = this.c;
        synchronized (list) {
            Iterator iterator = this.c.iterator();
            while (iterator.hasNext()) {
                sz sz2 = (sz)iterator.next();
                if (!sz2.e()) continue;
                iterator.remove();
                sz2.a(new aym("Cancelled"));
            }
        }
    }

    static /* synthetic */ d c() {
        return b;
    }

    static /* synthetic */ void a(lq lq2, cyq cyq2) {
        lq2.b(cyq2);
    }

    static /* synthetic */ dg d() {
        return a;
    }
}

