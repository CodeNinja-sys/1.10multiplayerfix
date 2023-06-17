/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.List;

public class aee
extends ck {
    private final cfl a;
    private final double b;
    private dbn c;
    private dap d;
    private final boolean e;
    private final List f = ov.a();

    public aee(cfl cfl2, double d2, boolean bl2) {
        this.a = cfl2;
        this.b = d2;
        this.e = bl2;
        this.a(1);
        if (!(cfl2.ap() instanceof vp)) {
            throw new IllegalArgumentException("Unsupported mob for MoveThroughVillageGoal");
        }
    }

    @Override
    public boolean b() {
        this.f();
        if (this.e && this.a.aQ.h()) {
            return false;
        }
        aus aus2 = this.a.aQ.T().a(new cmz(this.a), 0);
        if (aus2 == null) {
            return false;
        }
        this.d = this.a(aus2);
        if (this.d == null) {
            return false;
        }
        vp vp2 = (vp)this.a.ap();
        boolean bl2 = vp2.f();
        vp2.a(false);
        this.c = vp2.b(this.d.d());
        vp2.a(bl2);
        if (this.c != null) {
            return true;
        }
        amj amj2 = ble.a(this.a, 10, 7, new amj(this.d.d().a(), this.d.d().b(), this.d.d().c()));
        if (amj2 == null) {
            return false;
        }
        vp2.a(false);
        this.c = this.a.ap().a(amj2.b, amj2.c, amj2.d);
        vp2.a(bl2);
        return this.c != null;
    }

    @Override
    public boolean a() {
        if (this.a.ap().m()) {
            return false;
        }
        float f2 = this.a.bl + 4.0f;
        return this.a.e(this.d.d()) > (double)(f2 * f2);
    }

    @Override
    public void c() {
        this.a.ap().a(this.c, this.b);
    }

    @Override
    public void d() {
        if (this.a.ap().m() || this.a.e(this.d.d()) < 16.0) {
            this.f.add(this.d);
        }
    }

    private dap a(aus aus2) {
        dap dap2 = null;
        int n2 = Integer.MAX_VALUE;
        List list = aus2.f();
        for (dap dap3 : list) {
            int n3 = dap3.a(cmk.c(this.a.aU), cmk.c(this.a.aV), cmk.c(this.a.aW));
            if (n3 >= n2 || this.a(dap3)) continue;
            dap2 = dap3;
            n2 = n3;
        }
        return dap2;
    }

    private boolean a(dap dap2) {
        for (dap dap3 : this.f) {
            if (!dap2.d().equals(dap3.d())) continue;
            return true;
        }
        return false;
    }

    private void f() {
        if (this.f.size() > 15) {
            this.f.remove(0);
        }
    }
}

