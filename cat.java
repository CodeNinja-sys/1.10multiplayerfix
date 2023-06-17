/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.c.ab;

class cat
extends ab {
    private final iu a;
    private final boolean b;

    public cat(iu iu2, boolean bl2) {
        this.a = iu2;
        this.b = bl2;
    }

    public amr a(cmz cmz2) {
        return new amr(this.a, cmz2, this.b);
    }

    @Override
    public /* synthetic */ Object a(Object object) {
        return this.a((cmz)object);
    }
}

