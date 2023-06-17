/*
 * Decompiled with CFR 0.150.
 */
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
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class dfr {
    private static final d a = org.apache.logging.log4j.c.c();
    private static final ThreadFactory b = new gf().a("Chunk Batcher %d").a(true).a();
    private final int c;
    private final List d = ov.a();
    private final List e = ov.a();
    private final PriorityBlockingQueue f = yk.e();
    private final BlockingQueue g;
    private final ari h = new ari();
    private final ceq i = new ceq();
    private final Queue j = yk.f();
    private final age k;

    public dfr() {
        int n2;
        int n3 = Math.max(1, (int)((double)Runtime.getRuntime().maxMemory() * 0.3) / 0xA00000);
        int n4 = Math.max(1, cmk.a(Runtime.getRuntime().availableProcessors(), 1, n3 / 5));
        this.c = cmk.a(n4 * 10, 1, n3);
        if (n4 > 1) {
            for (n2 = 0; n2 < n4; ++n2) {
                age age2 = new age(this);
                Thread thread = b.newThread(age2);
                thread.start();
                this.e.add(age2);
                this.d.add(thread);
            }
        }
        this.g = yk.a(this.c);
        for (n2 = 0; n2 < this.c; ++n2) {
            this.g.add(new dby());
        }
        this.k = new age(this, new dby());
    }

    public String a() {
        if (this.d.isEmpty()) {
            return String.format("pC: %03d, single-threaded", this.f.size());
        }
        return String.format("pC: %03d, pU: %1d, aB: %1d", this.f.size(), this.j.size(), this.g.size());
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
            if (this.d.isEmpty() && (object = (chn)this.f.poll()) != null) {
                try {
                    this.k.a((chn)object);
                    bl2 = true;
                }
                catch (InterruptedException interruptedException) {
                    a.f("Skipped task due to interrupt");
                }
            }
            object = this.j;
            synchronized (object) {
                if (!this.j.isEmpty()) {
                    ir.b((ir)this.j.poll()).run();
                    bl2 = true;
                    bl3 = true;
                }
            }
        } while (l2 != 0L && bl2 && l2 >= System.nanoTime());
        return bl3;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean a(adr adr2) {
        adr2.b().lock();
        try {
            chn chn2 = adr2.c();
            chn2.a(new bfx(this, chn2));
            boolean bl2 = this.f.offer(chn2);
            if (!bl2) {
                chn2.e();
            }
            boolean bl3 = bl2;
            return bl3;
        }
        finally {
            adr2.b().unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean b(adr adr2) {
        adr2.b().lock();
        try {
            chn chn2 = adr2.c();
            try {
                this.k.a(chn2);
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
            boolean bl2 = true;
            return bl2;
        }
        finally {
            adr2.b().unlock();
        }
    }

    public void b() {
        this.e();
        ArrayList arrayList = ov.a();
        while (arrayList.size() != this.c) {
            this.a(Long.MAX_VALUE);
            try {
                arrayList.add(this.c());
            }
            catch (InterruptedException interruptedException) {}
        }
        this.g.addAll(arrayList);
    }

    public void a(dby dby2) {
        this.g.add(dby2);
    }

    public dby c() {
        return (dby)this.g.take();
    }

    public chn d() {
        return (chn)this.f.take();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean c(adr adr2) {
        adr2.b().lock();
        try {
            chn chn2 = adr2.d();
            if (chn2 != null) {
                chn2.a(new bgd(this, chn2));
                boolean bl2 = this.f.offer(chn2);
                return bl2;
            }
            boolean bl3 = true;
            return bl3;
        }
        finally {
            adr2.b().unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public dl a(kj kj2, bix bix2, adr adr2, ajc ajc2, double d2) {
        if (bxy.B().d()) {
            if (cjg.f()) {
                this.a(bix2, adr2.b(kj2.ordinal()));
            } else {
                this.a(bix2, ((bqe)adr2).a(kj2, ajc2), adr2);
            }
            bix2.c(0.0, 0.0, 0.0);
            return ci.a(null);
        }
        dm dm2 = dm.a(new aem(this, kj2, bix2, adr2, ajc2, d2), null);
        Queue queue = this.j;
        synchronized (queue) {
            this.j.add(new ir(this, dm2, d2));
        }
        return dm2;
    }

    private void a(bix bix2, int n2, adr adr2) {
        cja.f(n2, 4864);
        cja.D();
        adr2.f();
        this.h.a(bix2);
        cja.E();
        cja.H();
    }

    private void a(bix bix2, cwg cwg2) {
        this.i.a(cwg2);
        this.i.a(bix2);
    }

    public void e() {
        while (!this.f.isEmpty()) {
            chn chn2 = (chn)this.f.poll();
            if (chn2 == null) continue;
            chn2.e();
        }
    }

    public boolean f() {
        return this.f.isEmpty() && this.j.isEmpty();
    }

    public void g() {
        this.e();
        for (Runnable runnable : this.e) {
            ((age)runnable).a();
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

    static /* synthetic */ PriorityBlockingQueue a(dfr dfr2) {
        return dfr2.f;
    }
}

