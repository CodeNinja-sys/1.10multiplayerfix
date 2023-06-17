/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.vi;

public class bof
extends azg {
    private final float a;
    private final avx b;

    public bof(avx avx2) {
        this.b = avx2;
        this.k = 1;
        this.e(avx2.a());
        this.a(zm.j);
        this.a = 3.0f + avx2.c();
    }

    public float f() {
        return this.b.c();
    }

    @Override
    public float a(bhl bhl2, dbk dbk2) {
        bfa bfa2 = dbk2.t();
        if (bfa2 == blg.G) {
            return 15.0f;
        }
        ahk ahk2 = dbk2.a();
        if (ahk2 == ahk.k || ahk2 == ahk.l || ahk2 == ahk.v || ahk2 == ahk.j || ahk2 == ahk.C) {
            return 1.5f;
        }
        return 1.0f;
    }

    @Override
    public boolean a(bhl bhl2, bga bga2, bga bga3) {
        bhl2.a(1, bga3);
        return true;
    }

    @Override
    public boolean a(bhl bhl2, iu iu2, dbk dbk2, cmz cmz2, bga bga2) {
        if ((double)dbk2.b(iu2, cmz2) != 0.0) {
            bhl2.a(2, bga2);
        }
        return true;
    }

    @Override
    public boolean aD_() {
        return true;
    }

    @Override
    public boolean a(dbk dbk2) {
        return dbk2.t() == blg.G;
    }

    @Override
    public int d() {
        return this.b.e();
    }

    public String g() {
        return this.b.toString();
    }

    @Override
    public boolean a(bhl bhl2, bhl bhl3) {
        if (this.b.f() == bhl3.a()) {
            return true;
        }
        return super.a(bhl2, bhl3);
    }

    @Override
    public vi a(dfm dfm2) {
        vi vi2 = super.a(dfm2);
        if (dfm2 == dfm.a) {
            vi2.a(cgz.e.b(), new cs(h, "Weapon modifier", this.a, 0));
            vi2.a(cgz.f.b(), new cs(i, "Weapon modifier", -2.4f, 0));
        }
        return vi2;
    }
}

