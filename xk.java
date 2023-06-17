/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class xk
extends ced {
    public xk() {
    }

    public xk(yj yj2, int n2, Random random, awx awx2, bqk bqk2) {
        super(yj2, n2);
        this.a(bqk2);
        this.l = awx2;
    }

    public static awx a(yj yj2, List list, Random random, int n2, int n3, int n4, bqk bqk2) {
        awx awx2 = awx.a(n2, n3, n4, 0, 0, 0, 3, 4, 2, bqk2);
        if (pc.a(list, awx2) != null) {
            return null;
        }
        return awx2;
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        if (this.g < 0) {
            this.g = this.b(iu2, awx2);
            if (this.g < 0) {
                return true;
            }
            this.l.a(0, this.g - this.l.e + 4 - 1, 0);
        }
        dbk dbk2 = this.a(blg.aO.s());
        this.a(iu2, awx2, 0, 0, 0, 2, 3, 1, blg.a.s(), blg.a.s(), false);
        this.a(iu2, dbk2, 1, 0, 0, awx2);
        this.a(iu2, dbk2, 1, 1, 0, awx2);
        this.a(iu2, dbk2, 1, 2, 0, awx2);
        this.a(iu2, blg.L.a(dck.a.c()), 1, 3, 0, awx2);
        this.a(iu2, bqk.f, 2, 3, 0, awx2);
        this.a(iu2, bqk.c, 1, 3, 1, awx2);
        this.a(iu2, bqk.e, 0, 3, 0, awx2);
        this.a(iu2, bqk.d, 1, 3, -1, awx2);
        return true;
    }
}

