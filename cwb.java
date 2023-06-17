/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import com.a.b.u;
import com.a.b.v;
import com.a.b.w;
import com.a.b.z;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;

class cwb
implements v {
    cwb() {
    }

    public mh a(w w2, Type type, u u2) {
        z z2 = w2.t();
        bpx bpx2 = new bpx(cwe.f(z2, "model"));
        Map map = this.a(z2);
        return new mh(bpx2, map);
    }

    protected Map a(z z2) {
        LinkedHashMap linkedHashMap = sz.d();
        z z3 = cwe.k(z2, "predicate");
        for (Map.Entry entry : z3.b()) {
            linkedHashMap.put(new bpx((String)entry.getKey()), Float.valueOf(cwe.d((w)entry.getValue(), (String)entry.getKey())));
        }
        return linkedHashMap;
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

