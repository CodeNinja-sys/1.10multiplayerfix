/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;
import com.a.a.b.cn;
import java.util.List;

public class cgk
extends ck {
    private final cm c = new bew(this);
    protected cfl a;
    private final double d;
    private final double e;
    protected cpk b;
    private final float f;
    private dbn g;
    private final dct h;
    private final Class i;
    private final cm j;

    public cgk(cfl cfl2, Class class_, float f2, double d2, double d3) {
        this(cfl2, class_, cn.a(), f2, d2, d3);
    }

    public cgk(cfl cfl2, Class class_, cm cm2, float f2, double d2, double d3) {
        this.a = cfl2;
        this.i = class_;
        this.j = cm2;
        this.f = f2;
        this.d = d2;
        this.e = d3;
        this.h = cfl2.ap();
        this.a(1);
    }

    @Override
    public boolean b() {
        List list = this.a.aQ.a(this.i, this.a.cD().b((double)this.f, 3.0, this.f), cn.a(auxx.d, this.c, this.j));
        if (list.isEmpty()) {
            return false;
        }
        this.b = (cpk)list.get(0);
        amj amj2 = ble.b(this.a, 16, 7, new amj(this.b.aU, this.b.aV, this.b.aW));
        if (amj2 == null) {
            return false;
        }
        if (this.b.i(amj2.b, amj2.c, amj2.d) < this.b.l(this.a)) {
            return false;
        }
        this.g = this.h.a(amj2.b, amj2.c, amj2.d);
        return this.g != null;
    }

    @Override
    public boolean a() {
        return !this.h.m();
    }

    @Override
    public void c() {
        this.h.a(this.g, this.d);
    }

    @Override
    public void d() {
        this.b = null;
    }

    @Override
    public void e() {
        if (this.a.l(this.b) < 49.0) {
            this.a.ap().a(this.e);
        } else {
            this.a.ap().a(this.d);
        }
    }
}

