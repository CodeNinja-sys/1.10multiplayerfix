/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.d;

import com.a.b.aa;
import com.a.b.ac;
import com.a.b.ad;
import com.a.b.ae;
import com.a.b.r;
import com.a.b.t;
import com.a.b.u;
import com.a.b.v;
import com.a.b.w;
import com.a.b.z;
import java.lang.reflect.Type;
import java.util.Map;
import net.minecraft.u.ak;
import net.minecraft.u.bc;
import net.minecraft.u.d.a;
import net.minecraft.u.d.c;
import net.minecraft.u.d.e;
import net.minecraft.u.d.f;
import net.minecraft.u.d.i;
import net.minecraft.u.d.j;
import net.minecraft.u.d.k;
import net.minecraft.u.d.l;

public class b
implements ae,
v {
    private static final com.a.b.k a;

    static {
        r r2 = new r();
        r2.a(a.class, (Object)new b());
        r2.a(c.class, (Object)new e());
        r2.a(new ak());
        a = r2.i();
    }

    public a a(w w2, Type type, u u2) {
        Object object;
        f f2;
        if (w2.r()) {
            return new k(w2.d());
        }
        if (!w2.q()) {
            if (w2.p()) {
                t t2 = w2.u();
                a a2 = null;
                for (w w3 : t2) {
                    a a3 = this.a(w3, w3.getClass(), u2);
                    if (a2 == null) {
                        a2 = a3;
                        continue;
                    }
                    a2.a(a3);
                }
                return a2;
            }
            throw new aa("Don't know how to turn " + w2 + " into a Component");
        }
        z z2 = w2.t();
        if (z2.b("text")) {
            f2 = new k(z2.c("text").d());
        } else if (z2.b("translate")) {
            object = z2.c("translate").d();
            if (z2.b("with")) {
                t t3 = z2.e("with");
                Object[] arrobject = new Object[t3.b()];
                for (int i2 = 0; i2 < arrobject.length; ++i2) {
                    k k2;
                    arrobject[i2] = this.a(t3.a(i2), type, u2);
                    if (!(arrobject[i2] instanceof k) || !(k2 = (k)arrobject[i2]).a().g() || !k2.e().isEmpty()) continue;
                    arrobject[i2] = k2.g();
                }
                f2 = new l((String)object, arrobject);
            } else {
                f2 = new l((String)object, new Object[0]);
            }
        } else if (z2.b("score")) {
            object = z2.f("score");
            if (!((z)object).b("name") || !((z)object).b("objective")) {
                throw new aa("A score component needs a least a name and an objective");
            }
            f2 = new i(bc.f((z)object, "name"), bc.f((z)object, "objective"));
            if (((z)object).b("value")) {
                ((i)f2).b(bc.f((z)object, "value"));
            }
        } else {
            if (!z2.b("selector")) {
                throw new aa("Don't know how to turn " + w2 + " into a Component");
            }
            f2 = new j(bc.f(z2, "selector"));
        }
        if (z2.b("extra")) {
            object = z2.e("extra");
            if (((t)object).b() <= 0) {
                throw new aa("Unexpected empty array of components");
            }
            for (int i3 = 0; i3 < ((t)object).b(); ++i3) {
                f2.a(this.a(((t)object).a(i3), type, u2));
            }
        }
        f2.a((c)u2.a(w2, (Type)((Object)c.class)));
        return f2;
    }

    private void a(c c2, z z2, ad ad2) {
        w w2 = ad2.a(c2);
        if (w2.q()) {
            z z3 = (z)w2;
            for (Map.Entry entry : z3.b()) {
                z2.a((String)entry.getKey(), (w)entry.getValue());
            }
        }
    }

    public w a(a a2, Type type, ad ad2) {
        Object object;
        Iterable iterable;
        z z2 = new z();
        if (!a2.a().g()) {
            this.a(a2.a(), z2, ad2);
        }
        if (!a2.e().isEmpty()) {
            iterable = new t();
            Object object2 = a2.e().iterator();
            while (object2.hasNext()) {
                object = (a)object2.next();
                ((t)iterable).a(this.a((a)object, object.getClass(), ad2));
            }
            z2.a("extra", (w)((Object)iterable));
        }
        if (a2 instanceof k) {
            z2.a("text", ((k)a2).g());
        } else if (a2 instanceof l) {
            iterable = (l)a2;
            z2.a("translate", ((l)iterable).i());
            if (((l)iterable).j() != null && ((l)iterable).j().length > 0) {
                object = new t();
                for (Object object2 : ((l)iterable).j()) {
                    if (object2 instanceof a) {
                        ((t)object).a(this.a((a)object2, object2.getClass(), ad2));
                        continue;
                    }
                    ((t)object).a(new ac(String.valueOf(object2)));
                }
                z2.a("with", (w)object);
            }
        } else if (a2 instanceof i) {
            iterable = (i)a2;
            object = new z();
            ((z)object).a("name", ((i)iterable).g());
            ((z)object).a("objective", ((i)iterable).h());
            ((z)object).a("value", ((i)iterable).b());
            z2.a("score", (w)object);
        } else {
            if (!(a2 instanceof j)) {
                throw new IllegalArgumentException("Don't know how to serialize " + a2 + " as a Component");
            }
            iterable = (j)a2;
            z2.a("selector", ((j)iterable).g());
        }
        return z2;
    }

    public static String a(a a2) {
        return a.b(a2);
    }

    public static a a(String string) {
        return (a)bc.a(a, string, a.class, false);
    }

    public static a b(String string) {
        return (a)bc.a(a, string, a.class, true);
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

