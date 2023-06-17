/*
 * Decompiled with CFR 0.150.
 */
import com.a.b.ad;
import com.a.b.u;
import com.a.b.z;

public class blv
extends cnw {
    public blv() {
        super(new bpx("enchant_with_levels"), bns.class);
    }

    public void a(z z2, bns bns2, ad ad2) {
        z2.a("levels", ad2.a(bns.a(bns2)));
        z2.a("treasure", bns.b(bns2));
    }

    public bns a(z z2, u u2, cfv[] arrcfv) {
        bom bom2 = (bom)cwe.a(z2, "levels", u2, bom.class);
        boolean bl2 = cwe.a(z2, "treasure", false);
        return new bns(arrcfv, bom2, bl2);
    }

    @Override
    public /* synthetic */ azp b(z z2, u u2, cfv[] arrcfv) {
        return this.a(z2, u2, arrcfv);
    }
}

