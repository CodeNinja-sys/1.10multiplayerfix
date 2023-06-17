/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import io.netty.b.bi;
import io.netty.b.g;
import java.util.List;
import java.util.Map;

public class bvb
implements ds {
    private int a;
    private int b;
    private int c;
    private byte[] d;
    private List e;
    private boolean f;

    public bvb() {
    }

    public bvb(bhm bhm2, int n2) {
        this.a = bhm2.b;
        this.b = bhm2.c;
        this.f = n2 == 65535;
        boolean bl2 = !bhm2.q().q.n();
        this.d = new byte[this.a(bhm2, bl2, n2)];
        this.c = this.a(new si(this.g()), bhm2, bl2, n2);
        this.e = ov.a();
        for (Map.Entry entry : bhm2.s().entrySet()) {
            cmz cmz2 = (cmz)entry.getKey();
            bql bql2 = (bql)entry.getValue();
            int n3 = cmz2.b() >> 4;
            if (!this.e() && (n2 & 1 << n3) == 0) continue;
            bvp bvp2 = bql2.b();
            this.e.add(bvp2);
        }
    }

    @Override
    public void a(si si2) {
        this.a = si2.K();
        this.b = si2.K();
        this.f = si2.D();
        this.c = si2.e();
        int n2 = si2.e();
        if (n2 > 0x200000) {
            throw new RuntimeException("Chunk Packet trying to allocate too much memory on read.");
        }
        this.d = new byte[n2];
        si2.b(this.d);
        int n3 = si2.e();
        this.e = ov.a();
        for (int i2 = 0; i2 < n3; ++i2) {
            this.e.add(si2.h());
        }
    }

    @Override
    public void b(si si2) {
        si2.E(this.a);
        si2.E(this.b);
        si2.a(this.f);
        si2.d(this.c);
        si2.d(this.d.length);
        si2.c(this.d);
        si2.d(this.e.size());
        for (bvp bvp2 : this.e) {
            si2.a(bvp2);
        }
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    public si a() {
        return new si(bi.a(this.d));
    }

    private g g() {
        g g2 = bi.a(this.d);
        g2.h(0);
        return g2;
    }

    public int a(si si2, bhm bhm2, boolean bl2, int n2) {
        int n3 = 0;
        aei[] arraei = bhm2.b();
        int n4 = arraei.length;
        for (int i2 = 0; i2 < n4; ++i2) {
            aei aei2 = arraei[i2];
            if (aei2 == bhm.a || this.e() && aei2.a() || (n2 & 1 << i2) == 0) continue;
            n3 |= 1 << i2;
            aei2.e().b(si2);
            si2.c(aei2.f().a());
            if (!bl2) continue;
            si2.c(aei2.g().a());
        }
        if (this.e()) {
            si2.c(bhm2.l());
        }
        return n3;
    }

    protected int a(bhm bhm2, boolean bl2, int n2) {
        int n3 = 0;
        aei[] arraei = bhm2.b();
        int n4 = arraei.length;
        for (int i2 = 0; i2 < n4; ++i2) {
            aei aei2 = arraei[i2];
            if (aei2 == bhm.a || this.e() && aei2.a() || (n2 & 1 << i2) == 0) continue;
            n3 += aei2.e().a();
            n3 += aei2.f().a().length;
            if (!bl2) continue;
            n3 += aei2.g().a().length;
        }
        if (this.e()) {
            n3 += bhm2.l().length;
        }
        return n3;
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.c;
    }

    public boolean e() {
        return this.f;
    }

    public List f() {
        return this.e;
    }
}

