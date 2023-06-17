/*
 * Decompiled with CFR 0.150.
 */
public class qk
implements ds {
    private float a;
    private float b;
    private boolean c;
    private boolean d;

    public qk() {
    }

    public qk(float f2, float f3, boolean bl2, boolean bl3) {
        this.a = f2;
        this.b = f3;
        this.c = bl2;
        this.d = bl3;
    }

    @Override
    public void a(si si2) {
        this.a = si2.O();
        this.b = si2.O();
        byte by2 = si2.E();
        this.c = (by2 & 1) > 0;
        this.d = (by2 & 2) > 0;
    }

    @Override
    public void b(si si2) {
        si2.a(this.a);
        si2.a(this.b);
        byte by2 = 0;
        if (this.c) {
            by2 = (byte)(by2 | true ? 1 : 0);
        }
        if (this.d) {
            by2 = (byte)(by2 | 2);
        }
        si2.B(by2);
    }

    public void a(bws bws2) {
        bws2.a(this);
    }

    public float a() {
        return this.a;
    }

    public float b() {
        return this.b;
    }

    public boolean c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }
}

