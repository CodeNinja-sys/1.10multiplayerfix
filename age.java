/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import com.a.a.n.a.ci;
import com.a.a.n.a.dl;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class age
implements Runnable {
    private static final d a = org.apache.logging.log4j.c.c();
    private final dfr b;
    private final dby c;
    private boolean d = true;

    public age(dfr dfr2) {
        this(dfr2, null);
    }

    public age(dfr dfr2, dby dby2) {
        this.b = dfr2;
        this.c = dby2;
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
                cet cet2 = cet.a(throwable, "Batching chunks");
                bxy.B().a(bxy.B().c(cet2));
                return;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void a(chn chn2) {
        Object object;
        Object object2;
        Object object3;
        chn2.f().lock();
        try {
            if (chn2.a() != czd.a) {
                if (!chn2.h()) {
                    a.f("Chunk render task was {} when I expected it to be pending; ignoring task", new Object[]{chn2.a()});
                }
                return;
            }
            object3 = new cmz(bxy.B().h);
            cmz cmz2 = chn2.b().j();
            int n2 = 16;
            int n3 = 8;
            int n4 = 24;
            if (cmz2.e(8, 8, 8).f((cjx)object3) > 576.0) {
                object2 = chn2.b().n();
                object = new pj(cmz2);
                if (!(this.a(((pj)object).a(cmz2).a(bqk.e, 16), (iu)object2) && this.a(((pj)object).a(cmz2).a(bqk.c, 16), (iu)object2) && this.a(((pj)object).a(cmz2).a(bqk.f, 16), (iu)object2) && this.a(((pj)object).a(cmz2).a(bqk.d, 16), (iu)object2))) {
                    return;
                }
            }
            chn2.a(czd.b);
        }
        finally {
            chn2.f().unlock();
        }
        object3 = bxy.B().ab();
        if (object3 == null) {
            chn2.e();
            return;
        }
        chn2.a(this.c());
        float f2 = (float)((cpk)object3).aU;
        float f3 = (float)((cpk)object3).aV + ((cpk)object3).A();
        float f4 = (float)((cpk)object3).aW;
        ait ait2 = chn2.g();
        if (ait2 == ait.a) {
            chn2.b().b(f2, f3, f4, chn2);
        } else if (ait2 == ait.b) {
            chn2.b().a(f2, f3, f4, chn2);
        }
        chn2.f().lock();
        try {
            if (chn2.a() != czd.b) {
                if (!chn2.h()) {
                    a.f("Chunk render task was {} when I expected it to be compiling; aborting task", new Object[]{chn2.a()});
                }
                this.b(chn2);
                return;
            }
            chn2.a(czd.c);
        }
        finally {
            chn2.f().unlock();
        }
        object2 = chn2.c();
        object = ov.a();
        if (ait2 == ait.a) {
            for (kj kj2 : kj.values()) {
                if (!((ajc)object2).d(kj2)) continue;
                object.add(this.b.a(kj2, chn2.d().a(kj2), chn2.b(), (ajc)object2, chn2.i()));
            }
        } else if (ait2 == ait.b) {
            object.add(this.b.a(kj.d, chn2.d().a(kj.d), chn2.b(), (ajc)object2, chn2.i()));
        }
        dl dl2 = ci.a((Iterable)object);
        chn2.a(new bxp(this, dl2));
        ci.a(dl2, new aqj(this, chn2, (ajc)object2));
    }

    private boolean a(cmz cmz2, iu iu2) {
        return !iu2.a(cmz2.a() >> 4, cmz2.c() >> 4).h();
    }

    private dby c() {
        return this.c != null ? this.c : this.b.c();
    }

    private void b(chn chn2) {
        if (this.c == null) {
            this.b.a(chn2.d());
        }
    }

    public void a() {
        this.d = false;
    }

    static /* synthetic */ void a(age age2, chn chn2) {
        age2.b(chn2);
    }

    static /* synthetic */ d b() {
        return a;
    }
}

