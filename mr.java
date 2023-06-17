/*
 * Decompiled with CFR 0.150.
 */
import com.a.b.ad;
import com.a.b.u;
import com.a.b.z;

public class mr
extends cnw {
    protected mr() {
        super(new bpx("looting_enchant"), bvj.class);
    }

    public void a(z z2, bvj bvj2, ad ad2) {
        z2.a("count", ad2.a(bvj.a(bvj2)));
        if (bvj.b(bvj2) > 0) {
            z2.a("limit", ad2.a(bvj.b(bvj2)));
        }
    }

    public bvj a(z z2, u u2, cfv[] arrcfv) {
        int n2 = cwe.a(z2, "limit", 0);
        return new bvj(arrcfv, (bom)cwe.a(z2, "count", u2, bom.class), n2);
    }

    @Override
    public /* synthetic */ azp b(z z2, u u2, cfv[] arrcfv) {
        return this.a(z2, u2, arrcfv);
    }
}

