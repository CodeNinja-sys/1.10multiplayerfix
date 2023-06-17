/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.e;

import com.a.a.d.ov;
import com.a.a.d.yk;
import com.a.a.n.a.ci;
import com.a.a.n.a.dl;
import com.a.a.n.a.dm;
import com.a.a.n.a.gf;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import net.minecraft.client.g.aa;
import net.minecraft.client.g.ay;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.bl;
import net.minecraft.client.g.e.a;
import net.minecraft.client.g.e.c;
import net.minecraft.client.g.e.h;
import net.minecraft.client.g.e.l;
import net.minecraft.client.g.e.o;
import net.minecraft.client.g.e.q;
import net.minecraft.client.g.e.t;
import net.minecraft.client.g.e.u;
import net.minecraft.client.g.g;
import net.minecraft.u.b.n;
import org.apache.logging.log4j.d;

public class r {
    private static final d a = org.apache.logging.log4j.c.c();
    private static final ThreadFactory b = new gf().a("Chunk Batcher %d").a(true).a();
    private final int c;
    private final List d = ov.a();
    private final List e = ov.a();
    private final PriorityBlockingQueue f = yk.e();
    private final BlockingQueue g;
    private final net.minecraft.client.g.r h = new net.minecraft.client.g.r();
    private final aa i = new aa();
    private final Queue j = yk.f();
    private final l k;

    public r() {
        int n2;
        int n3 = Math.max(1, (int)((double)Runtime.getRuntime().maxMemory() * 0.3) / 0xA00000);
        int n4 = Math.max(1, n.a(Runtime.getRuntime().availableProcessors(), 1, n3 / 5));
        this.c = n.a(n4 * 10, 1, n3);
        if (n4 > 1) {
            for (n2 = 0; n2 < n4; ++n2) {
                l l2 = new l(this);
                Thread thread = b.newThread(l2);
                thread.start();
                this.e.add(l2);
                this.d.add(thread);
            }
        }
        this.g = yk.a(this.c);
        for (n2 = 0; n2 < this.c; ++n2) {
            this.g.add(new bl());
        }
        this.k = new l(this, new bl());
    }

    public String a() {
        return this.d.isEmpty() ? String.format("pC: %03d, single-threaded", this.f.size()) : String.format("pC: %03d, pU: %1d, aB: %1d", this.f.size(), this.j.size(), this.g.size());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean a(long l2) {
        boolean bl2;
        boolean bl3 = false;
        do {
            Object object;
            bl2 = false;
            if (this.d.isEmpty() && (object = (net.minecraft.client.g.e.g)this.f.poll()) != null) {
                try {
                    this.k.a((net.minecraft.client.g.e.g)object);
                    bl2 = true;
                }
                catch (InterruptedException interruptedException) {
                    a.f("Skipped task due to interrupt");
                }
            }
            object = this.j;
            synchronized (object) {
                if (!this.j.isEmpty()) {
                    net.minecraft.client.g.e.h.b((h)this.j.poll()).run();
                    bl2 = true;
                    bl3 = true;
                }
            }
        } while (l2 != 0L && bl2 && l2 >= System.nanoTime());
        return bl3;
    }

    public boolean a(q q2) {
        boolean bl2;
        q2.c().lock();
        try {
            net.minecraft.client.g.e.g g2 = q2.d();
            g2.a(new o(this, g2));
            boolean bl3 = this.f.offer(g2);
            if (!bl3) {
                g2.e();
            }
            bl2 = bl3;
        }
        finally {
            q2.c().unlock();
        }
        return bl2;
    }

    public boolean b(q q2) {
        boolean bl2;
        q2.c().lock();
        try {
            net.minecraft.client.g.e.g g2 = q2.d();
            try {
                this.k.a(g2);
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
            bl2 = true;
        }
        finally {
            q2.c().unlock();
        }
        return bl2;
    }

    public void b() {
        this.e();
        ArrayList arrayList = ov.a();
        while (arrayList.size() != this.c) {
            this.a(Long.MAX_VALUE);
            try {
                arrayList.add(this.c());
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
        }
        this.g.addAll(arrayList);
    }

    public void a(bl bl2) {
        this.g.add(bl2);
    }

    public bl c() {
        return (bl)this.g.take();
    }

    public net.minecraft.client.g.e.g d() {
        return (net.minecraft.client.g.e.g)this.f.take();
    }

    public boolean c(q q2) {
        boolean bl2;
        q2.c().lock();
        try {
            net.minecraft.client.g.e.g g2 = q2.e();
            if (g2 == null) {
                boolean bl3;
                boolean bl4 = bl3 = true;
                return bl4;
            }
            g2.a(new t(this, g2));
            bl2 = this.f.offer(g2);
        }
        finally {
            q2.c().unlock();
        }
        return bl2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public dl a(net.minecraft.u.c c2, g g2, q q2, u u2, double d2) {
        if (net.minecraft.client.r.z().aU()) {
            if (ay.f()) {
                this.a(g2, q2.b(c2.ordinal()));
            } else {
                this.a(g2, ((c)q2).a(c2, u2), q2);
            }
            g2.c(0.0, 0.0, 0.0);
            return ci.a(null);
        }
        dm dm2 = dm.a(new a(this, c2, g2, q2, u2, d2), null);
        Queue queue = this.j;
        synchronized (queue) {
            this.j.add(new h(this, dm2, d2));
            return dm2;
        }
    }

    private void a(g g2, int n2, q q2) {
        bd.f(n2, 4864);
        bd.D();
        q2.g();
        this.h.a(g2);
        bd.E();
        bd.H();
    }

    private void a(g g2, net.minecraft.client.g.d.c c2) {
        this.i.a(c2);
        this.i.a(g2);
    }

    public void e() {
        while (!this.f.isEmpty()) {
            net.minecraft.client.g.e.g g2 = (net.minecraft.client.g.e.g)this.f.poll();
            if (g2 == null) continue;
            g2.e();
        }
    }

    public boolean f() {
        return this.f.isEmpty() && this.j.isEmpty();
    }

    public void g() {
        this.e();
        for (Runnable runnable : this.e) {
            ((l)runnable).a();
        }
        for (Runnable runnable : this.d) {
            try {
                ((Thread)runnable).interrupt();
                ((Thread)runnable).join();
            }
            catch (InterruptedException interruptedException) {
                a.f("Interrupted whilst waiting for worker to die", (Throwable)interruptedException);
            }
        }
        this.g.clear();
    }

    public boolean h() {
        return this.g.size() == 0;
    }

    static /* synthetic */ PriorityBlockingQueue a(r r2) {
        return r2.f;
    }
}

