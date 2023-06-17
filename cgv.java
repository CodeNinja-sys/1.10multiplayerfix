/*
 * Decompiled with CFR 0.150.
 */
public class cgv
extends bfa {
    private final boolean a;

    protected cgv(ahk ahk2, boolean bl2) {
        this(ahk2, bl2, ahk2.p());
    }

    protected cgv(ahk ahk2, boolean bl2, bif bif2) {
        super(ahk2, bif2);
        this.a = bl2;
    }

    @Override
    public boolean b(dbk dbk2) {
        return false;
    }

    @Override
    public boolean a(dbk dbk2, bnj bnj2, cmz cmz2, bqk bqk2) {
        dbk dbk3 = bnj2.n(cmz2.c(bqk2));
        bfa bfa2 = dbk3.t();
        if (this == blg.w || this == blg.cG) {
            if (dbk2 != dbk3) {
                return true;
            }
            if (bfa2 == this) {
                return false;
            }
        }
        if (!this.a && bfa2 == this) {
            return false;
        }
        return super.a(dbk2, bnj2, cmz2, bqk2);
    }
}

