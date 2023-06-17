/*
 * Decompiled with CFR 0.150.
 */
import com.a.b.ac;
import com.a.b.ad;
import com.a.b.ae;
import com.a.b.u;
import com.a.b.v;
import com.a.b.w;
import com.a.b.z;
import java.lang.reflect.Type;

public class da
implements ae,
v {
    public bom a(w w2, Type type, u u2) {
        if (cwe.b(w2)) {
            return new bom(cwe.d(w2, "value"));
        }
        z z2 = cwe.f(w2, "value");
        float f2 = cwe.i(z2, "min");
        float f3 = cwe.i(z2, "max");
        return new bom(f2, f3);
    }

    public w a(bom bom2, Type type, ad ad2) {
        if (bom.a(bom2) == bom.b(bom2)) {
            return new ac(Float.valueOf(bom.a(bom2)));
        }
        z z2 = new z();
        z2.a("min", Float.valueOf(bom.a(bom2)));
        z2.a("max", Float.valueOf(bom.b(bom2)));
        return z2;
    }

    @Override
    public /* synthetic */ w a(Object object, Type type, ad ad2) {
        return this.a((bom)object, type, ad2);
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

