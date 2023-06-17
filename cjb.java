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

public class cjb
implements ae,
v {
    public azp a(w w2, Type type, u u2) {
        cnw cnw2;
        z z2 = cwe.f(w2, "function");
        bpx bpx2 = new bpx(cwe.f(z2, "function"));
        try {
            cnw2 = bve.a(bpx2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new ag("Unknown function '" + bpx2 + "'");
        }
        return cnw2.b(z2, u2, (cfv[])cwe.a(z2, "conditions", new cfv[0], u2, cfv[].class));
    }

    public w a(azp azp2, Type type, ad ad2) {
        cnw cnw2 = bve.a(azp2);
        z z2 = new z();
        cnw2.a(z2, azp2, ad2);
        z2.a("function", cnw2.a().toString());
        if (azp2.a() != null && azp2.a().length > 0) {
            z2.a("conditions", ad2.a(azp2.a()));
        }
        return z2;
    }

    @Override
    public /* synthetic */ w a(Object object, Type type, ad ad2) {
        return this.a((azp)object, type, ad2);
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

