/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import com.a.a.d.sz;
import com.a.b.t;
import com.a.b.u;
import com.a.b.v;
import com.a.b.w;
import com.a.b.z;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class cnk
implements v {
    public bfg a(w w2, Type type, u u2) {
        Object object;
        z z2 = w2.t();
        List list = this.b(u2, z2);
        String string = this.c(z2);
        Map map = this.b(z2);
        boolean bl2 = this.a(z2);
        dfk dfk2 = dfk.a;
        if (z2.b("display")) {
            object = cwe.k(z2, "display");
            dfk2 = (dfk)u2.a((w)object, (Type)((Object)dfk.class));
        }
        object = this.a(u2, z2);
        bpx bpx2 = string.isEmpty() ? null : new bpx(string);
        return new bfg(bpx2, list, map, bl2, true, dfk2, (List)object);
    }

    protected List a(u u2, z z2) {
        ArrayList arrayList = ov.a();
        if (z2.b("overrides")) {
            t t2 = cwe.l(z2, "overrides");
            for (w w2 : t2) {
                arrayList.add((mh)u2.a(w2, (Type)((Object)mh.class)));
            }
        }
        return arrayList;
    }

    private Map b(z z2) {
        HashMap hashMap = sz.c();
        if (z2.b("textures")) {
            z z3 = z2.f("textures");
            for (Map.Entry entry : z3.b()) {
                hashMap.put(entry.getKey(), ((w)entry.getValue()).d());
            }
        }
        return hashMap;
    }

    private String c(z z2) {
        return cwe.a(z2, "parent", "");
    }

    protected boolean a(z z2) {
        return cwe.a(z2, "ambientocclusion", true);
    }

    protected List b(u u2, z z2) {
        ArrayList arrayList = ov.a();
        if (z2.b("elements")) {
            for (w w2 : cwe.l(z2, "elements")) {
                arrayList.add((vo)u2.a(w2, (Type)((Object)vo.class)));
            }
        }
        return arrayList;
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

