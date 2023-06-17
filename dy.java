/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import java.util.Map;

public class dy
implements apx {
    private final bxy a;
    private final Map b = sz.c();
    private final Map c = sz.c();
    private final Map d = sz.c();
    private bdl e;
    private double f;
    private double g;
    private double h;

    public dy(bxy bxy2) {
        this.a = bxy2;
    }

    public void a(int n2, dbn dbn2, float f2) {
        this.b.put(n2, dbn2);
        this.d.put(n2, System.currentTimeMillis());
        this.c.put(n2, Float.valueOf(f2));
    }

    @Override
    public void a(float f2, long l2) {
        dbn dbn2;
        if (this.b.size() == 0) {
            return;
        }
        long l3 = System.currentTimeMillis();
        this.e = this.a.h;
        this.f = this.e.br + (this.e.aU - this.e.br) * (double)f2;
        this.g = this.e.bs + (this.e.aV - this.e.bs) * (double)f2;
        this.h = this.e.bt + (this.e.aW - this.e.bt) * (double)f2;
        cja.D();
        cja.l();
        cja.a(bjt.l, afi.j, bjt.e, afi.n);
        cja.c(0.0f, 1.0f, 0.0f, 0.75f);
        cja.w();
        cja.d(6.0f);
        for (Integer n2 : this.b.keySet()) {
            dbn2 = (dbn)this.b.get(n2);
            float f3 = ((Float)this.c.get(n2)).floatValue();
            this.a(f2, dbn2);
            aqn aqn2 = dbn2.i();
            if (this.a(aqn2) > 40.0f) continue;
            fr.b(new cxt((float)aqn2.a + 0.25f, (float)aqn2.b + 0.25f, (double)aqn2.c + 0.25, (float)aqn2.a + 0.75f, (float)aqn2.b + 0.75f, (float)aqn2.c + 0.75f).c(-this.f, -this.g, -this.h), 0.0f, 1.0f, 0.0f, 0.5f);
            for (int i2 = 0; i2 < dbn2.d(); ++i2) {
                aqn aqn3 = dbn2.a(i2);
                if (this.a(aqn3) > 40.0f) continue;
                float f4 = i2 == dbn2.e() ? 1.0f : 0.0f;
                float f5 = i2 == dbn2.e() ? 0.0f : 1.0f;
                fr.b(new cxt((float)aqn3.a + 0.5f - f3, (float)aqn3.b + 0.01f * (float)i2, (float)aqn3.c + 0.5f - f3, (float)aqn3.a + 0.5f + f3, (float)aqn3.b + 0.25f + 0.01f * (float)i2, (float)aqn3.c + 0.5f + f3).c(-this.f, -this.g, -this.h), f4, 0.0f, f5, 0.5f);
            }
        }
        for (Integer n2 : this.b.keySet()) {
            dbn2 = (dbn)this.b.get(n2);
            for (aqn aqn3 : dbn2.h()) {
                if (this.a(aqn3) > 40.0f) continue;
                bqw.a(String.format("%s", new Object[]{aqn3.m}), (double)aqn3.a + 0.5, (double)aqn3.b + 0.75, (double)aqn3.c + 0.5, f2, -65536);
                bqw.a(String.format("%.2f", Float.valueOf(aqn3.l)), (double)aqn3.a + 0.5, (double)aqn3.b + 0.25, (double)aqn3.c + 0.5, f2, -65536);
            }
            for (aqn aqn3 : dbn2.g()) {
                if (this.a(aqn3) > 40.0f) continue;
                bqw.a(String.format("%s", new Object[]{aqn3.m}), (double)aqn3.a + 0.5, (double)aqn3.b + 0.75, (double)aqn3.c + 0.5, f2, -16776961);
                bqw.a(String.format("%.2f", Float.valueOf(aqn3.l)), (double)aqn3.a + 0.5, (double)aqn3.b + 0.25, (double)aqn3.c + 0.5, f2, -16776961);
            }
            for (int i3 = 0; i3 < dbn2.d(); ++i3) {
                aqn aqn4 = dbn2.a(i3);
                if (this.a(aqn4) > 40.0f) continue;
                bqw.a(String.format("%s", new Object[]{aqn4.m}), (double)aqn4.a + 0.5, (double)aqn4.b + 0.75, (double)aqn4.c + 0.5, f2, -1);
                bqw.a(String.format("%.2f", Float.valueOf(aqn4.l)), (double)aqn4.a + 0.5, (double)aqn4.b + 0.25, (double)aqn4.c + 0.5, f2, -1);
            }
        }
        for (Integer n3 : this.d.keySet().toArray(new Integer[0])) {
            if (l3 - (Long)this.d.get(n3) <= 20000L) continue;
            this.b.remove(n3);
            this.d.remove(n3);
        }
        cja.v();
        cja.k();
        cja.E();
    }

    public void a(float f2, dbn dbn2) {
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        bix2.a(3, bxb.f);
        for (int i2 = 0; i2 < dbn2.d(); ++i2) {
            aqn aqn2 = dbn2.a(i2);
            if (this.a(aqn2) > 40.0f) continue;
            float f3 = (float)i2 / (float)dbn2.d() * 0.33f;
            int n2 = i2 == 0 ? 0 : cmk.c(f3, 0.9f, 0.9f);
            int n3 = n2 >> 16 & 0xFF;
            int n4 = n2 >> 8 & 0xFF;
            int n5 = n2 & 0xFF;
            bix2.b((double)aqn2.a - this.f + 0.5, (double)aqn2.b - this.g + 0.5, (double)aqn2.c - this.h + 0.5).b(n3, n4, n5, 255).d();
        }
        bha2.b();
    }

    private float a(aqn aqn2) {
        return (float)(Math.abs((double)aqn2.a - this.e.aU) + Math.abs((double)aqn2.b - this.e.aV) + Math.abs((double)aqn2.c - this.e.aW));
    }
}

