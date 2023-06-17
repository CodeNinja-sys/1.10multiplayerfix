/*
 * Decompiled with CFR 0.150.
 */
public class vw
extends cgv {
    public vw() {
        super(ahk.B, false, bif.c);
        this.a(zm.c);
        this.N = 0.8f;
    }

    @Override
    public kj b() {
        return kj.d;
    }

    @Override
    public void a(iu iu2, cmz cmz2, cpk cpk2, float f2) {
        if (cpk2.ar_()) {
            super.a(iu2, cmz2, cpk2, f2);
        } else {
            cpk2.a(f2, 0.0f);
        }
    }

    @Override
    public void a(iu iu2, cpk cpk2) {
        if (cpk2.ar_()) {
            super.a(iu2, cpk2);
        } else if (cpk2.aY < 0.0) {
            cpk2.aY = -cpk2.aY;
            if (!(cpk2 instanceof bga)) {
                cpk2.aY *= 0.8;
            }
        }
    }

    @Override
    public void a(iu iu2, cmz cmz2, cpk cpk2) {
        if (Math.abs(cpk2.aY) < 0.1 && !cpk2.ar_()) {
            double d2 = 0.4 + Math.abs(cpk2.aY) * 0.2;
            cpk2.aX *= d2;
            cpk2.aZ *= d2;
        }
        super.a(iu2, cmz2, cpk2);
    }
}

