/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.bx;
import com.a.a.b.dg;
import com.a.a.d.ov;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class crd
extends alo {
    private static final dg a = dg.a('\n');
    private static final bx b = bx.a("\\n");
    private static final d c = org.apache.logging.log4j.c.c();
    private final bxy d;
    private final List e = ov.a();
    private final List f = ov.a();
    private final List g = ov.a();
    private int h;
    private boolean i;

    public crd(bxy bxy2) {
        this.d = bxy2;
    }

    public void a(int n2) {
        int n3;
        int n4;
        int n5;
        int n6;
        if (this.d.u.n == bgi.c) {
            return;
        }
        int n7 = this.i();
        int n8 = this.g.size();
        float f2 = this.d.u.r * 0.9f + 0.1f;
        if (n8 <= 0) {
            return;
        }
        boolean bl2 = false;
        if (this.e()) {
            bl2 = true;
        }
        float f3 = this.h();
        int n9 = cmk.f((float)this.f() / f3);
        cja.D();
        cja.c(2.0f, 8.0f, 0.0f);
        cja.b(f3, f3, 1.0f);
        int n10 = 0;
        for (n6 = 0; n6 + this.h < this.g.size() && n6 < n7; ++n6) {
            blz blz2 = (blz)this.g.get(n6 + this.h);
            if (blz2 == null || (n5 = n2 - blz2.b()) >= 200 && !bl2) continue;
            double d2 = (double)n5 / 200.0;
            d2 = 1.0 - d2;
            d2 *= 10.0;
            d2 = cmk.a(d2, 0.0, 1.0);
            d2 *= d2;
            n4 = (int)(255.0 * d2);
            if (bl2) {
                n4 = 255;
            }
            n4 = (int)((float)n4 * f2);
            ++n10;
            if (n4 <= 3) continue;
            n3 = 0;
            int n11 = -n6 * 9;
            crd.a(-2, n11 - 9, 0 + n9 + 4, n11, n4 / 2 << 24);
            String string = blz2.a().j();
            cja.l();
            this.d.k.a(string, 0.0f, (float)(n11 - 8), 0xFFFFFF + (n4 << 24));
            cja.c();
            cja.k();
        }
        if (bl2) {
            n6 = this.d.k.a;
            cja.c(-3.0f, 0.0f, 0.0f);
            int n12 = n8 * n6 + n8;
            n5 = n10 * n6 + n10;
            int n13 = this.h * n5 / n8;
            int n14 = n5 * n5 / n12;
            if (n12 != n5) {
                n4 = n13 > 0 ? 170 : 96;
                n3 = this.i ? 0xCC3333 : 0x3333AA;
                crd.a(0, -n13, 2, -n13 - n14, n3 + (n4 << 24));
                crd.a(2, -n13, 1, -n13 - n14, 0xCCCCCC + (n4 << 24));
            }
        }
        cja.E();
    }

    public void a() {
        this.g.clear();
        this.f.clear();
        this.e.clear();
    }

    public void a(cbg cbg2) {
        this.a(cbg2, 0);
    }

    public void a(cbg cbg2, int n2) {
        this.a(cbg2, n2, this.d.r.d(), false);
        c.d("[CHAT] {}", b.a(a.a(cbg2.i())));
    }

    private void a(cbg cbg2, int n2, int n3, boolean bl2) {
        if (n2 != 0) {
            this.c(n2);
        }
        int n4 = cmk.d((float)this.f() / this.h());
        List list = cma.a(cbg2, n4, this.d.k, false, false);
        boolean bl3 = this.e();
        for (cbg cbg3 : list) {
            if (bl3 && this.h > 0) {
                this.i = true;
                this.b(1);
            }
            this.g.add(0, new blz(n3, cbg3, n2));
        }
        while (this.g.size() > 100) {
            this.g.remove(this.g.size() - 1);
        }
        if (!bl2) {
            this.f.add(0, new blz(n3, cbg2, n2));
            while (this.f.size() > 100) {
                this.f.remove(this.f.size() - 1);
            }
        }
    }

    public void b() {
        this.g.clear();
        this.d();
        for (int i2 = this.f.size() - 1; i2 >= 0; --i2) {
            blz blz2 = (blz)this.f.get(i2);
            this.a(blz2.a(), blz2.c(), blz2.b(), true);
        }
    }

    public List c() {
        return this.e;
    }

    public void a(String string) {
        if (this.e.isEmpty() || !((String)this.e.get(this.e.size() - 1)).equals(string)) {
            this.e.add(string);
        }
    }

    public void d() {
        this.h = 0;
        this.i = false;
    }

    public void b(int n2) {
        this.h += n2;
        int n3 = this.g.size();
        if (this.h > n3 - this.i()) {
            this.h = n3 - this.i();
        }
        if (this.h <= 0) {
            this.h = 0;
            this.i = false;
        }
    }

    public cbg a(int n2, int n3) {
        if (!this.e()) {
            return null;
        }
        cnt cnt2 = new cnt(this.d);
        int n4 = cnt2.e();
        float f2 = this.h();
        int n5 = n2 / n4 - 2;
        int n6 = n3 / n4 - 40;
        n5 = cmk.d((float)n5 / f2);
        n6 = cmk.d((float)n6 / f2);
        if (n5 < 0 || n6 < 0) {
            return null;
        }
        int n7 = Math.min(this.i(), this.g.size());
        if (n5 <= cmk.d((float)this.f() / this.h()) && n6 < this.d.k.a * n7 + n7) {
            int n8 = n6 / this.d.k.a + this.h;
            if (n8 >= 0 && n8 < this.g.size()) {
                blz blz2 = (blz)this.g.get(n8);
                int n9 = 0;
                for (cbg cbg2 : blz2.a()) {
                    if (!(cbg2 instanceof aym) || (n9 += this.d.k.a(cma.a(((aym)cbg2).a(), false))) <= n5) continue;
                    return cbg2;
                }
            }
            return null;
        }
        return null;
    }

    public boolean e() {
        return this.d.m instanceof bmz;
    }

    public void c(int n2) {
        blz blz2;
        Iterator iterator = this.g.iterator();
        while (iterator.hasNext()) {
            blz2 = (blz)iterator.next();
            if (blz2.c() != n2) continue;
            iterator.remove();
        }
        iterator = this.f.iterator();
        while (iterator.hasNext()) {
            blz2 = (blz)iterator.next();
            if (blz2.c() != n2) continue;
            iterator.remove();
            break;
        }
    }

    public int f() {
        return crd.a(this.d.u.G);
    }

    public int g() {
        return crd.b(this.e() ? this.d.u.I : this.d.u.H);
    }

    public float h() {
        return this.d.u.F;
    }

    public static int a(float f2) {
        int n2 = 320;
        int n3 = 40;
        return cmk.d(f2 * 280.0f + 40.0f);
    }

    public static int b(float f2) {
        int n2 = 180;
        int n3 = 20;
        return cmk.d(f2 * 160.0f + 20.0f);
    }

    public int i() {
        return this.g() / 9;
    }
}

