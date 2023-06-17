/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;
import java.util.Collections;
import java.util.List;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class cqs
extends ck {
    private static final d a = org.apache.logging.log4j.c.c();
    private final xy b;
    private final cm c;
    private final bay d;
    private bga e;

    public cqs(xy xy2) {
        this.b = xy2;
        if (xy2 instanceof cfl) {
            a.f("Use NearestAttackableTargetGoal.class for PathfinerMob mobs!");
        }
        this.c = new cpg(this);
        this.d = new bay(xy2);
    }

    @Override
    public boolean b() {
        double d2 = this.f();
        List list = this.b.aQ.a(bdl.class, this.b.cD().b(d2, 4.0, d2), this.c);
        Collections.sort(list, this.d);
        if (list.isEmpty()) {
            return false;
        }
        this.e = (bga)list.get(0);
        return true;
    }

    @Override
    public boolean a() {
        bga bga2 = this.b.ar();
        if (bga2 == null) {
            return false;
        }
        if (!bga2.bj()) {
            return false;
        }
        if (bga2 instanceof bdl && ((bdl)bga2).G.a) {
            return false;
        }
        ccw ccw2 = this.b.as_();
        ccw ccw3 = bga2.as_();
        if (ccw2 != null && ccw3 == ccw2) {
            return false;
        }
        double d2 = this.f();
        if (this.b.l(bga2) > d2 * d2) {
            return false;
        }
        return !(bga2 instanceof czt) || !((czt)bga2).c.d();
    }

    @Override
    public void c() {
        this.b.b(this.e);
        super.c();
    }

    @Override
    public void d() {
        this.b.b((bga)null);
        super.c();
    }

    protected double f() {
        cp cp2 = this.b.a(cgz.b);
        return cp2 == null ? 16.0 : cp2.e();
    }

    static /* synthetic */ xy a(cqs cqs2) {
        return cqs2.b;
    }
}

