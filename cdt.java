/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class cdt
extends aeu {
    public cdt(int n2, float f2, boolean bl2) {
        super(n2, f2, bl2);
        this.a(true);
    }

    @Override
    public boolean a(bhl bhl2) {
        return bhl2.h() > 0;
    }

    @Override
    public abj b_(bhl bhl2) {
        if (bhl2.h() == 0) {
            return abj.c;
        }
        return abj.d;
    }

    @Override
    protected void a(bhl bhl2, iu iu2, bdl bdl2) {
        if (!iu2.C) {
            if (bhl2.h() > 0) {
                bdl2.a((cyd)bpa.M);
                bdl2.b(new cko(ake.j, 400, 1));
                bdl2.b(new cko(ake.k, 6000, 0));
                bdl2.b(new cko(ake.l, 6000, 0));
                bdl2.b(new cko(ake.v, 2400, 3));
            } else {
                bdl2.b(new cko(ake.j, 100, 1));
                bdl2.b(new cko(ake.v, 2400, 0));
            }
        }
    }

    @Override
    public void a(azg azg2, zm zm2, List list) {
        list.add(new bhl(azg2));
        list.add(new bhl(azg2, 1, 1));
    }
}

