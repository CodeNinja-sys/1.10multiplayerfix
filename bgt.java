/*
 * Decompiled with CFR 0.150.
 */
import com.a.b.ad;
import com.a.b.ae;
import com.a.b.u;
import com.a.b.v;
import com.a.b.w;
import com.a.b.z;
import java.lang.reflect.Type;
import org.apache.commons.c.c;

public class bgt
implements ae,
v {
    public hz a(w w2, Type type, u u2) {
        z z2 = cwe.f(w2, "loot pool");
        aoe[] arraoe = (aoe[])cwe.a(z2, "entries", u2, aoe[].class);
        cfv[] arrcfv = (cfv[])cwe.a(z2, "conditions", new cfv[0], u2, cfv[].class);
        bom bom2 = (bom)cwe.a(z2, "rolls", u2, bom.class);
        bom bom3 = (bom)cwe.a(z2, "bonus_rolls", new bom(0.0f, 0.0f), u2, bom.class);
        return new hz(arraoe, arrcfv, bom2, bom3);
    }

    public w a(hz hz2, Type type, ad ad2) {
        z z2 = new z();
        z2.a("entries", ad2.a(hz.a(hz2)));
        z2.a("rolls", ad2.a(hz.b(hz2)));
        if (hz.c(hz2).a() != 0.0f && hz.c(hz2).b() != 0.0f) {
            z2.a("bonus_rolls", ad2.a(hz.c(hz2)));
        }
        if (!c.f(hz.d(hz2))) {
            z2.a("conditions", ad2.a(hz.d(hz2)));
        }
        return z2;
    }

    @Override
    public /* synthetic */ w a(Object object, Type type, ad ad2) {
        return this.a((hz)object, type, ad2);
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

