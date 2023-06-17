/*
 * Decompiled with CFR 0.150.
 */
public class chh
extends chu {
    public chh() {
        this(0.0f, false);
    }

    public chh(float f2, boolean bl2) {
        super(f2, 0.0f, 64, bl2 ? 32 : 64);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, cpk cpk2) {
        float f8;
        super.a(f2, f3, f4, f5, f6, f7, cpk2);
        boolean bl2 = cpk2 instanceof oe && ((oe)cpk2).B();
        float f9 = cmk.a(this.l * (float)Math.PI);
        float f10 = cmk.a((1.0f - (1.0f - this.l) * (1.0f - this.l)) * (float)Math.PI);
        this.h.h = 0.0f;
        this.i.h = 0.0f;
        this.h.g = -(0.1f - f9 * 0.6f);
        this.i.g = 0.1f - f9 * 0.6f;
        this.h.f = f8 = (float)(-Math.PI) / (bl2 ? 1.5f : 2.25f);
        this.i.f = f8;
        this.h.f += f9 * 1.2f - f10 * 0.4f;
        this.i.f += f9 * 1.2f - f10 * 0.4f;
        this.h.h += cmk.b(f4 * 0.09f) * 0.05f + 0.05f;
        this.i.h -= cmk.b(f4 * 0.09f) * 0.05f + 0.05f;
        this.h.f += cmk.a(f4 * 0.067f) * 0.05f;
        this.i.f -= cmk.a(f4 * 0.067f) * 0.05f;
    }
}

