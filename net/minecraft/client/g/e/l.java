/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.e;

import com.a.a.d.ov;
import com.a.a.n.a.ci;
import com.a.a.n.a.dl;
import java.util.ArrayList;
import net.minecraft.client.g.bl;
import net.minecraft.client.g.e.e;
import net.minecraft.client.g.e.g;
import net.minecraft.client.g.e.k;
import net.minecraft.client.g.e.m;
import net.minecraft.client.g.e.s;
import net.minecraft.client.g.e.u;
import net.minecraft.client.r;
import net.minecraft.k.a;
import net.minecraft.u.ad;
import net.minecraft.u.b.b;
import net.minecraft.u.b.t;
import net.minecraft.w.n;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class l
implements Runnable {
    private static final d a = org.apache.logging.log4j.c.c();
    private final net.minecraft.client.g.e.r b;
    private final bl c;
    private boolean d = true;

    public l(net.minecraft.client.g.e.r r2) {
        this(r2, null);
    }

    public l(net.minecraft.client.g.e.r r2, bl bl2) {
        this.b = r2;
        this.c = bl2;
    }

    @Override
    public void run() {
        while (this.d) {
            try {
                this.a(this.b.d());
            }
            catch (InterruptedException interruptedException) {
                a.a("Stopping chunk worker due to interrupt");
                return;
            }
            catch (Throwable throwable) {
                a a2 = net.minecraft.k.a.a(throwable, "Batching chunks");
                r.z().a(r.z().c(a2));
                return;
            }
        }
    }

    protected void a(g g2) {
        Object object;
        Object object2;
        Object object3;
        g2.f().lock();
        try {
            if (g2.a() != m.a) {
                if (!g2.h()) {
                    a.f("Chunk render task was {} when I expected it to be pending; ignoring task", new Object[]{g2.a()});
                }
                return;
            }
            object3 = new b(r.z().j);
            b b2 = g2.b().j();
            int n2 = 16;
            int n3 = 8;
            int n4 = 24;
            if (b2.a(8, 8, 8).i((t)object3) > 576.0) {
                object2 = g2.b().n();
                object = new net.minecraft.u.b.g(b2);
                if (!(this.a(((net.minecraft.u.b.g)object).e(b2).b(ad.e, 16), (net.minecraft.q.k)object2) && this.a(((net.minecraft.u.b.g)object).e(b2).b(ad.c, 16), (net.minecraft.q.k)object2) && this.a(((net.minecraft.u.b.g)object).e(b2).b(ad.f, 16), (net.minecraft.q.k)object2) && this.a(((net.minecraft.u.b.g)object).e(b2).b(ad.d, 16), (net.minecraft.q.k)object2))) {
                    return;
                }
            }
            g2.a(m.b);
        }
        finally {
            g2.f().unlock();
        }
        object3 = r.z().Z();
        if (object3 == null) {
            g2.e();
        } else {
            g2.a(this.c());
            float f2 = (float)((n)object3).aU;
            float f3 = (float)((n)object3).aV + ((n)object3).ce_();
            float f4 = (float)((n)object3).aW;
            s s2 = g2.g();
            if (s2 == s.a) {
                g2.b().b(f2, f3, f4, g2);
            } else if (s2 == s.b) {
                g2.b().a(f2, f3, f4, g2);
            }
            g2.f().lock();
            try {
                if (g2.a() != m.b) {
                    if (!g2.h()) {
                        a.f("Chunk render task was {} when I expected it to be compiling; aborting task", new Object[]{g2.a()});
                    }
                    this.b(g2);
                    return;
                }
                g2.a(m.c);
            }
            finally {
                g2.f().unlock();
            }
            object2 = g2.c();
            object = ov.a();
            if (s2 == s.a) {
                for (net.minecraft.u.c object42 : net.minecraft.u.c.values()) {
                    if (!((u)object2).d(object42)) continue;
                    ((ArrayList)object).add(this.b.a(object42, g2.d().a(object42), g2.b(), (u)object2, g2.i()));
                }
            } else if (s2 == s.b) {
                ((ArrayList)object).add(this.b.a(net.minecraft.u.c.d, g2.d().a(net.minecraft.u.c.d), g2.b(), (u)object2, g2.i()));
            }
            dl dl2 = ci.a((Iterable)object);
            g2.a(new k(this, dl2));
            ci.a(dl2, new e(this, g2, (u)object2));
        }
    }

    private boolean a(b b2, net.minecraft.q.k k2) {
        return !k2.a(b2.cy_() >> 4, b2.l() >> 4).f();
    }

    private bl c() {
        return this.c != null ? this.c : this.b.c();
    }

    private void b(g g2) {
        if (this.c == null) {
            this.b.a(g2.d());
        }
    }

    public void a() {
        this.d = false;
    }

    static /* synthetic */ void a(l l2, g g2) {
        l2.b(g2);
    }

    static /* synthetic */ d b() {
        return a;
    }
}

