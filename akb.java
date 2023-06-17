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

public class akb
implements ae,
v {
    public cfv a(w w2, Type type, u u2) {
        cjm cjm2;
        z z2 = cwe.f(w2, "condition");
        bpx bpx2 = new bpx(cwe.f(z2, "condition"));
        try {
            cjm2 = bsf.a(bpx2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new ag("Unknown condition '" + bpx2 + "'");
        }
        return cjm2.b(z2, u2);
    }

    public w a(cfv cfv2, Type type, ad ad2) {
        cjm cjm2 = bsf.a(cfv2);
        z z2 = new z();
        cjm2.a(z2, cfv2, ad2);
        z2.a("condition", cjm2.a().toString());
        return z2;
    }

    @Override
    public /* synthetic */ w a(Object object, Type type, ad ad2) {
        return this.a((cfv)object, type, ad2);
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

