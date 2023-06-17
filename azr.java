/*
 * Decompiled with CFR 0.150.
 */
public class azr
extends eu {
    private final oe h;
    private int i;

    public azr(oe oe2, double d2, boolean bl2) {
        super(oe2, d2, bl2);
        this.h = oe2;
    }

    @Override
    public void c() {
        super.c();
        this.i = 0;
    }

    @Override
    public void d() {
        super.d();
        this.h.a(false);
    }

    @Override
    public void e() {
        super.e();
        ++this.i;
        if (this.i >= 5 && this.c < 10) {
            this.h.a(true);
        } else {
            this.h.a(false);
        }
    }
}

