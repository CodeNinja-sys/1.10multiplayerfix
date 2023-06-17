/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import com.a.b.ad;
import com.a.b.u;
import com.a.b.w;
import com.a.b.z;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class agy
extends cjm {
    protected agy() {
        super(new bpx("entity_scores"), bn.class);
    }

    public void a(z z2, bn bn2, ad ad2) {
        z z3 = new z();
        for (Map.Entry entry : bn.a(bn2).entrySet()) {
            z3.a((String)entry.getKey(), ad2.a(entry.getValue()));
        }
        z2.a("scores", z3);
        z2.a("entity", ad2.a((Object)bn.b(bn2)));
    }

    public bn a(z z2, u u2) {
        Set set = cwe.k(z2, "scores").b();
        LinkedHashMap linkedHashMap = sz.d();
        for (Map.Entry entry : set) {
            linkedHashMap.put(entry.getKey(), cwe.a((w)entry.getValue(), "score", u2, bom.class));
        }
        return new bn(linkedHashMap, (bak)((Object)cwe.a(z2, "entity", u2, bak.class)));
    }

    @Override
    public /* synthetic */ cfv b(z z2, u u2) {
        return this.a(z2, u2);
    }
}

