/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import com.c.a.e;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.UUID;

public class aus {
    private iu a;
    private final List b = ov.a();
    private cmz c = cmz.e;
    private cmz d = cmz.e;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private final TreeMap j = new TreeMap();
    private final List k = ov.a();
    private int l;

    public aus() {
    }

    public aus(iu iu2) {
        this.a = iu2;
    }

    public void a(iu iu2) {
        this.a = iu2;
    }

    public void a(int n2) {
        amj amj2;
        int n3;
        this.g = n2;
        this.m();
        this.l();
        if (n2 % 20 == 0) {
            this.k();
        }
        if (n2 % 30 == 0) {
            this.j();
        }
        if (this.l < (n3 = this.h / 10) && this.b.size() > 20 && this.a.p.nextInt(7000) == 0 && (amj2 = this.a(this.d, 2, 4, 2)) != null) {
            hx hx2 = new hx(this.a);
            hx2.d(amj2.b, amj2.c, amj2.d);
            this.a.b(hx2);
            ++this.l;
        }
    }

    private amj a(cmz cmz2, int n2, int n3, int n4) {
        for (int i2 = 0; i2 < 10; ++i2) {
            cmz cmz3 = cmz2.e(this.a.p.nextInt(16) - 8, this.a.p.nextInt(6) - 3, this.a.p.nextInt(16) - 8);
            if (!this.a(cmz3) || !this.a(new cmz(n2, n3, n4), cmz3)) continue;
            return new amj(cmz3.a(), cmz3.b(), cmz3.c());
        }
        return null;
    }

    private boolean a(cmz cmz2, cmz cmz3) {
        if (!this.a.n(cmz3.h()).q()) {
            return false;
        }
        int n2 = cmz3.a() - cmz2.a() / 2;
        int n3 = cmz3.c() - cmz2.c() / 2;
        for (int i2 = n2; i2 < n2 + cmz2.a(); ++i2) {
            for (int i3 = cmz3.b(); i3 < cmz3.b() + cmz2.b(); ++i3) {
                for (int i4 = n3; i4 < n3 + cmz2.c(); ++i4) {
                    if (!this.a.n(new cmz(i2, i3, i4)).l()) continue;
                    return false;
                }
            }
        }
        return true;
    }

    private void j() {
        List list = this.a.a(hx.class, new cxt(this.d.a() - this.e, this.d.b() - 4, this.d.c() - this.e, this.d.a() + this.e, this.d.b() + 4, this.d.c() + this.e));
        this.l = list.size();
    }

    private void k() {
        List list = this.a.a(cwp.class, new cxt(this.d.a() - this.e, this.d.b() - 4, this.d.c() - this.e, this.d.a() + this.e, this.d.b() + 4, this.d.c() + this.e));
        this.h = list.size();
        if (this.h == 0) {
            this.j.clear();
        }
    }

    public cmz a() {
        return this.d;
    }

    public int b() {
        return this.e;
    }

    public int c() {
        return this.b.size();
    }

    public int d() {
        return this.g - this.f;
    }

    public int e() {
        return this.h;
    }

    public boolean a(cmz cmz2) {
        return this.d.f(cmz2) < (double)(this.e * this.e);
    }

    public List f() {
        return this.b;
    }

    public dap b(cmz cmz2) {
        dap dap2 = null;
        int n2 = Integer.MAX_VALUE;
        for (dap dap3 : this.b) {
            int n3 = dap3.a(cmz2);
            if (n3 >= n2) continue;
            dap2 = dap3;
            n2 = n3;
        }
        return dap2;
    }

