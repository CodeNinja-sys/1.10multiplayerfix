/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.vi;
import java.util.Set;

public class xi
extends azg {
    private final Set e;
    protected float a = 4.0f;
    protected float b;
    protected float c;
    protected avx d;

    protected xi(float f2, float f3, avx avx2, Set set) {
        this.d = avx2;
        this.e = set;
        this.k = 1;
        this.e(avx2.a());
        this.a = avx2.b();
        this.b = f2 + avx2.c();
        this.c = f3;
        this.a(zm.i);
    }

    protected xi(avx avx2, Set set) {
        this(0.0f, 0.0f, avx2, set);
    }

    @Override
    public float a(bhl bhl2, dbk dbk2) {
        return this.e.contains(dbk2.t()) ? this.a : 1.0f;
    }

    @Override
    public boolean a(bhl bhl2, bga bga2, bga bga3) {
        bhl2.a(2, bga3);
        return true;
    }

    @Override
    public boolean a(bhl bhl2, iu iu2, dbk dbk2, cmz cmz2, bga bga2) {
        if ((double)dbk2.b(iu2, cmz2) != 0.0) {
            bhl2.a(1, bga2);
        }
        return true;
    }

    @Override
    public boolean aD_() {
        return true;
    }

    public avx f() {
        return this.d;
    }

    @Override
    public int d() {
        return this.d.e();
    }

    public String g() {
        return this.d.toString();
    }

    @Override
    public boolean a(bhl bhl2, bhl bhl3) {
        if (this.d.f() == bhl3.a()) {
            return true;
        }
        return super.a(bhl2, bhl3);
    }

    @Override
    public vi a(dfm dfm2) {
        vi vi2 = super.a(dfm2);
        if (dfm2 == dfm.a) {
            vi2.a(cgz.e.b(), new cs(h, "Tool modifier", this.b, 0));
            vi2.a(cgz.f.b(), new cs(i, "Tool modifier", this.c, 0));
        }
        return vi2;
    }
}

