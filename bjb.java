/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.List;

public final class bjb
extends pj {
    private boolean f;
    private static final List g = ov.a();

    private bjb(int n2, int n3, int n4) {
        super(n2, n3, n4);
    }

    public static bjb e() {
        return bjb.b(0, 0, 0);
    }

    public static bjb b(double d2, double d3, double d4) {
        return bjb.b(cmk.c(d2), cmk.c(d3), cmk.c(d4));
    }

    public static bjb c(cjx cjx2) {
        return bjb.b(cjx2.a(), cjx2.b(), cjx2.c());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static bjb b(int n2, int n3, int n4) {
        List list = g;
        synchronized (list) {
            bjb bjb2;
            if (!g.isEmpty() && (bjb2 = (bjb)g.remove(g.size() - 1)) != null && bjb2.f) {
                bjb2.f = false;
                bjb2.c(n2, n3, n4);
                return bjb2;
            }
        }
        return new bjb(n2, n3, n4);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void f() {
        List list = g;
        synchronized (list) {
            if (g.size() < 100) {
                g.add(this);
            }
            this.f = true;
        }
    }

    public bjb c(int n2, int n3, int n4) {
        if (this.f) {
            cmz.n().b("PooledMutableBlockPosition modified after it was released.", new Throwable());
            this.f = false;
        }
        return (bjb)super.a(n2, n3, n4);
    }

    public bjb b(cpk cpk2) {
        return (bjb)super.a(cpk2);
    }

    public bjb c(double d2, double d3, double d4) {
        return (bjb)super.a(d2, d3, d4);
    }

    public bjb d(cjx cjx2) {
        return (bjb)super.a(cjx2);
    }

    public bjb b(bqk bqk2) {
        return (bjb)super.a(bqk2);
    }

    public bjb b(bqk bqk2, int n2) {
        return (bjb)super.a(bqk2, n2);
    }

    @Override
    public /* synthetic */ pj a(bqk bqk2, int n2) {
        return this.b(bqk2, n2);
    }

    @Override
    public /* synthetic */ pj a(bqk bqk2) {
        return this.b(bqk2);
    }

    @Override
    public /* synthetic */ pj a(cjx cjx2) {
        return this.d(cjx2);
    }

    @Override
    public /* synthetic */ pj a(double d2, double d3, double d4) {
        return this.c(d2, d3, d4);
    }

    @Override
    public /* synthetic */ pj a(cpk cpk2) {
        return this.b(cpk2);
    }

    @Override
    public /* synthetic */ pj a(int n2, int n3, int n4) {
        return this.c(n2, n3, n4);
    }
}

