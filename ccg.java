/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import java.util.Map;

public class ccg {
    private final Map n = sz.c();
    public static ccg a = new ccg();
    private deb o;
    public static double b;
    public static double c;
    public static double d;
    public bnm e;
    public iu f;
    public cpk g;
    public float h;
    public float i;
    public auu j;
    public double k;
    public double l;
    public double m;

    private ccg() {
        this.n.put(bxr.class, new cbr());
        this.n.put(ze.class, new bff());
        this.n.put(csv.class, new ly());
        this.n.put(bdm.class, new ng());
        this.n.put(abn.class, new acs());
        this.n.put(app.class, new asl());
        this.n.put(alv.class, new es());
        this.n.put(bii.class, new cjz());
        this.n.put(agq.class, new ep());
        this.n.put(tr.class, new fu());
        this.n.put(cwd.class, new crg());
        this.n.put(i.class, new crj());
        for (kh kh2 : this.n.values()) {
            kh2.a(this);
        }
    }

    public kh a(Class class_) {
        kh kh2 = (kh)this.n.get(class_);
        if (kh2 == null && class_ != bql.class) {
            kh2 = this.a(class_.getSuperclass());
            this.n.put(class_, kh2);
        }
        return kh2;
    }

    public kh a(bql bql2) {
        if (bql2 == null) {
            return null;
        }
        return this.a(bql2.getClass());
    }

    public void a(iu iu2, bnm bnm2, deb deb2, cpk cpk2, auu auu2, float f2) {
        if (this.f != iu2) {
            this.a(iu2);
        }
        this.e = bnm2;
        this.g = cpk2;
        this.o = deb2;
        this.j = auu2;
        this.h = cpk2.bc + (cpk2.ba - cpk2.bc) * f2;
        this.i = cpk2.bd + (cpk2.bb - cpk2.bd) * f2;
        this.k = cpk2.br + (cpk2.aU - cpk2.br) * (double)f2;
        this.l = cpk2.bs + (cpk2.aV - cpk2.bs) * (double)f2;
        this.m = cpk2.bt + (cpk2.aW - cpk2.bt) * (double)f2;
    }

    public void a(bql bql2, float f2, int n2) {
        if (bql2.a(this.k, this.l, this.m) < bql2.d_()) {
            bjr.b();
            int n3 = this.f.b(bql2.y(), 0);
            int n4 = n3 % 65536;
            int n5 = n3 / 65536;
            cjg.a(cjg.r, n4, (float)n5);
            cja.c(1.0f, 1.0f, 1.0f, 1.0f);
            cmz cmz2 = bql2.y();
            this.a(bql2, (double)cmz2.a() - b, (double)cmz2.b() - c, (double)cmz2.c() - d, f2, n2);
        }
    }

    public void a(bql bql2, double d2, double d3, double d4, float f2) {
        this.a(bql2, d2, d3, d4, f2, -1);
    }

    public void a(bql bql2, double d2, double d3, double d4, float f2, int n2) {
        kh kh2 = this.a(bql2);
        if (kh2 != null) {
            try {
                kh2.a(bql2, d2, d3, d4, f2, n2);
            }
            catch (Throwable throwable) {
                cet cet2 = cet.a(throwable, "Rendering Block Entity");
                sx sx2 = cet2.a("Block Entity Details");
                bql2.a(sx2);
                throw new oz(cet2);
            }
        }
    }

    public void a(iu iu2) {
        this.f = iu2;
        if (iu2 == null) {
            this.g = null;
        }
    }

    public deb a() {
        return this.o;
    }
}

