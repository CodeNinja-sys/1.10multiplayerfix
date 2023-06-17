/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

final class aha
extends c {
    @Override
    public void a(alj alj2, cmd cmd2, List list, int n2, cmz cmz2) {
        boolean bl2;
        int n3 = 40;
        boolean bl3 = n2 % 40 == 0;
        boolean bl4 = bl2 = n2 % 40 == 39;
        if (bl3 || bl2) {
            int n4 = n2 / 40;
            ajp[] arrajp = acp.a(alj2);
            if (n4 < arrajp.length) {
                ajp ajp2 = arrajp[n4];
                if (bl3) {
                    for (abi abi2 : list) {
                        abi2.a(new cmz(ajp2.a(), ajp2.d() + 1, ajp2.b()));
                    }
                } else {
                    int n5 = 10;
                    for (pj pj2 : cmz.b(new cmz(ajp2.a() - 10, ajp2.d() - 10, ajp2.b() - 10), new cmz(ajp2.a() + 10, ajp2.d() + 10, ajp2.b() + 10))) {
                        alj2.f(pj2);
                    }
                    alj2.a(null, (float)ajp2.a() + 0.5f, (double)ajp2.d(), (double)((float)ajp2.b() + 0.5f), 5.0f, true);
                    rq rq2 = new rq();
                    rq2.a(ajp2);
                    rq2.a(true);
                    rq2.a(new cmz(0, 128, 0));
                    rq2.a((iu)alj2, new Random(), new cmz(ajp2.a(), 45, ajp2.b()));
                }
            } else if (bl3) {
                cmd2.a(d);
            }
        }
    }
}

