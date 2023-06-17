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

public class bwe
implements ae,
v {
    public atj a(w w2, Type type, u u2) {
        z z2 = cwe.f(w2, "version");
        return new atj(cwe.f(z2, "name"), cwe.j(z2, "protocol"));
    }

    public w a(atj atj2, Type type, ad ad2) {
        z z2 = new z();
        z2.a("name", atj2.a());
        z2.a("protocol", atj2.b());
        return z2;
    }

    @Override
    public /* synthetic */ w a(Object object, Type type, ad ad2) {
        return this.a((atj)object, type, ad2);
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

