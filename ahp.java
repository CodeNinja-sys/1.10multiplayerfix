/*
 * Decompiled with CFR 0.150.
 */
public class ahp
extends crh {
    private final atl e = new ckc();

    @Override
    protected atl a(bhl bhl2) {
        return this.e;
    }

    @Override
    public bql a(iu iu2, int n2) {
        return new cvy();
    }

    @Override
    protected void c(iu iu2, cmz cmz2) {
        bhl bhl2;
        anx anx2 = new anx(iu2, cmz2);
        bqo bqo2 = (bqo)anx2.g();
        if (bqo2 == null) {
            return;
        }
        int n2 = bqo2.k();
        if (n2 < 0) {
            iu2.b(1001, cmz2, 0);
            return;
        }
        bhl bhl3 = bqo2.a(n2);
        if (bhl3 == null) {
            return;
        }
        bqk bqk2 = (bqk)((Object)iu2.n(cmz2).b(a));
        cmz cmz3 = cmz2.c(bqk2);
        tb tb2 = cls.b(iu2, cmz3.a(), (double)cmz3.b(), cmz3.c());
        if (tb2 == null) {
            bhl2 = this.e.b(anx2, bhl3);
            if (bhl2 != null && bhl2.b <= 0) {
                bhl2 = null;
            }
        } else {
            bhl2 = cls.a(tb2, bhl3.j().a(1), bqk2.e());
            if (bhl2 == null) {
                bhl2 = bhl3.j();
                if (--bhl2.b <= 0) {
                    bhl2 = null;
                }
            } else {
                bhl2 = bhl3.j();
            }
        }
        bqo2.a(n2, bhl2);
    }
}

