/*
 * Decompiled with CFR 0.150.
 */
public class biz
extends cyg {
    public biz() {
        this.h = true;
    }

    public biz(float f2, float f3, boolean bl2) {
        this.d = f2;
        this.e = f3;
        this.f = bl2;
        this.h = true;
    }

    @Override
    public void a(si si2) {
        this.d = si2.O();
        this.e = si2.O();
        super.a(si2);
    }

    @Override
    public void b(si si2) {
        si2.a(this.d);
        si2.a(this.e);
        super.b(si2);
    }
}

