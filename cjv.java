/*
 * Decompiled with CFR 0.150.
 */
abstract class cjv
extends pc {
    protected cfn a;

    public cjv() {
    }

    public cjv(int n2, cfn cfn2) {
        super(n2);
        this.a = cfn2;
    }

    @Override
    protected void a(bvp bvp2) {
        bvp2.a("MST", this.a.ordinal());
    }

    @Override
    protected void b(bvp bvp2) {
        this.a = cfn.a(bvp2.h("MST"));
    }

    protected dbk f() {
        switch (this.a) {
            default: {
                return blg.f.s();
            }
            case b: 
        }
        return blg.f.s().a(adg.a, (Comparable)((Object)zg.f));
    }

    protected dbk g() {
        switch (this.a) {
            default: {
                return blg.aO.s();
            }
            case b: 
        }
        return blg.aS.s();
    }

    protected boolean a(iu iu2, awx awx2, int n2, int n3, int n4, int n5) {
        for (int i2 = n2; i2 <= n3; ++i2) {
            if (this.a(iu2, i2, n4 + 1, n5, awx2).a() != ahk.a) continue;
            return false;
        }
        return true;
    }
}

