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

public class aam
implements ae,
v {
    public xr a(w w2, Type type, u u2) {
        z z2 = cwe.f(w2, "status");
        xr xr2 = new xr();
        if (z2.b("description")) {
            xr2.a((cbg)u2.a(z2.c("description"), (Type)((Object)cbg.class)));
        }
        if (z2.b("players")) {
            xr2.a((csb)u2.a(z2.c("players"), (Type)((Object)csb.class)));
        }
        if (z2.b("version")) {
            xr2.a((atj)u2.a(z2.c("version"), (Type)((Object)atj.class)));
        }
        if (z2.b("favicon")) {
            xr2.a(cwe.f(z2, "favicon"));
        }
        return xr2;
    }

    public w a(xr xr2, Type type, ad ad2) {
        z z2 = new z();
        if (xr2.a() != null) {
            z2.a("description", ad2.a(xr2.a()));
        }
        if (xr2.b() != null) {
            z2.a("players", ad2.a(xr2.b()));
        }
        if (xr2.c() != null) {
            z2.a("version", ad2.a(xr2.c()));
        }
        if (xr2.d() != null) {
            z2.a("favicon", xr2.d());
        }
        return z2;
    }

    @Override
    public /* synthetic */ w a(Object object, Type type, ad ad2) {
        return this.a((xr)object, type, ad2);
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

