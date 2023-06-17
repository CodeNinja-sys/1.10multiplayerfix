/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import io.netty.channel.av;
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
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class afx {
    private static final d e = org.apache.logging.log4j.c.c();
    public static final cag a = new byp();
    public static final cag b = new auy();
    public static final cag c = new hd();
    private final a f;
    public volatile boolean d;
    private final List g = Collections.synchronizedList(ov.a());
    private final List h = Collections.synchronizedList(ov.a());

    public afx(a a2) {
        this.f = a2;
        this.d = true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(InetAddress inetAddress, int n2) {
        List list = this.g;
        synchronized (list) {
            cag cag2;
            Class class_;
            if (io.netty.channel.epoll.d.a() && this.f.ae()) {
                class_ = j.class;
                cag2 = b;
                e.d("Using epoll channel type");
            } else {
                class_ = io.netty.channel.h.a.c.class;
                cag2 = a;
                e.d("Using default channel type");
            }
            this.g.add(((io.netty.a.j)((io.netty.a.j)new io.netty.a.j().a(class_)).b(new amd(this)).b((ct)cag2.c()).a(inetAddress, n2)).d().g());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public SocketAddress a() {
        av av2;
        List list = this.g;
        synchronized (list) {
            av2 = ((io.netty.a.j)((io.netty.a.j)new io.netty.a.j().a(l.class)).b(new bnk(this)).b((ct)a.c()).a(io.netty.channel.c.a.a)).d().g();
            this.g.add(av2);
        }
        return av2.e().f();
    }

    public void b() {
        this.d = false;
        for (av av2 : this.g) {
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
                sz sz2 = (sz)iterator.next();
                if (sz2.f()) continue;
                if (sz2.e()) {
                    try {
                        sz2.a();
                    }
                    catch (Exception exception) {
                        Object object;
                        if (sz2.c()) {
                            object = cet.a(exception, "Ticking memory connection");
                            sx sx2 = ((cet)object).a("Ticking connection");
                            sx2.a("Connection", new ajz(this, sz2));
                            throw new oz((cet)object);
                        }
                        e.f("Failed to handle packet for {}", sz2.b(), exception);
                        object = new aym("Internal server error");
                        sz2.a(new bkm((cbg)object), new zu(this, sz2, (aym)object), new ad[0]);
                        sz2.i();
                    }
                    continue;
                }
                iterator.remove();
                sz2.j();
            }
        }
    }

    public a d() {
        return this.f;
    }

    static /* synthetic */ List a(afx afx2) {
        return afx2.h;
    }

    static /* synthetic */ a b(afx afx2) {
        return afx2.f;
    }
}

