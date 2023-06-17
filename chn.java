/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import com.a.a.l.i;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class chn
implements Comparable {
    private final adr a;
    private final ReentrantLock b = new ReentrantLock();
    private final List c = ov.a();
    private final ait d;
    private final double e;
    private dby f;
    private ajc g;
    private czd h = czd.a;
    private boolean i;

    public chn(adr adr2, ait ait2, double d2) {
        this.a = adr2;
        this.d = ait2;
        this.e = d2;
    }

    public czd a() {
        return this.h;
    }

    public adr b() {
        return this.a;
    }

    public ajc c() {
        return this.g;
    }

    public void a(ajc ajc2) {
        this.g = ajc2;
    }

    public dby d() {
        return this.f;
    }

    public void a(dby dby2) {
        this.f = dby2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(czd czd2) {
        this.b.lock();
        try {
            this.h = czd2;
        }
        finally {
            this.b.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void e() {
        this.b.lock();
        try {
            if (this.d == ait.a && this.h != czd.d) {
                this.a.a(false);
            }
            this.i = true;
            this.h = czd.d;
            for (Runnable runnable : this.c) {
                runnable.run();
            }
        }
        finally {
            this.b.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(Runnable runnable) {
        this.b.lock();
        try {
            this.c.add(runnable);
            if (this.i) {
                runnable.run();
            }
        }
        finally {
            this.b.unlock();
        }
    }

    public ReentrantLock f() {
        return this.b;
    }

    public ait g() {
        return this.d;
    }

    public boolean h() {
        return this.i;
    }

    public int a(chn chn2) {
        return com.a.a.l.i.a(this.e, chn2.e);
    }

    public double i() {
        return this.e;
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((chn)object);
    }
}

