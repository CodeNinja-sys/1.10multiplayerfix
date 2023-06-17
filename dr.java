/*
 * Decompiled with CFR 0.150.
 */
import com.a.b.ad;
import com.a.b.u;
import com.a.b.z;

public class dr
extends cnw {
    protected dr() {
        super(new bpx("set_damage"), be.class);
    }

    public void a(z z2, be be2, ad ad2) {
        z2.a("damage", ad2.a(be.a(be2)));
    }

    public be a(z z2, u u2, cfv[] arrcfv) {
        return new be(arrcfv, (bom)cwe.a(z2, "damage", u2, bom.class));
    }

    @Override
    public /* synthetic */ azp b(z z2, u u2, cfv[] arrcfv) {
        return this.a(z2, u2, arrcfv);
    }
}

