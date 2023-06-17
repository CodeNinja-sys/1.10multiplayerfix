/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.Iterator;
import java.util.List;

public class go
extends bh {
    private iu b;
    private final List c = ov.a();
    private final List d = ov.a();
    private final List e = ov.a();
    private int f;

    public go(String string) {
        super(string);
    }

    public go(iu iu2) {
        super(go.a(iu2.q));
        this.b = iu2;
        this.a();
    }

    public void a(iu iu2) {
        this.b = iu2;
        for (aus aus2 : this.e) {
            aus2.a(iu2);
        }
    }

    public void a(cmz cmz2) {
        if (this.c.size() > 64) {
            return;
        }
        if (!this.e(cmz2)) {
            this.c.add(cmz2);
        }
    }

    public void c() {
        ++this.f;
        for (aus aus2 : this.e) {
            aus2.a(this.f);
        }
        this.e();
        this.f();
        this.g();
        if (this.f % 400 == 0) {
            this.a();
        }
    }

    private void e() {
        Iterator iterator = this.e.iterator();
        while (iterator.hasNext()) {
            aus aus2 = (aus)iterator.next();
            if (!aus2.g()) continue;
            iterator.remove();
            this.a();
        }
    }

    public List d() {
        return this.e;
    }

    public aus a(cmz cmz2, int n2) {
        aus aus2 = null;
        double d2 = 3.4028234663852886E38;
        for (aus aus3 : this.e) {
            float f2;
            double d3 = aus3.a().f(cmz2);
            if (d3 >= d2 || d3 > (double)((f2 = (float)(n2 + aus3.b())) * f2)) continue;
            aus2 = aus3;
            d2 = d3;
        }
        return aus2;
    }

    private void f() {
        if (this.c.isEmpty()) {
            return;
        }
        this.b((cmz)this.c.remove(0));
    }

    private void g() {
        for (int i2 = 0; i2 < this.d.size(); ++i2) {
            dap dap2 = (dap)this.d.get(i2);
            aus aus2 = this.a(dap2.d(), 32);
            if (aus2 == null) {
                aus2 = new aus(this.b);
                this.e.add(aus2);
                this.a();
            }
            aus2.a(dap2);
        }
        this.d.clear();
    }

    private void b(cmz cmz2) {
        int n2 = 16;
        int n3 = 4;
        int n4 = 16;
        for (int i2 = -16; i2 < 16; ++i2) {
            for (int i3 = -4; i3 < 4; ++i3) {
                for (int i4 = -16; i4 < 16; ++i4) {
                    cmz cmz3 = cmz2.e(i2, i3, i4);
                    if (!this.f(cmz3)) continue;
                    dap dap2 = this.c(cmz3);
                    if (dap2 == null) {
                        this.d(cmz3);
                        continue;
                    }
                    dap2.a(this.f);
                }
            }
        }
    }

    private dap c(cmz cmz2) {
        for (Object object : this.d) {
            if (((dap)object).d().a() != cmz2.a() || ((dap)object).d().c() != cmz2.c() || Math.abs(((dap)object).d().b() - cmz2.b()) > 1) continue;
            return object;
        }
        for (Object object : this.e) {
            dap dap2 = ((aus)object).d(cmz2);
            if (dap2 == null) continue;
            return dap2;
        }
        return null;
    }

    private void d(cmz cmz2) {
        int n2;
        bqk bqk2 = xt.e(this.b, cmz2);
        bqk bqk3 = bqk2.e();
        int n3 = this.a(cmz2, bqk2, 5);
        if (n3 != (n2 = this.a(cmz2, bqk3, n3 + 1))) {
            this.d.add(new dap(cmz2, n3 < n2 ? bqk2 : bqk3, this.f));
        }
    }

    private int a(cmz cmz2, bqk bqk2, int n2) {
        int n3 = 0;
        for (int i2 = 1; i2 <= 5; ++i2) {
            if (!this.b.g(cmz2.c(bqk2, i2)) || ++n3 < n2) continue;
            return n3;
        }
        return n3;
    }

    private boolean e(cmz cmz2) {
        for (cmz cmz3 : this.c) {
            if (!cmz3.equals(cmz2)) continue;
            return true;
        }
        return false;
    }

    private boolean f(cmz cmz2) {
        dbk dbk2 = this.b.n(cmz2);
        bfa bfa2 = dbk2.t();
        if (bfa2 instanceof xt) {
            return dbk2.a() == ahk.d;
        }
        return false;
    }

    @Override
    public void a(bvp bvp2) {
        this.f = bvp2.h("Tick");
        bmh bmh2 = bvp2.c("Villages", 10);
        for (int i2 = 0; i2 < bmh2.b(); ++i2) {
            bvp bvp3 = bmh2.b(i2);
            aus aus2 = new aus();
            aus2.a(bvp3);
            this.e.add(aus2);
        }
    }

    @Override
    public bvp b(bvp bvp2) {
        bvp2.a("Tick", this.f);
        bmh bmh2 = new bmh();
        for (aus aus2 : this.e) {
            bvp bvp3 = new bvp();
            aus2.b(bvp3);
            bmh2.a(bvp3);
        }
        bvp2.a("Villages", bmh2);
        return bvp2;
    }

    public static String a(byf byf2) {
        return "villages" + byf2.a().c();
    }
}

