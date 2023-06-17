/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.c.a;

public class zi
implements bde {
    private final a a;
    private final alj b;

    public zi(a a2, alj alj2) {
        this.a = a2;
        this.b = alj2;
    }

    @Override
    public void a(int n2, boolean bl2, double d2, double d3, double d4, double d5, double d6, double d7, int ... arrn) {
    }

    @Override
    public void a(cpk cpk2) {
        this.b.af().a(cpk2);
        if (cpk2 instanceof czt) {
            this.b.q.a((czt)cpk2);
        }
    }

    @Override
    public void b(cpk cpk2) {
        this.b.af().b(cpk2);
        this.b.P().a(cpk2);
        if (cpk2 instanceof czt) {
            this.b.q.b((czt)cpk2);
        }
    }

    @Override
    public void a(bdl bdl2, bi bi2, csg csg2, double d2, double d3, double d4, float f2, float f3) {
        ((cmt)((Object)this.a.al())).a(bdl2, d2, d3, d4, f2 > 1.0f ? (double)(16.0f * f2) : 16.0, this.b.q.a().a(), new cya(bi2, csg2, d2, d3, d4, f2, f3));
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7) {
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, dbk dbk3, int n2) {
        this.b.ag().a(cmz2);
    }

    @Override
    public void a(cmz cmz2) {
    }

    @Override
    public void a(bi bi2, cmz cmz2) {
    }

    @Override
    public void a(bdl bdl2, int n2, cmz cmz2, int n3) {
        ((cmt)((Object)this.a.al())).a(bdl2, cmz2.a(), cmz2.b(), cmz2.c(), 64.0, this.b.q.a().a(), new aqp(n2, cmz2, n3, false));
    }

    @Override
    public void a(int n2, cmz cmz2, int n3) {
        ((cmt)((Object)this.a.al())).a(new aqp(n2, cmz2, n3, true));
    }

    @Override
    public void b(int n2, cmz cmz2, int n3) {
        for (czt czt2 : ((cmt)((Object)this.a.al())).u()) {
            double d2;
            double d3;
            double d4;
            if (czt2 == null || czt2.aQ != this.b || czt2.bW() == n2 || !((d4 = (double)cmz2.a() - czt2.aU) * d4 + (d3 = (double)cmz2.b() - czt2.aV) * d3 + (d2 = (double)cmz2.c() - czt2.aW) * d2 < 1024.0)) continue;
            czt2.a.a(new aaw(n2, cmz2, n3));
        }
    }
}

