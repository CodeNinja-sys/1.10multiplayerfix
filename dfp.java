/*
 * Decompiled with CFR 0.150.
 */
public class dfp
implements aoi {
    private final bax a;
    private final ccs b;
    private final bxw c = new bxw();
    private final bck d;

    public dfp(bax bax2, gt gt2) {
        this.a = bax2;
        this.b = new ccs(gt2);
        this.d = new bck(gt2);
    }

    public bax a() {
        return this.a;
    }

    public void a(dbk dbk2, cmz cmz2, ars ars2, bnj bnj2) {
        if (dbk2.i() != cpb.d) {
            return;
        }
        dbk2 = dbk2.b(bnj2, cmz2);
        bpi bpi2 = this.a.b(dbk2);
        bpi bpi3 = new ckp(dbk2, bpi2, ars2, cmz2).a();
        this.b.a(bnj2, bpi3, dbk2, cmz2, bha.a().c(), true);
    }

    public boolean a(dbk dbk2, cmz cmz2, bnj bnj2, bix bix2) {
        try {
            cpb cpb2 = dbk2.i();
            if (cpb2 == cpb.a) {
                return false;
            }
            if (bnj2.v() != aaf.g) {
                try {
                    dbk2 = dbk2.b(bnj2, cmz2);
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            switch (cpb2) {
                case d: {
                    return this.b.a(bnj2, this.a(dbk2), dbk2, cmz2, bix2, true);
                }
                case c: {
                    return false;
                }
                case b: {
                    return this.d.a(bnj2, dbk2, cmz2, bix2);
                }
            }
        }
        catch (Throwable throwable) {
            cet cet2 = cet.a(throwable, "Tesselating block in world");
            sx sx2 = cet2.a("Block being tesselated");
            sx.a(sx2, cmz2, dbk2.t(), dbk2.t().e(dbk2));
            throw new oz(cet2);
        }
        return false;
    }

    public ccs b() {
        return this.b;
    }

    public bpi a(dbk dbk2) {
        return this.a.b(dbk2);
    }

    public void a(dbk dbk2, float f2) {
        cpb cpb2 = dbk2.i();
        if (cpb2 == cpb.a) {
            return;
        }
        switch (cpb2) {
            case d: {
                bpi bpi2 = this.a(dbk2);
                this.b.a(bpi2, dbk2, f2, true);
                break;
            }
            case c: {
                this.c.a(dbk2.t(), f2);
                break;
            }
        }
    }

    public boolean a(bfa bfa2) {
        if (bfa2 == null) {
            return false;
        }
        cpb cpb2 = bfa2.s().i();
        if (cpb2 == cpb.d) {
            return false;
        }
        return cpb2 == cpb.c;
    }

    @Override
    public void a(akx akx2) {
        this.d.a();
    }
}

