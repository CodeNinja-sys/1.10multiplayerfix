/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class dcl
extends cgv {
    public dcl() {
        super(ahk.w, false);
        this.N = 0.98f;
        this.b(true);
        this.a(zm.b);
    }

    @Override
    public kj b() {
        return kj.d;
    }

    @Override
    public void a(iu iu2, bdl bdl2, cmz cmz2, dbk dbk2, bql bql2, bhl bhl2) {
        bdl2.a(bpv.a(this));
        bdl2.g(0.025f);
        if (this.c() && acz.a(bbh.r, bhl2) > 0) {
            bhl bhl3 = this.a_(dbk2);
            if (bhl3 != null) {
                dcl.a(iu2, cmz2, bhl3);
            }
        } else {
            if (iu2.q.m()) {
                iu2.f(cmz2);
                return;
            }
            int n2 = acz.a(bbh.t, bhl2);
            this.b(iu2, cmz2, dbk2, n2);
            ahk ahk2 = iu2.n(cmz2.h()).a();
            if (ahk2.c() || ahk2.d()) {
                iu2.a(cmz2, blg.i.s());
            }
        }
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, Random random) {
        if (iu2.b(bzq.b, cmz2) > 11 - this.s().c()) {
            this.c(iu2, cmz2);
        }
    }

    protected void c(iu iu2, cmz cmz2) {
        if (iu2.q.m()) {
            iu2.f(cmz2);
            return;
        }
        this.b(iu2, cmz2, iu2.n(cmz2), 0);
        iu2.a(cmz2, blg.j.s());
        iu2.c(cmz2, blg.j);
    }

    @Override
    public bez j(dbk dbk2) {
        return bez.a;
    }
}

