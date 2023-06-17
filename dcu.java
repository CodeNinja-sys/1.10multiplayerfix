/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import com.a.b.aa;
import com.a.b.t;
import com.a.b.u;
import com.a.b.v;
import com.a.b.w;
import com.a.b.z;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class dcu
implements v {
    public aum a(w w2, Type type, u u2) {
        z z2 = w2.t();
        Map map = this.a(u2, z2);
        clu clu2 = this.b(u2, z2);
        if (map.isEmpty() && (clu2 == null || clu2.b().isEmpty())) {
            throw new aa("Neither 'variants' nor 'multipart' found");
        }
        return new aum(map, clu2);
    }

    protected Map a(u u2, z z2) {
        HashMap hashMap = sz.c();
        if (z2.b("variants")) {
            z z3 = cwe.k(z2, "variants");
            for (Map.Entry entry : z3.b()) {
                hashMap.put(entry.getKey(), (agm)u2.a((w)entry.getValue(), (Type)((Object)agm.class)));
            }
        }
        return hashMap;
    }

    protected clu b(u u2, z z2) {
        if (!z2.b("multipart")) {
            return null;
        }
        t t2 = cwe.l(z2, "multipart");
        return (clu)u2.a(t2, (Type)((Object)clu.class));
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

