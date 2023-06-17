/*
 * Decompiled with CFR 0.150.
 */
class blc {
    private final aph b;
    private final cze c;
    private final bpx d;
    private final int[] e;
    final /* synthetic */ bte a;

    private blc(bte bte2, aph aph2) {
        this.a = bte2;
        this.b = aph2;
        this.c = new cze(128, 128);
        this.e = this.c.c();
        this.d = bte.a(bte2).a("map/" + aph2.a, this.c);
        for (int i2 = 0; i2 < this.e.length; ++i2) {
            this.e[i2] = 0;
        }
    }

    private void a() {
        for (int i2 = 0; i2 < 16384; ++i2) {
            int n2 = this.b.g[i2] & 0xFF;
            this.e[i2] = n2 / 4 == 0 ? (i2 + i2 / 128 & 1) * 8 + 16 << 24 : bif.a[n2 / 4].a(n2 & 3);
        }
        this.c.b();
    }

    private void a(boolean bl2) {
        boolean bl3 = false;
        boolean bl4 = false;
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        float f2 = 0.0f;
        bte.a(this.a).a(this.d);
        cja.l();
        cja.a(bjt.e, afi.j, bjt.o, afi.e);
        cja.c();
        bix2.a(7, bxb.g);
        bix2.b(0.0, 128.0, (double)-0.01f).a(0.0, 1.0).d();
        bix2.b(128.0, 128.0, (double)-0.01f).a(1.0, 1.0).d();
        bix2.b(128.0, 0.0, (double)-0.01f).a(1.0, 0.0).d();
        bix2.b(0.0, 0.0, (double)-0.01f).a(0.0, 0.0).d();
        bha2.b();
        cja.d();
        cja.k();
        bte.a(this.a).a(bte.b());
        int n2 = 0;
        for (e e2 : this.b.i.values()) {
            if (bl2 && e2.a() != 1) continue;
            cja.D();
            cja.c(0.0f + (float)e2.b() / 2.0f + 64.0f, 0.0f + (float)e2.c() / 2.0f + 64.0f, -0.02f);
            cja.b((float)(e2.d() * 360) / 16.0f, 0.0f, 0.0f, 1.0f);
            cja.b(4.0f, 4.0f, 3.0f);
            cja.c(-0.125f, 0.125f, 0.0f);
            byte by2 = e2.a();
            float f3 = (float)(by2 % 4 + 0) / 4.0f;
            float f4 = (float)(by2 / 4 + 0) / 4.0f;
            float f5 = (float)(by2 % 4 + 1) / 4.0f;
            float f6 = (float)(by2 / 4 + 1) / 4.0f;
            bix2.a(7, bxb.g);
            float f7 = -0.001f;
            bix2.b(-1.0, 1.0, (double)((float)n2 * -0.001f)).a(f3, f4).d();
            bix2.b(1.0, 1.0, (double)((float)n2 * -0.001f)).a(f5, f4).d();
            bix2.b(1.0, -1.0, (double)((float)n2 * -0.001f)).a(f5, f6).d();
            bix2.b(-1.0, -1.0, (double)((float)n2 * -0.001f)).a(f3, f6).d();
            bha2.b();
            cja.E();
            ++n2;
        }
        cja.D();
        cja.c(0.0f, 0.0f, -0.04f);
        cja.b(1.0f, 1.0f, 1.0f);
        cja.E();
    }

    static /* synthetic */ void a(blc blc2) {
        blc2.a();
    }

    static /* synthetic */ void a(blc blc2, boolean bl2) {
        blc2.a(bl2);
    }

    /* synthetic */ blc(bte bte2, aph aph2, adc adc2) {
        this(bte2, aph2);
    }

    static /* synthetic */ bpx b(blc blc2) {
        return blc2.d;
    }
}

