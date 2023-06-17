/*
 * Decompiled with CFR 0.150.
 */
import com.c.a.e;

public abstract class ciy
extends bdl {
    private bae a;
    public float aK;
    public float aL;
    public float aM;

    public ciy(iu iu2, e e2) {
        super(iu2, e2);
    }

    @Override
    public boolean aL() {
        bae bae2 = bxy.B().x().a(this.aq().a());
        return bae2 != null && bae2.b() == bvh.e;
    }

    @Override
    public boolean aM() {
        bae bae2 = bxy.B().x().a(this.aq().a());
        return bae2 != null && bae2.b() == bvh.c;
    }

    public boolean bN() {
        return this.bO() != null;
    }

    protected bae bO() {
        if (this.a == null) {
            this.a = bxy.B().x().a(this.cx());
        }
        return this.a;
    }

    public boolean bP() {
        bae bae2 = this.bO();
        return bae2 != null && bae2.d();
    }

    public bpx bQ() {
        bae bae2 = this.bO();
        return bae2 == null ? ccj.a(this.cx()) : bae2.f();
    }

    public bpx bR() {
        bae bae2 = this.bO();
        return bae2 == null ? null : bae2.g();
    }

    public boolean bS() {
        return this.bO() != null;
    }

    public bpx bT() {
        bae bae2 = this.bO();
        return bae2 == null ? null : bae2.h();
    }

    public static bjm a(bpx bpx2, String string) {
        bnm bnm2 = bxy.B().P();
        dfs dfs2 = bnm2.b(bpx2);
        if (dfs2 == null) {
            dfs2 = new bjm(null, String.format("http://skins.minecraft.net/MinecraftSkins/%s.png", aco.a(string)), ccj.a(ciy.c(string)), new bmu());
            bnm2.a(bpx2, dfs2);
        }
        return (bjm)dfs2;
    }

    public static bpx d(String string) {
        return new bpx("skins/" + aco.a(string));
    }

    public String bU() {
        bae bae2 = this.bO();
        return bae2 == null ? ccj.b(this.cx()) : bae2.e();
    }

    public float bV() {
        float f2 = 1.0f;
        if (this.G.b) {
            f2 *= 1.1f;
        }
        cp cp2 = this.a(cgz.d);
        f2 = (float)((double)f2 * ((cp2.e() / (double)this.G.b() + 1.0) / 2.0));
        if (this.G.b() == 0.0f || Float.isNaN(f2) || Float.isInfinite(f2)) {
            f2 = 1.0f;
        }
        if (this.ag_() && this.bG() != null && this.bG().a() == hp.f) {
            int n2 = this.bI();
            float f3 = (float)n2 / 20.0f;
            f3 = f3 > 1.0f ? 1.0f : (f3 *= f3);
            f2 *= 1.0f - f3 * 0.15f;
        }
        return f2;
    }
}

