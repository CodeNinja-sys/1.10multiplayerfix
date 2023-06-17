/*
 * Decompiled with CFR 0.150.
 */
import com.a.b.aa;
import com.a.b.ac;
import com.a.b.ad;
import com.a.b.ae;
import com.a.b.k;
import com.a.b.r;
import com.a.b.t;
import com.a.b.u;
import com.a.b.v;
import com.a.b.w;
import com.a.b.z;
import java.lang.reflect.Type;
import java.util.Map;

public class zf
implements ae,
v {
    private static final k a;

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public cbg a(w w2, Type type, u u2) {
        void var5_14;
        if (w2.r()) {
            return new aym(w2.d());
        }
        if (w2.q()) {
            void var5_12;
            Object object;
            z z2 = w2.t();
            if (z2.b("text")) {
                aym aym2 = new aym(z2.c("text").d());
            } else if (z2.b("translate")) {
                object = z2.c("translate").d();
                if (z2.b("with")) {
                    t t2 = z2.e("with");
                    Object[] arrobject = new Object[t2.b()];
                    for (int i2 = 0; i2 < arrobject.length; ++i2) {
                        aym aym3;
                        arrobject[i2] = this.a(t2.a(i2), type, u2);
                        if (!(arrobject[i2] instanceof aym) || !(aym3 = (aym)arrobject[i2]).h().g() || !aym3.g().isEmpty()) continue;
                        arrobject[i2] = aym3.a();
                    }
                    du du2 = new du((String)object, arrobject);
                } else {
                    du du3 = new du((String)object, new Object[0]);
                }
            } else if (z2.b("score")) {
                object = z2.f("score");
                if (!((z)object).b("name") || !((z)object).b("objective")) throw new aa("A score component needs a least a name and an objective");
                jv jv2 = new jv(cwe.f((z)object, "name"), cwe.f((z)object, "objective"));
                if (((z)object).b("value")) {
                    jv2.a(cwe.f((z)object, "value"));
                }
            } else {
                if (!z2.b("selector")) throw new aa("Don't know how to turn " + w2 + " into a Component");
                avy avy2 = new avy(cwe.f(z2, "selector"));
            }
            if (z2.b("extra")) {
                object = z2.e("extra");
                if (((t)object).b() <= 0) throw new aa("Unexpected empty array of components");
                for (int i3 = 0; i3 < ((t)object).b(); ++i3) {
                    var5_12.a(this.a(((t)object).a(i3), type, u2));
                }
            }
            var5_12.a((bcc)u2.a(w2, (Type)((Object)bcc.class)));
            return var5_12;
        }
        if (!w2.p()) throw new aa("Don't know how to turn " + w2 + " into a Component");
        t t3 = w2.u();
        Object var5_13 = null;
        for (w w3 : t3) {
            cbg cbg2 = this.a(w3, w3.getClass(), u2);
            if (var5_14 == null) {
                cbg cbg3 = cbg2;
                continue;
            }
            var5_14.a(cbg2);
        }
        return var5_14;
    }

    private void a(bcc bcc2, z z2, ad ad2) {
        w w2 = ad2.a(bcc2);
        if (w2.q()) {
            z z3 = (z)w2;
            for (Map.Entry entry : z3.b()) {
                z2.a((String)entry.getKey(), (w)entry.getValue());
            }
        }
    }

    public w a(cbg cbg2, Type type, ad ad2) {
        Object object;
        Iterable iterable;
        z z2 = new z();
        if (!cbg2.h().g()) {
            this.a(cbg2.h(), z2, ad2);
        }
        if (!cbg2.g().isEmpty()) {
            iterable = new t();
            for (Object[] arrobject : cbg2.g()) {
                ((t)iterable).a(this.a((cbg)arrobject, arrobject.getClass(), ad2));
            }
            z2.a("extra", (w)((Object)iterable));
        }
        if (cbg2 instanceof aym) {
            z2.a("text", ((aym)cbg2).a());
        } else if (cbg2 instanceof du) {
            iterable = (du)cbg2;
            z2.a("translate", ((du)iterable).d());
            if (((du)iterable).e() != null && ((du)iterable).e().length > 0) {
                object = new t();
                for (Object object2 : ((du)iterable).e()) {
                    if (object2 instanceof cbg) {
                        ((t)object).a(this.a((cbg)object2, object2.getClass(), ad2));
                        continue;
                    }
                    ((t)object).a(new ac(String.valueOf(object2)));
                }
                z2.a("with", (w)object);
            }
        } else if (cbg2 instanceof jv) {
            iterable = (jv)cbg2;
            object = new z();
            ((z)object).a("name", ((jv)iterable).a());
            ((z)object).a("objective", ((jv)iterable).c());
            ((z)object).a("value", ((jv)iterable).b());
            z2.a("score", (w)object);
        } else if (cbg2 instanceof avy) {
            iterable = (avy)cbg2;
            z2.a("selector", ((avy)iterable).a());
        } else {
            throw new IllegalArgumentException("Don't know how to serialize " + cbg2 + " as a Component");
        }
        return z2;
    }

    public static String a(cbg cbg2) {
        return a.b(cbg2);
    }

    public static cbg a(String string) {
        return (cbg)cwe.a(a, string, cbg.class, false);
    }

    public static cbg b(String string) {
        return (cbg)cwe.a(a, string, cbg.class, true);
    }

    @Override
    public /* synthetic */ w a(Object object, Type type, ad ad2) {
        return this.a((cbg)object, type, ad2);
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }

    static {
        r r2 = new r();
        r2.a(cbg.class, (Object)new zf());
        r2.a(bcc.class, (Object)new kf());
        r2.a(new ddq());
        a = r2.i();
    }
}

