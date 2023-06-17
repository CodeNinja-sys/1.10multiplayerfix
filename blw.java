/*
 * Decompiled with CFR 0.150.
 */
import com.a.b.ad;
import com.a.b.u;
import com.a.b.z;

public class blw
extends cnw {
    protected blw() {
        super(new bpx("set_count"), xm.class);
    }

    public void a(z z2, xm xm2, ad ad2) {
        z2.a("count", ad2.a(xm.a(xm2)));
    }

    public xm a(z z2, u u2, cfv[] arrcfv) {
        return new xm(arrcfv, (bom)cwe.a(z2, "count", u2, bom.class));
    }

    @Override
    public /* synthetic */ azp b(z z2, u u2, cfv[] arrcfv) {
        return this.a(z2, u2, arrcfv);
    }
}

