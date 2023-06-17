/*
 * Decompiled with CFR 0.150.
 */
import com.a.b.ad;
import com.a.b.u;
import com.a.b.z;

public class bod
extends cnw {
    protected bod() {
        super(new bpx("set_data"), bor.class);
    }

    public void a(z z2, bor bor2, ad ad2) {
        z2.a("data", ad2.a(bor.a(bor2)));
    }

    public bor a(z z2, u u2, cfv[] arrcfv) {
        return new bor(arrcfv, (bom)cwe.a(z2, "data", u2, bom.class));
    }

    @Override
    public /* synthetic */ azp b(z z2, u u2, cfv[] arrcfv) {
        return this.a(z2, u2, arrcfv);
    }
}

