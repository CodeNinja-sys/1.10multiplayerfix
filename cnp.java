/*
 * Decompiled with CFR 0.150.
 */
import com.a.b.ad;
import com.a.b.u;
import com.a.b.w;
import com.a.b.z;
import java.util.Map;
import java.util.Set;

public class cnp
extends cjm {
    protected cnp() {
        super(new bpx("entity_properties"), cmf.class);
    }

    public void a(z z2, cmf cmf2, ad ad2) {
        z z3 = new z();
        for (he he2 : cmf.a(cmf2)) {
            buz buz2 = oa.a(he2);
            z3.a(buz2.a().toString(), buz2.a(he2, ad2));
        }
        z2.a("properties", z3);
        z2.a("entity", ad2.a((Object)cmf.b(cmf2)));
    }

    public cmf a(z z2, u u2) {
        Set set = cwe.k(z2, "properties").b();
        he[] arrhe = new he[set.size()];
        int n2 = 0;
        for (Map.Entry entry : set) {
            arrhe[n2++] = oa.a(new bpx((String)entry.getKey())).a((w)entry.getValue(), u2);
        }
        return new cmf(arrhe, (bak)((Object)cwe.a(z2, "entity", u2, bak.class)));
    }

    @Override
    public /* synthetic */ cfv b(z z2, u u2) {
        return this.a(z2, u2);
    }
}

