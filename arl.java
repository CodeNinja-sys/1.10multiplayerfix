/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.List;

public class arl
extends ar {
    private static final List a = ov.a(dah.dP, dah.dN, dah.dS, dah.dQ, dah.dO);

    public arl() {
        super(ahk.d);
        this.a(zm.d);
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
        boolean bl2 = iu2.x(cmz2);
        bql bql2 = iu2.q(cmz2);
        if (bql2 instanceof bkh) {
            bkh bkh2 = (bkh)bql2;
            if (bkh2.b != bl2) {
                if (bl2) {
                    bkh2.a(iu2, cmz2);
                }
                bkh2.b = bl2;
            }
        }
    }

    @Override
    public boolean a(iu iu2, cmz cmz2, dbk dbk2, bdl bdl2, bqp bqp2, bhl bhl2, bqk bqk2, float f2, float f3, float f4) {
        if (iu2.C) {
            return true;
        }
        bql bql2 = iu2.q(cmz2);
        if (bql2 instanceof bkh) {
            bkh bkh2 = (bkh)bql2;
            bkh2.f();
            bkh2.a(iu2, cmz2);
            bdl2.a(bpv.U);
        }
        return true;
    }

    @Override
    public void a(iu iu2, cmz cmz2, bdl bdl2) {
        if (iu2.C) {
            return;
        }
        bql bql2 = iu2.q(cmz2);
        if (bql2 instanceof bkh) {
            ((bkh)bql2).a(iu2, cmz2);
            bdl2.a(bpv.T);
        }
    }

    @Override
    public bql a(iu iu2, int n2) {
        return new bkh();
    }

    private bi b(int n2) {
        if (n2 < 0 || n2 >= a.size()) {
            n2 = 0;
        }
        return (bi)a.get(n2);
    }

    @Override
    public boolean a(dbk dbk2, iu iu2, cmz cmz2, int n2, int n3) {
        float f2 = (float)Math.pow(2.0, (double)(n3 - 12) / 12.0);
        iu2.a(null, cmz2, this.b(n2), csg.c, 3.0f, f2);
        iu2.a(lz.x, (double)cmz2.a() + 0.5, (double)cmz2.b() + 1.2, (double)cmz2.c() + 0.5, (double)n3 / 24.0, 0.0, 0.0, new int[0]);
        return true;
    }

    @Override
    public cpb g(dbk dbk2) {
        return cpb.d;
    }
}

