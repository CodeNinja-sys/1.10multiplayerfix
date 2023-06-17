/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import java.util.Map;

public abstract class ayh
implements czo {
    protected static final bpx b = new bpx("textures/misc/enchanted_item_glint.png");
    protected axg c;
    protected axg d;
    private final wq a;
    private float e = 1.0f;
    private float f = 1.0f;
    private float g = 1.0f;
    private float h = 1.0f;
    private boolean i;
    private static final Map j = sz.c();

    public ayh(wq wq2) {
        this.a = wq2;
        this.b();
    }

    @Override
    public void a(bga bga2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.a(bga2, f2, f3, f4, f5, f6, f7, f8, dfm.e);
        this.a(bga2, f2, f3, f4, f5, f6, f7, f8, dfm.d);
        this.a(bga2, f2, f3, f4, f5, f6, f7, f8, dfm.c);
        this.a(bga2, f2, f3, f4, f5, f6, f7, f8, dfm.f);
    }

    @Override
    public boolean a() {
        return false;
    }

    private void a(bga bga2, float f2, float f3, float f4, float f5, float f6, float f7, float f8, dfm dfm2) {
        bhl bhl2 = this.a(bga2, dfm2);
        if (bhl2 == null || !(bhl2.a() instanceof uh)) {
            return;
        }
        uh uh2 = (uh)bhl2.a();
        if (uh2.e() != dfm2) {
            return;
        }
        axg axg2 = this.a(dfm2);
        axg2.a(this.a.c());
        axg2.a(bga2, f2, f3, f4);
        this.a(axg2, dfm2);
        boolean bl2 = this.b(dfm2);
        this.a.a(this.a(uh2, bl2));
        switch (uh2.f()) {
            case a: {
                int n2 = uh2.f(bhl2);
                float f9 = (float)(n2 >> 16 & 0xFF) / 255.0f;
                float f10 = (float)(n2 >> 8 & 0xFF) / 255.0f;
                float f11 = (float)(n2 & 0xFF) / 255.0f;
                cja.c(this.f * f9, this.g * f10, this.h * f11, this.e);
                axg2.a(bga2, f2, f3, f5, f6, f7, f8);
                this.a.a(this.a(uh2, bl2, "overlay"));
            }
            case b: 
            case c: 
            case d: 
            case e: {
                cja.c(this.f, this.g, this.h, this.e);
                axg2.a(bga2, f2, f3, f5, f6, f7, f8);
            }
        }
        if (!this.i && bhl2.w()) {
            ayh.a(this.a, bga2, axg2, f2, f3, f4, f5, f6, f7, f8);
        }
    }

    public bhl a(bga bga2, dfm dfm2) {
        return bga2.a(dfm2);
    }

    public axg a(dfm dfm2) {
        return this.b(dfm2) ? this.c : this.d;
    }

    private boolean b(dfm dfm2) {
        return dfm2 == dfm.d;
    }

    public static void a(wq wq2, bga bga2, axg axg2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = (float)bga2.by + f4;
        wq2.a(b);
        cja.l();
        cja.c(514);
        cja.a(false);
        float f10 = 0.5f;
        cja.c(0.5f, 0.5f, 0.5f, 1.0f);
        for (int i2 = 0; i2 < 2; ++i2) {
            cja.f();
            cja.a(bjt.n, afi.e);
            float f11 = 0.76f;
            cja.c(0.38f, 0.19f, 0.608f, 1.0f);
            cja.l(5890);
            cja.C();
            float f12 = 0.33333334f;
            cja.b(0.33333334f, 0.33333334f, 0.33333334f);
            cja.b(30.0f - (float)i2 * 60.0f, 0.0f, 0.0f, 1.0f);
            cja.c(0.0f, f9 * (0.001f + (float)i2 * 0.003f) * 20.0f, 0.0f);
            cja.l(5888);
            axg2.a(bga2, f2, f3, f5, f6, f7, f8);
        }
        cja.l(5890);
        cja.C();
        cja.l(5888);
        cja.e();
        cja.a(true);
        cja.c(515);
        cja.k();
    }

    private bpx a(uh uh2, boolean bl2) {
        return this.a(uh2, bl2, null);
    }

    private bpx a(uh uh2, boolean bl2, String string) {
        Object[] arrobject = new Object[3];
        arrobject[0] = uh2.f().d();
        arrobject[1] = bl2 ? 2 : 1;
        arrobject[2] = string == null ? "" : String.format("_%s", string);
        String string2 = String.format("textures/models/armor/%s_layer_%d%s.png", arrobject);
        bpx bpx2 = (bpx)j.get(string2);
        if (bpx2 == null) {
            bpx2 = new bpx(string2);
            j.put(string2, bpx2);
        }
        return bpx2;
    }

    protected abstract void b();

    protected abstract void a(axg var1, dfm var2);
}

