/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x;

import com.a.a.d.ov;
import io.netty.channel.c.l;
import io.netty.channel.ct;
import io.netty.channel.epoll.j;
import io.netty.util.b.ad;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.minecraft.c.a;
import net.minecraft.u.bd;
import net.minecraft.u.bo;
import net.minecraft.u.d.k;
import net.minecraft.x.ak;
import net.minecraft.x.c;
import net.minecraft.x.d.b.af;
import net.minecraft.x.e;
import net.minecraft.x.i;
import net.minecraft.x.m;
import net.minecraft.x.o;
import net.minecraft.x.y;
import org.apache.logging.log4j.d;

public class av {
    private static final d e = org.apache.logging.log4j.c.c();
    public static final bd a = new i();
    public static final bd b = new y();
    public static final bd c = new o();
    private final a f;
    public volatile boolean d;
    private final List g = Collections.synchronizedList(ov.a());
    private final List h = Collections.synchronizedList(ov.a());

    public av(a a2) {
        this.f = a2;
        this.d = true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(InetAddress inetAddress, int n2) {
        List list = this.g;
        synchronized (list) {
            bd bd2;
            Class class_;
            if (io.netty.channel.epoll.d.a() && this.f.ao()) {
                class_ = j.class;
                bd2 = b;
                e.d("Using epoll channel type");
            } else {
                class_ = io.netty.channel.h.a.c.class;
                bd2 = a;
                e.d("Using default channel type");
            }
            this.g.add(((io.netty.a.j)((io.netty.a.j)new io.netty.a.j().a(class_)).b(new c(this)).b((ct)bd2.a()).a(inetAddress, n2)).d().g());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public SocketAddress a() {
        io.netty.channel.av av2;
        List list = this.g;
        synchronized (list) {
            av2 = ((io.netty.a.j)((io.netty.a.j)new io.netty.a.j().a(l.class)).b(new e(this)).b((ct)a.a()).a(io.netty.channel.c.a.a)).d().g();
            this.g.add(av2);
        }
        return av2.e().f();
    }

    public void b() {
        this.d = false;
        for (io.netty.channel.av av2 : this.g) {
            try {
                av2.e().l().f();
            }
            catch (InterruptedException interruptedException) {
                e.b("Interrupted whilst closing channel");
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void c() {
        List list = this.h;
        synchronized (list) {
            Iterator iterator = this.h.iterator();
            while (iterator.hasNext()) {
                ak ak2 = (ak)iterator.next();
                if (ak2.f()) continue;
                if (ak2.e()) {
                    try {
                        ak2.a();
                    }
                    catch (Exception exception) {
                        Object object;
                        if (ak2.c()) {
                            object = net.minecraft.k.a.a(exception, "Ticking memory connection");
                            net.minecraft.k.i i2 = ((net.minecraft.k.a)object).a("Ticking connection");
                            i2.a("Connection", new m(this, ak2));
                            throw new bo((net.minecraft.k.a)object);
                        }
                        e.f("Failed to handle packet for {}", ak2.b(), exception);
                        object = new k("Internal server error");
                        ak2.a(new af((net.minecraft.u.d.a)object), new net.minecraft.x.af(this, ak2, (k)object), new ad[0]);
                        ak2.i();
                    }
                    continue;
                }
                iterator.remove();
                ak2.j();
            }
        }
    }

    public a d() {
        return this.f;
    }

    static /* synthetic */ List a(av av2) {
        return av2.h;
    }

    static /* synthetic */ a b(av av2) {
        return av2.f;
    }
}

