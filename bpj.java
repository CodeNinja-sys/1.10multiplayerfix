/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import com.a.b.aa;
import com.a.b.ac;
import com.a.b.ad;
import com.a.b.ae;
import com.a.b.t;
import com.a.b.u;
import com.a.b.w;
import com.a.b.z;
import java.lang.reflect.Type;
import java.util.ArrayList;
import org.apache.commons.c.ao;

public class bpj
extends cwc
implements ae {
    public gf a(w w2, Type type, u u2) {
        int n2;
        ArrayList arrayList = ov.a();
        z z2 = cwe.f(w2, "metadata section");
        int n3 = cwe.a(z2, "frametime", 1);
        if (n3 != 1) {
            ao.a(1L, Integer.MAX_VALUE, n3, "Invalid default frame time");
        }
        if (z2.b("frames")) {
            try {
                t t2 = cwe.l(z2, "frames");
                for (n2 = 0; n2 < t2.b(); ++n2) {
                    w w3 = t2.a(n2);
                    cfo cfo2 = this.a(n2, w3);
                    if (cfo2 == null) continue;
                    arrayList.add(cfo2);
                }
            }
            catch (ClassCastException classCastException) {
                throw new aa("Invalid animation->frames: expected array, was " + z2.c("frames"), classCastException);
            }
        }
        int n4 = cwe.a(z2, "width", -1);
        n2 = cwe.a(z2, "height", -1);
        if (n4 != -1) {
            ao.a(1L, Integer.MAX_VALUE, n4, "Invalid width");
        }
        if (n2 != -1) {
            ao.a(1L, Integer.MAX_VALUE, n2, "Invalid height");
        }
        boolean bl2 = cwe.a(z2, "interpolate", false);
        return new gf(arrayList, n4, n2, n3, bl2);
    }

    private cfo a(int n2, w w2) {
        if (w2.r()) {
            return new cfo(cwe.e(w2, "frames[" + n2 + "]"));
        }
        if (w2.q()) {
            z z2 = cwe.f(w2, "frames[" + n2 + "]");
            int n3 = cwe.a(z2, "time", -1);
            if (z2.b("time")) {
                ao.a(1L, Integer.MAX_VALUE, n3, "Invalid frame time");
            }
            int n4 = cwe.j(z2, "index");
            ao.a(0L, Integer.MAX_VALUE, n4, "Invalid frame index");
            return new cfo(n4, n3);
        }
        return null;
    }

    public w a(gf gf2, Type type, ad ad2) {
        z z2 = new z();
        z2.a("frametime", gf2.d());
        if (gf2.b() != -1) {
            z2.a("width", gf2.b());
        }
        if (gf2.a() != -1) {
            z2.a("height", gf2.a());
        }
        if (gf2.c() > 0) {
            t t2 = new t();
            for (int i2 = 0; i2 < gf2.c(); ++i2) {
                if (gf2.b(i2)) {
                    z z3 = new z();
                    z3.a("index", gf2.c(i2));
                    z3.a("time", gf2.a(i2));
                    t2.a(z3);
                    continue;
                }
                t2.a(new ac(gf2.c(i2)));
            }
            z2.a("frames", t2);
        }
        return z2;
    }

    @Override
    public String a() {
        return "animation";
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }

    @Override
    public /* synthetic */ w a(Object object, Type type, ad ad2) {
        return this.a((gf)object, type, ad2);
    }
}

