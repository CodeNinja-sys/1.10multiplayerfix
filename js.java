/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cg;

final class js
implements ccd {
    js() {
    }

    public void a(si si2, cg cg2) {
        si2.a(cg2.b());
        if (cg2.b()) {
            si2.a((cmz)cg2.c());
        }
    }

    public cg a(si si2) {
        if (!si2.D()) {
            return cg.f();
        }
        return cg.b(si2.c());
    }

    @Override
    public bcz a(int n2) {
        return new bcz(n2, this);
    }

    @Override
    public /* synthetic */ Object b(si si2) {
        return this.a(si2);
    }
}

