/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.bl;

class alq
implements bl {
    final /* synthetic */ cyx a;

    alq(cyx cyx2) {
        this.a = cyx2;
    }

    public Double a(bdl bdl2) {
        bhl bhl2 = bdl2.a(dfm.f);
        if (bhl2 != null && bhl2.a() == hp.ch) {
            boolean bl2;
            int n2 = bhl2.g();
            boolean bl3 = this.a.c instanceof azy && ((azy)this.a.c).Z() == aoy.a && n2 == 0;
            boolean bl4 = this.a.c instanceof oe && n2 == 2;
            boolean bl5 = bl2 = this.a.c instanceof ddh && n2 == 4;
            if (bl3 || bl4 || bl2) {
                return 0.5;
            }
        }
        return 1.0;
    }

    @Override
    public /* synthetic */ Object a(Object object) {
        return this.a((bdl)object);
    }
}

