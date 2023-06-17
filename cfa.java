/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class cfa
extends buc {
    private final bth a;
    private final Random b = new Random();

    public cfa(bid bid2, bth bth2) {
        super(bid2);
        this.a = bth2;
        this.h = 0.15f;
        this.i = 0.75f;
    }

    private int a(er er2, double d2, double d3, double d4, float f2, bpi bpi2) {
        bhl bhl2 = er2.h();
        azg azg2 = bhl2.a();
        if (azg2 == null) {
            return 0;
        }
        boolean bl2 = bpi2.b();
        int n2 = this.a(bhl2);
        float f3 = 0.25f;
        float f4 = cmk.a(((float)er2.k() + f2) / 10.0f + er2.a) * 0.1f + 0.1f;
        float f5 = bpi2.e().b((cua)cua.h).d.b;
        cja.c((float)d2, (float)d3 + f4 + 0.25f * f5, (float)d4);
        if (bl2 || this.g.g != null) {
            float f6 = (((float)er2.k() + f2) / 20.0f + er2.a) * 57.295776f;
            cja.b(f6, 0.0f, 1.0f, 0.0f);
        }
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        return n2;
    }

    private int a(bhl bhl2) {
        int n2 = 1;
        if (bhl2.b > 48) {
            n2 = 5;
        } else if (bhl2.b > 32) {
            n2 = 4;
        } else if (bhl2.b > 16) {
            n2 = 3;
        } else if (bhl2.b > 1) {
            n2 = 2;
        }
        return n2;
    }

    public void a(er er2, double d2, double d3, double d4, float f2, float f3) {
        float f4;
        float f5;
        bhl bhl2 = er2.h();
        int n2 = bhl2 != null && bhl2.a() != null ? azg.a(bhl2.a()) + bhl2.h() : 187;
        this.b.setSeed(n2);
        boolean bl2 = false;
        if (this.e(er2)) {
            this.g.a.b(this.a(er2)).b(false, false);
            bl2 = true;
        }
        cja.A();
        cja.a(516, 0.1f);
        cja.l();
        bjr.b();
        cja.a(bjt.l, afi.j, bjt.e, afi.n);
        cja.D();
        bpi bpi2 = this.a.a(bhl2, er2.aQ, null);
        int n3 = this.a(er2, d2, d3, d4, f3, bpi2);
        float f6 = bpi2.e().q.d.a;
        float f7 = bpi2.e().q.d.b;
        float f8 = bpi2.e().q.d.c;
        boolean bl3 = bpi2.b();
        if (!bl3) {
            float f9 = -0.0f * (float)(n3 - 1) * 0.5f * f6;
            f5 = -0.0f * (float)(n3 - 1) * 0.5f * f7;
            f4 = -0.09375f * (float)(n3 - 1) * 0.5f * f8;
            cja.c(f9, f5, f4);
        }
        if (this.j) {
            cja.g();
            cja.e(this.d(er2));
        }
        for (int i2 = 0; i2 < n3; ++i2) {
            if (bl3) {
                cja.D();
                if (i2 > 0) {
                    f5 = (this.b.nextFloat() * 2.0f - 1.0f) * 0.15f;
                    f4 = (this.b.nextFloat() * 2.0f - 1.0f) * 0.15f;
                    float f10 = (this.b.nextFloat() * 2.0f - 1.0f) * 0.15f;
                    cja.c(f5, f4, f10);
                }
                bpi2.e().a(cua.h);
                this.a.a(bhl2, bpi2);
                cja.E();
                continue;
            }
            cja.D();
            if (i2 > 0) {
                f5 = (this.b.nextFloat() * 2.0f - 1.0f) * 0.15f * 0.5f;
                f4 = (this.b.nextFloat() * 2.0f - 1.0f) * 0.15f * 0.5f;
                cja.c(f5, f4, 0.0f);
            }
            bpi2.e().a(cua.h);
            this.a.a(bhl2, bpi2);
            cja.E();
            cja.c(0.0f * f6, 0.0f * f7, 0.09375f * f8);
        }
        if (this.j) {
            cja.m();
            cja.h();
        }
        cja.E();
        cja.B();
        cja.k();
        this.e(er2);
        if (bl2) {
            this.g.a.b(this.a(er2)).d();
        }
        super.a((cpk)er2, d2, d3, d4, f2, f3);
    }

    protected bpx a(er er2) {
        return dam.g;
    }
}

