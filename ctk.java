/*
 * Decompiled with CFR 0.150.
 */
public abstract class ctk
extends deg {
    public ctk(brd brd2) {
        super(brd2);
    }

    @Override
    public boolean h() {
        return true;
    }

    @Override
    public float a(ckm ckm2, ahy ahy2, float f2) {
        if (ahy2.a() instanceof cwt) {
            ahy2.a().m(1);
            return 0.0f;
        }
        return super.a(ckm2, ahy2, f2);
    }
}

