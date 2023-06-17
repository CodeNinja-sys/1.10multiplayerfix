/*
 * Decompiled with CFR 0.150.
 */
import com.a.b.ad;
import com.a.b.ae;
import com.a.b.t;
import com.a.b.u;
import com.a.b.v;
import com.a.b.w;
import com.a.b.z;
import com.c.a.e;
import java.lang.reflect.Type;
import java.util.UUID;

public class arc
implements ae,
v {
    public csb a(w w2, Type type, u u2) {
        t t2;
        z z2 = cwe.f(w2, "players");
        csb csb2 = new csb(cwe.j(z2, "max"), cwe.j(z2, "online"));
        if (cwe.c(z2, "sample") && (t2 = cwe.l(z2, "sample")).b() > 0) {
            e[] arre = new e[t2.b()];
            for (int i2 = 0; i2 < arre.length; ++i2) {
                z z3 = cwe.f(t2.a(i2), "player[" + i2 + "]");
                String string = cwe.f(z3, "id");
                arre[i2] = new e(UUID.fromString(string), cwe.f(z3, "name"));
            }
            csb2.a(arre);
        }
        return csb2;
    }

    public w a(csb csb2, Type type, ad ad2) {
        z z2 = new z();
        z2.a("max", csb2.a());
        z2.a("online", csb2.b());
        if (csb2.c() != null && csb2.c().length > 0) {
            t t2 = new t();
            for (int i2 = 0; i2 < csb2.c().length; ++i2) {
                z z3 = new z();
                UUID uUID = csb2.c()[i2].a();
                z3.a("id", uUID == null ? "" : uUID.toString());
                z3.a("name", csb2.c()[i2].b());
                t2.a(z3);
            }
            z2.a("sample", t2);
        }
        return z2;
    }

    @Override
    public /* synthetic */ w a(Object object, Type type, ad ad2) {
        return this.a((csb)object, type, ad2);
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

