/*
 * Decompiled with CFR 0.150.
 */
public class ckm
extends cpk {
    public final bos a;
    public final String b;

    public ckm(bos bos2, String string, float f2, float f3) {
        super(bos2.b());
        this.a_(f2, f3);
        this.a = bos2;
        this.b = string;
    }

    @Override
    protected void a() {
    }

    @Override
    protected void b(bvp bvp2) {
    }

    @Override
    protected void a(bvp bvp2) {
    }

    @Override
    public boolean bc_() {
        return true;
    }

    @Override
    public boolean a(ahy ahy2, float f2) {
        if (this.c(ahy2)) {
            return false;
        }
        return this.a.a(this, ahy2, f2);
    }

    @Override
    public boolean g_(cpk cpk2) {
        return this == cpk2 || this.a == cpk2;
    }
}

