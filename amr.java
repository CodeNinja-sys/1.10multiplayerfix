/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;

public class amr {
    private final iu a;
    private final cmz b;
    private final boolean c;
    private dbk d;
    private bql e;
    private boolean f;

    public amr(iu iu2, cmz cmz2, boolean bl2) {
        this.a = iu2;
        this.b = cmz2;
        this.c = bl2;
    }

    public dbk a() {
        if (this.d == null && (this.c || this.a.d(this.b))) {
            this.d = this.a.n(this.b);
        }
        return this.d;
    }

    public bql b() {
        if (this.e == null && !this.f) {
            this.e = this.a.q(this.b);
            this.f = true;
        }
        return this.e;
    }

    public cmz c() {
        return this.b;
    }

    public static cm a(cm cm2) {
        return new q(cm2);
    }
}

