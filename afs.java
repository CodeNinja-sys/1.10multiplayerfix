/*
 * Decompiled with CFR 0.150.
 */
import com.c.a.e;

final class afs
extends ckc {
    private boolean a = true;

    afs() {
    }

    @Override
    protected bhl a(bcl bcl2, bhl bhl2) {
        iu iu2 = bcl2.a();
        bqk bqk2 = (bqk)((Object)bcl2.f().b(crh.a));
        cmz cmz2 = bcl2.e().c(bqk2);
        cvc cvc2 = blg.ce;
        if (iu2.c(cmz2) && cvc2.b(iu2, cmz2, bhl2)) {
            if (!iu2.C) {
                iu2.a(cmz2, cvc2.s().a(cvc.a, (Comparable)((Object)bqk.b)), 3);
                bql bql2 = iu2.q(cmz2);
                if (bql2 instanceof tr) {
                    if (bhl2.h() == 3) {
                        e e2 = null;
                        if (bhl2.n()) {
                            String string;
                            bvp bvp2 = bhl2.o();
                            if (bvp2.b("SkullOwner", 10)) {
                                e2 = ayj.a(bvp2.o("SkullOwner"));
                            } else if (bvp2.b("SkullOwner", 8) && !aco.b(string = bvp2.l("SkullOwner"))) {
                                e2 = new e(null, string);
                            }
                        }
                        ((tr)bql2).a(e2);
                    } else {
                        ((tr)bql2).a(bhl2.h());
                    }
                    ((tr)bql2).b(bqk2.e().c() * 4);
                    blg.ce.a(iu2, cmz2, (tr)bql2);
                }
                --bhl2.b;
            }
        } else if (uh.a(bcl2, bhl2) == null) {
            this.a = false;
        }
        return bhl2;
    }

    @Override
    protected void a(bcl bcl2) {
        if (this.a) {
            bcl2.a().b(1000, bcl2.e(), 0);
        } else {
            bcl2.a().b(1001, bcl2.e(), 0);
        }
    }
}

