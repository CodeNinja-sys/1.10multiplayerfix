/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.ArrayList;

public class cbk
extends gj {
    public dgd c;

    public cbk(iu iu2) {
        super(iu2);
    }

    public cbk(iu iu2, cmz cmz2, bqk bqk2) {
        super(iu2, cmz2);
        ArrayList arrayList = ov.a();
        dgd[] arrdgd = dgd.values();
        int n2 = arrdgd.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            dgd dgd2;
            this.c = dgd2 = arrdgd[i2];
            this.a(bqk2);
            if (!this.h()) continue;
            arrayList.add(dgd2);
        }
        if (!arrayList.isEmpty()) {
            this.c = (dgd)((Object)arrayList.get(this.bx.nextInt(arrayList.size())));
        }
        this.a(bqk2);
    }

    public cbk(iu iu2, cmz cmz2, bqk bqk2, String string) {
        this(iu2, cmz2, bqk2);
        for (dgd dgd2 : dgd.values()) {
            if (!dgd2.B.equals(string)) continue;
            this.c = dgd2;
            break;
        }
        this.a(bqk2);
    }

    @Override
    public void a(bvp bvp2) {
        bvp2.a("Motive", this.c.B);
        super.a(bvp2);
    }

    @Override
    public void b(bvp bvp2) {
        String string = bvp2.l("Motive");
        for (dgd dgd2 : dgd.values()) {
            if (!dgd2.B.equals(string)) continue;
            this.c = dgd2;
        }
        if (this.c == null) {
            this.c = dgd.a;
        }
        super.b(bvp2);
    }

    @Override
    public int j() {
        return this.c.C;
    }

    @Override
    public int k() {
        return this.c.D;
    }

    @Override
    public void b(cpk cpk2) {
        if (!this.aQ.F().b("doEntityDrops")) {
            return;
        }
        this.a(dah.dT, 1.0f, 1.0f);
        if (cpk2 instanceof bdl) {
            bdl bdl2 = (bdl)cpk2;
            if (bdl2.G.d) {
                return;
            }
        }
        this.a(new bhl(hp.ap), 0.0f);
    }

    @Override
    public void n() {
        this.a(dah.dU, 1.0f, 1.0f);
    }

    @Override
    public void a_(double d2, double d3, double d4, float f2, float f3) {
        this.d(d2, d3, d4);
    }

    @Override
    public void a(double d2, double d3, double d4, float f2, float f3, int n2, boolean bl2) {
        cmz cmz2 = this.a.f(d2 - this.aU, d3 - this.aV, d4 - this.aW);
        this.d(cmz2.a(), cmz2.b(), cmz2.c());
    }
}

