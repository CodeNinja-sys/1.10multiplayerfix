/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cg;

final class bo
implements ccd {
    bo() {
    }

    public void a(si si2, cg cg2) {
        if (cg2.b()) {
            si2.d(bfa.u((dbk)cg2.c()));
        } else {
            si2.d(0);
        }
    }

    public cg a(si si2) {
        int n2 = si2.e();
        if (n2 == 0) {
            return cg.f();
        }
        return cg.b(bfa.g(n2));
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

