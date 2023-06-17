/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.l;

import com.a.a.b.dg;
import com.a.a.d.ov;
import io.netty.channel.ct;
import io.netty.channel.h.a.f;
import java.net.InetAddress;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.i.o;
import net.minecraft.client.l.b;
import net.minecraft.client.l.i;
import net.minecraft.u.d.k;
import net.minecraft.x.ak;
import net.minecraft.x.b.a.a;
import net.minecraft.x.q;
import org.apache.logging.log4j.d;

public class c {
    private static final dg a = dg.a('\u0000').b(6);
    private static final d b = org.apache.logging.log4j.c.c();
    private final List c = Collections.synchronizedList(ov.a());

    public void a(net.minecraft.client.i.a a2) {
        o o2 = o.a(a2.b);
        ak ak2 = ak.a(InetAddress.getByName(o2.a()), o2.b(), false);
        this.c.add(ak2);
        a2.d = "Pinging...";
        a2.e = -1L;
        a2.i = null;
        ak2.a(new i(this, ak2, a2));
        try {
            ak2.a(new a(210, o2.a(), o2.b(), q.c));
            ak2.a(new net.minecraft.x.f.a.b());
        }
        catch (Throwable throwable) {
            b.b((Object)throwable);
        }
    }

    private void b(net.minecraft.client.i.a a2) {
        o o2 = o.a(a2.b);
        ((io.netty.a.f)((io.netty.a.f)((io.netty.a.f)new io.netty.a.f().a((ct)ak.d.a())).a(new b(this, o2, a2))).a(f.class)).d(o2.a(), o2.b());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a() {
        List list = this.c;
        synchronized (list) {
            Iterator iterator = this.c.iterator();
            while (iterator.hasNext()) {
                ak ak2 = (ak)iterator.next();
                if (ak2.e()) {
                    ak2.a();
                    continue;
                }
                iterator.remove();
                ak2.j();
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
                ak ak2 = (ak)iterator.next();
                if (!ak2.e()) continue;
                iterator.remove();
                ak2.a(new k("Cancelled"));
            }
        }
    }

    static /* synthetic */ d c() {
        return b;
    }

    static /* synthetic */ void a(c c2, net.minecraft.client.i.a a2) {
        c2.b(a2);
    }

    static /* synthetic */ dg d() {
        return a;
    }
}

