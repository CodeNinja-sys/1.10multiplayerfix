/*
 * Decompiled with CFR 0.150.
 */
import com.a.b.ad;
import com.a.b.ag;
import com.a.b.t;
import com.a.b.u;
import com.a.b.w;
import com.a.b.z;

public class cud
extends cnw {
    public cud() {
        super(new bpx("set_attributes"), ce.class);
    }

    public void a(z z2, ce ce2, ad ad2) {
        t t2 = new t();
        for (cji cji2 : ce.a(ce2)) {
            t2.a(cji2.a(ad2));
        }
        z2.a("modifiers", t2);
    }

    public ce a(z z2, u u2, cfv[] arrcfv) {
        t t2 = cwe.l(z2, "modifiers");
        cji[] arrcji = new cji[t2.b()];
        int n2 = 0;
        for (w w2 : t2) {
            arrcji[n2++] = cji.a(cwe.f(w2, "modifier"), u2);
        }
        if (arrcji.length == 0) {
            throw new ag("Invalid attribute modifiers array; cannot be empty");
        }
        return new ce(arrcfv, arrcji);
    }

    @Override
    public /* synthetic */ azp b(z z2, u u2, cfv[] arrcfv) {
        return this.a(z2, u2, arrcfv);
    }
}

