/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;
import com.a.a.d.mq;
import com.a.a.d.ov;
import java.util.List;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class asi {
    private static final d a = org.apache.logging.log4j.c.c();
    private final arr b;
    private final List c = ov.a();
    private final zz d;
    private final short[] e = new short[64];
    private bhm f;
    private int g;
    private int h;
    private long i;
    private boolean j;

    public asi(arr arr2, int n2, int n3) {
        this.b = arr2;
        this.d = new zz(n2, n3);
        this.f = arr2.a().ad().c(n2, n3);
    }

    public zz a() {
        return this.d;
    }

    public void a(czt czt2) {
        if (this.c.contains(czt2)) {
            a.a("Failed to add player. {} already is in chunk {}, {}", czt2, this.d.a, this.d.b);
            return;
        }
        if (this.c.isEmpty()) {
            this.i = this.b.a().z();
        }
        this.c.add(czt2);
        if (this.j) {
            this.c(czt2);
        }
    }

    public void b(czt czt2) {
        if (!this.c.contains(czt2)) {
            return;
        }
        if (this.j) {
            czt2.a.a(new ua(this.d.a, this.d.b));
        }
        this.c.remove(czt2);
        if (this.c.isEmpty()) {
            this.b.b(this);
        }
    }

    public boolean a(boolean bl2) {
        if (this.f != null) {
            return true;
        }
        this.f = bl2 ? this.b.a().ad().b(this.d.a, this.d.b) : this.b.a().ad().c(this.d.a, this.d.b);
        return this.f != null;
    }

    public boolean b() {
        if (this.j) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        if (!this.f.i()) {
            return false;
        }
        this.g = 0;
        this.h = 0;
        this.j = true;
        bvb bvb2 = new bvb(this.f, 65535);
        for (czt czt2 : this.c) {
            czt2.a.a(bvb2);
            this.b.a().af().a(czt2, this.f);
        }
        return true;
    }

    public void c(czt czt2) {
        if (!this.j) {
            return;
        }
        czt2.a.a(new bvb(this.f, 65535));
        this.b.a().af().a(czt2, this.f);
    }

    public void c() {
        long l2 = this.b.a().z();
        if (this.f != null) {
            this.f.c(this.f.x() + l2 - this.i);
        }
        this.i = l2;
    }

    public void a(int n2, int n3, int n4) {
        if (!this.j) {
            return;
        }
        if (this.g == 0) {
            this.b.a(this);
        }
        this.h |= 1 << (n3 >> 4);
        if (this.g < 64) {
            short s2 = (short)(n2 << 12 | n4 << 8 | n3);
            for (int i2 = 0; i2 < this.g; ++i2) {
                if (this.e[i2] != s2) continue;
                return;
            }
            this.e[this.g++] = s2;
        }
    }

    public void a(ds ds2) {
        if (!this.j) {
            return;
        }
        for (int i2 = 0; i2 < this.c.size(); ++i2) {
            ((czt)this.c.get((int)i2)).a.a(ds2);
        }
    }

    public void d() {
        if (!this.j || this.f == null) {
            return;
        }
        if (this.g == 0) {
            return;
        }
        if (this.g == 1) {
            int n2 = (this.e[0] >> 12 & 0xF) + this.d.a * 16;
            int n3 = this.e[0] & 0xFF;
            int n4 = (this.e[0] >> 8 & 0xF) + this.d.b * 16;
            cmz cmz2 = new cmz(n2, n3, n4);
            this.a(new cjj(this.b.a(), cmz2));
            if (this.b.a().n(cmz2).t().l()) {
                this.a(this.b.a().q(cmz2));
            }
        } else if (this.g == 64) {
            this.a(new bvb(this.f, this.h));
        } else {
            this.a(new czi(this.g, this.e, this.f));
            for (int i2 = 0; i2 < this.g; ++i2) {
                int n5 = (this.e[i2] >> 12 & 0xF) + this.d.a * 16;
                int n6 = this.e[i2] & 0xFF;
                int n7 = (this.e[i2] >> 8 & 0xF) + this.d.b * 16;
                cmz cmz3 = new cmz(n5, n6, n7);
                if (!this.b.a().n(cmz3).t().l()) continue;
                this.a(this.b.a().q(cmz3));
            }
        }
        this.g = 0;
        this.h = 0;
    }

    private void a(bql bql2) {
        hv hv2;
        if (bql2 != null && (hv2 = bql2.a_()) != null) {
            this.a(hv2);
        }
    }

    public boolean d(czt czt2) {
        return this.c.contains(czt2);
    }

    public boolean a(cm cm2) {
        return mq.g(this.c, cm2).b();
    }

    public boolean a(double d2, cm cm2) {
        int n2 = this.c.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            czt czt2 = (czt)this.c.get(i2);
            if (!cm2.a(czt2) || !(this.d.a(czt2) < d2 * d2)) continue;
            return true;
        }
        return false;
    }

    public boolean e() {
        return this.j;
    }

    public bhm f() {
        return this.f;
    }

    public double g() {
        double d2 = Double.MAX_VALUE;
        for (czt czt2 : this.c) {
            double d3 = this.d.a(czt2);
            if (!(d3 < d2)) continue;
            d2 = d3;
        }
        return d2;
    }
}

