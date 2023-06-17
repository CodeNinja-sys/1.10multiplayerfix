/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import com.a.a.d.sz;
import java.util.List;
import java.util.Map;

class aoz
extends st {
    private final List b;
    private final Map w;
    final /* synthetic */ car a;

    public aoz(car car2, bxy bxy2) {
        this.a = car2;
        super(bxy2, car2.w, car2.x, 32, car2.x - 65 + 4, 18);
        this.b = ov.a();
        this.w = sz.c();
        for (xp xp2 : car.a(car2).d()) {
            this.w.put(xp2.a(), xp2);
            this.b.add(xp2.a());
        }
    }

    @Override
    protected int a() {
        return this.b.size();
    }

    @Override
    protected void a(int n2, boolean bl2, int n3, int n4) {
        xp xp2 = (xp)this.w.get(this.b.get(n2));
        car.a(this.a).a(xp2);
        car.b((car)this.a).aE = xp2.a();
        this.c.h();
        this.a.B.a(car.a(this.a).a() || car.b((car)this.a).aF);
        this.a.B.b(car.a(this.a).b());
        car.c((car)this.a).i = bf.a("gui.done", new Object[0]);
        car.d((car)this.a).i = car.b(this.a).c(oi.E);
        car.b(this.a).b();
    }

    @Override
    protected boolean a(int n2) {
        return ((String)this.b.get(n2)).equals(car.a(this.a).c().a());
    }

    @Override
    protected int e() {
        return this.a() * 18;
    }

    @Override
    protected void b() {
        this.a.aH_();
    }

    @Override
    protected void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.a.B.b(true);
        this.a.a(this.a.B, ((xp)this.w.get(this.b.get(n2))).toString(), this.d / 2, n4 + 1, 0xFFFFFF);
        this.a.B.b(car.a(this.a).c().b());
    }
}

