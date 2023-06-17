/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.aad;
import java.util.Set;

public class cpn {
    private final rh a = new rh();
    private final Set b = aad.a();
    private final aqn[] c = new aqn[32];
    private final um d;

    public cpn(um um2) {
        this.d = um2;
    }

    public dbn a(bnj bnj2, xy xy2, cpk cpk2, float f2) {
        return this.a(bnj2, xy2, cpk2.aU, cpk2.cD().b, cpk2.aW, f2);
    }

    public dbn a(bnj bnj2, xy xy2, cmz cmz2, float f2) {
        return this.a(bnj2, xy2, (float)cmz2.a() + 0.5f, (float)cmz2.b() + 0.5f, (float)cmz2.c() + 0.5f, f2);
    }

    private dbn a(bnj bnj2, xy xy2, double d2, double d3, double d4, float f2) {
        this.a.a();
        this.d.a(bnj2, xy2);
        aqn aqn2 = this.d.a();
        aqn aqn3 = this.d.a(d2, d3, d4);
        dbn dbn2 = this.a(aqn2, aqn3, f2);
        this.d.b();
        return dbn2;
    }

    private dbn a(aqn aqn2, aqn aqn3, float f2) {
        Object object;
        aqn2.e = 0.0f;
        aqn2.g = aqn2.f = aqn2.c(aqn3);
        this.a.a();
        this.b.clear();
        this.a.a(aqn2);
        Object object2 = aqn2;
        int n2 = 0;
        while (!this.a.c() && ++n2 < 200) {
            object = this.a.b();
            if (((aqn)object).equals(aqn3)) {
                object2 = aqn3;
                break;
            }
            if (((aqn)object).c(aqn3) < ((aqn)object2).c(aqn3)) {
                object2 = object;
            }
            ((aqn)object).i = true;
            int n3 = this.d.a(this.c, (aqn)object, aqn3, f2);
            for (int i2 = 0; i2 < n3; ++i2) {
                aqn aqn4 = this.c[i2];
                float f3 = ((aqn)object).c(aqn4);
                aqn4.j = ((aqn)object).j + f3;
                aqn4.k = f3 + aqn4.l;
                float f4 = ((aqn)object).e + aqn4.k;
                if (!(aqn4.j < f2) || aqn4.a() && !(f4 < aqn4.e)) continue;
                aqn4.h = object;
                aqn4.e = f4;
                aqn4.f = aqn4.c(aqn3) + aqn4.l;
                if (aqn4.a()) {
                    this.a.a(aqn4, aqn4.e + aqn4.f);
                    continue;
                }
                aqn4.g = aqn4.e + aqn4.f;
                this.a.a(aqn4);
            }
        }
        if (object2 == aqn2) {
            return null;
        }
        object = this.a(aqn2, (aqn)object2);
        return object;
    }

    private dbn a(aqn aqn2, aqn aqn3) {
        int n2 = 1;
        aqn aqn4 = aqn3;
        while (aqn4.h != null) {
            ++n2;
            aqn4 = aqn4.h;
        }
        aqn[] arraqn = new aqn[n2];
        aqn4 = aqn3;
        arraqn[--n2] = aqn4;
        while (aqn4.h != null) {
            aqn4 = aqn4.h;
            arraqn[--n2] = aqn4;
        }
        return new dbn(arraqn);
    }
}