    public dap c(cmz cmz2) {
        dap dap2 = null;
        int n2 = Integer.MAX_VALUE;
        for (dap dap3 : this.b) {
            bqk bqk2;
            cmz cmz3;
            int n3 = dap3.a(cmz2);
            n3 = n3 > 256 ? (n3 *= 1000) : dap3.c();
            if (n3 >= n2 || !this.a.n((cmz3 = dap3.d()).c(bqk2 = dap3.j(), 1)).t().a((bnj)this.a, cmz3.c(bqk2, 1)) || !this.a.n(cmz3.c(bqk2, -1)).t().a((bnj)this.a, cmz3.c(bqk2, -1)) || !this.a.n(cmz3.g().c(bqk2, 1)).t().a((bnj)this.a, cmz3.g().c(bqk2, 1)) || !this.a.n(cmz3.g().c(bqk2, -1)).t().a((bnj)this.a, cmz3.g().c(bqk2, -1))) continue;
            dap2 = dap3;
            n2 = n3;
        }
        return dap2;
    }

    public dap d(cmz cmz2) {
        if (this.d.f(cmz2) > (double)(this.e * this.e)) {
            return null;
        }
        for (dap dap2 : this.b) {
            if (dap2.d().a() != cmz2.a() || dap2.d().c() != cmz2.c() || Math.abs(dap2.d().b() - cmz2.b()) > 1) continue;
            return dap2;
        }
        return null;
    }

    public void a(dap dap2) {
        this.b.add(dap2);
        this.c = this.c.g(dap2.d());
        this.n();
        this.f = dap2.h();
    }

    public boolean g() {
        return this.b.isEmpty();
    }

    public void a(bga bga2) {
        for (coo coo2 : this.k) {
            if (coo2.a != bga2) continue;
            coo2.b = this.g;
            return;
        }
        this.k.add(new coo(this, bga2, this.g));
    }

    public bga b(bga bga2) {
        double d2 = Double.MAX_VALUE;
        coo coo2 = null;
        for (int i2 = 0; i2 < this.k.size(); ++i2) {
            coo coo3 = (coo)this.k.get(i2);
            double d3 = coo3.a.l(bga2);
            if (d3 > d2) continue;
            coo2 = coo3;
            d2 = d3;
        }
        return coo2 != null ? coo2.a : null;
    }

    public bdl c(bga bga2) {
        double d2 = Double.MAX_VALUE;
        bdl bdl2 = null;
        for (String string : this.j.keySet()) {
            double d3;
            bdl bdl3;
            if (!this.b(string) || (bdl3 = this.a.a(string)) == null || (d3 = bdl3.l(bga2)) > d2) continue;
            bdl2 = bdl3;
            d2 = d3;
        }
        return bdl2;
    }

    private void l() {
        Iterator iterator = this.k.iterator();
        while (iterator.hasNext()) {
            coo coo2 = (coo)iterator.next();
            if (coo2.a.bj() && Math.abs(this.g - coo2.b) <= 300) continue;
            iterator.remove();
        }
    }

