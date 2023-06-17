/*
 * Decompiled with CFR 0.150.
 */
import com.a.b.ad;
import com.a.b.ae;
import com.a.b.ag;
import com.a.b.u;
import com.a.b.v;
import com.a.b.w;
import com.a.b.z;
import java.lang.reflect.Type;

public class clz
implements ae,
v {
    public aoe a(w w2, Type type, u u2) {
        z z2 = cwe.f(w2, "loot item");
        String string = cwe.f(z2, "type");
        int n2 = cwe.a(z2, "weight", 1);
        int n3 = cwe.a(z2, "quality", 0);
        cfv[] arrcfv = z2.b("conditions") ? (cfv[])cwe.a(z2, "conditions", u2, cfv[].class) : new cfv[0];
        if ("item".equals(string)) {
            return hs.a(z2, u2, n2, n3, arrcfv);
        }
        if ("loot_table".equals(string)) {
            return db.a(z2, u2, n2, n3, arrcfv);
        }
        if ("empty".equals(string)) {
            return asx.a(z2, u2, n2, n3, arrcfv);
        }
        throw new ag("Unknown loot entry type '" + string + "'");
    }

    public w a(aoe aoe2, Type type, ad ad2) {
        z z2 = new z();
        z2.a("weight", aoe2.c);
        z2.a("quality", aoe2.d);
        if (aoe2.e.length > 0) {
            z2.a("conditions", ad2.a(aoe2.e));
        }
        if (aoe2 instanceof hs) {
            z2.a("type", "item");
        } else if (aoe2 instanceof db) {
            z2.a("type", "item");
        } else if (aoe2 instanceof asx) {
            z2.a("type", "empty");
        } else {
            throw new IllegalArgumentException("Don't know how to serialize " + aoe2);
        }
        aoe2.a(z2, ad2);
        return z2;
    }

    @Override
    public /* synthetic */ w a(Object object, Type type, ad ad2) {
        return this.a((aoe)object, type, ad2);
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