    private void m() {
        boolean bl2 = false;
        boolean bl3 = this.a.p.nextInt(50) == 0;
        Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            dap dap2 = (dap)iterator.next();
            if (bl3) {
                dap2.a();
            }
            if (this.e(dap2.d()) && Math.abs(this.g - dap2.h()) <= 1200) continue;
            this.c = this.c.h(dap2.d());
            bl2 = true;
            dap2.a(true);
            iterator.remove();
        }
        if (bl2) {
            this.n();
        }
    }

    private boolean e(cmz cmz2) {
        dbk dbk2 = this.a.n(cmz2);
        bfa bfa2 = dbk2.t();
        if (bfa2 instanceof xt) {
            return dbk2.a() == ahk.d;
        }
        return false;
    }

    private void n() {
        int n2 = this.b.size();
        if (n2 == 0) {
            this.d = cmz.e;
            this.e = 0;
            return;
        }
        this.d = new cmz(this.c.a() / n2, this.c.b() / n2, this.c.c() / n2);
        int n3 = 0;
        for (dap dap2 : this.b) {
            n3 = Math.max(dap2.a(this.d), n3);
        }
        this.e = Math.max(32, (int)Math.sqrt(n3) + 1);
    }

    public int a(String string) {
        Integer n2 = (Integer)this.j.get(string);
        if (n2 != null) {
            return n2;
        }
        return 0;
    }

    public int a(String string, int n2) {
        int n3 = this.a(string);
        int n4 = cmk.a(n3 + n2, -30, 10);
        this.j.put(string, n4);
        return n4;
    }

    public boolean b(String string) {
        return this.a(string) <= -15;
    }

    public void a(bvp bvp2) {
        Object object;
        this.h = bvp2.h("PopSize");
        this.e = bvp2.h("Radius");
        this.l = bvp2.h("Golems");
        this.f = bvp2.h("Stable");
        this.g = bvp2.h("Tick");
        this.i = bvp2.h("MTick");
        this.d = new cmz(bvp2.h("CX"), bvp2.h("CY"), bvp2.h("CZ"));
        this.c = new cmz(bvp2.h("ACX"), bvp2.h("ACY"), bvp2.h("ACZ"));
        bmh bmh2 = bvp2.c("Doors", 10);
        for (int i2 = 0; i2 < bmh2.b(); ++i2) {
            bvp bvp3 = bmh2.b(i2);
            object = new dap(new cmz(bvp3.h("X"), bvp3.h("Y"), bvp3.h("Z")), bvp3.h("IDX"), bvp3.h("IDZ"), bvp3.h("TS"));
            this.b.add(object);
        }
        bmh bmh3 = bvp2.c("Players", 10);
        for (int i3 = 0; i3 < bmh3.b(); ++i3) {
            object = bmh3.b(i3);
            if (((bvp)object).e("UUID") && this.a != null && this.a.f() != null) {
                ml ml2 = this.a.f().aA();
                e e2 = ((bas)((Object)ml2)).a(UUID.fromString(((bvp)object).l("UUID")));
                if (e2 == null) continue;
                this.j.put(e2.b(), ((bvp)object).h("S"));
                continue;
            }
            this.j.put(((bvp)object).l("Name"), ((bvp)object).h("S"));
        }
    }

    public void b(bvp bvp2) {
        bvp2.a("PopSize", this.h);
        bvp2.a("Radius", this.e);
        bvp2.a("Golems", this.l);
        bvp2.a("Stable", this.f);
        bvp2.a("Tick", this.g);
        bvp2.a("MTick", this.i);
        bvp2.a("CX", this.d.a());
        bvp2.a("CY", this.d.b());
        bvp2.a("CZ", this.d.c());
        bvp2.a("ACX", this.c.a());
        bvp2.a("ACY", this.c.b());
        bvp2.a("ACZ", this.c.c());
        bmh bmh2 = new bmh();
        for (Object object : this.b) {
            Object object2 = new bvp();
            ((bvp)object2).a("X", ((dap)object).d().a());
            ((bvp)object2).a("Y", ((dap)object).d().b());
            ((bvp)object2).a("Z", ((dap)object).d().c());
            ((bvp)object2).a("IDX", ((dap)object).f());
            ((bvp)object2).a("IDZ", ((dap)object).g());
            ((bvp)object2).a("TS", ((dap)object).h());
            bmh2.a((azt)object2);
        }
        bvp2.a("Doors", bmh2);
        bmh bmh3 = new bmh();
        for (Object object2 : this.j.keySet()) {
            bvp bvp3 = new bvp();
            ml ml2 = this.a.f().aA();
            e e2 = ((bas)((Object)ml2)).a((String)object2);
            if (e2 == null) continue;
            bvp3.a("UUID", e2.a().toString());
            bvp3.a("S", (Integer)this.j.get(object2));
            bmh3.a(bvp3);
        }
        bvp2.a("Players", bmh3);
    }

    public void h() {
        this.i = this.g;
    }

    public boolean i() {
        return this.i == 0 || this.g - this.i >= 3600;
    }

    public void b(int n2) {
        for (String string : this.j.keySet()) {
            this.a(string, n2);
        }
    }
}

