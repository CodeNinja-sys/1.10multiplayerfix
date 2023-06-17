/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.c;

import org.apache.logging.log4j.a.m;
import org.apache.logging.log4j.a.n;
import org.apache.logging.log4j.a.t;
import org.apache.logging.log4j.a.v;
import org.apache.logging.log4j.b;
import org.apache.logging.log4j.d;
import org.apache.logging.log4j.f;
import org.apache.logging.log4j.g;

public abstract class a
implements d {
    public static final f b = org.apache.logging.log4j.g.a("FLOW");
    public static final f c = org.apache.logging.log4j.g.a("ENTRY", b);
    public static final f d = org.apache.logging.log4j.g.a("EXIT", b);
    public static final f e = org.apache.logging.log4j.g.a("EXCEPTION");
    public static final f f = org.apache.logging.log4j.g.a("THROWING", e);
    public static final f g = org.apache.logging.log4j.g.a("CATCHING", e);
    public static final Class h = t.class;
    private static final String a = a.class.getName();
    private static final String i = "throwing";
    private static final String j = "catching";
    private final String k;
    private final n l;

    public a() {
        this.k = this.getClass().getName();
        this.l = this.k();
    }

    public a(String string) {
        this.k = string;
        this.l = this.k();
    }

    public a(String string, n n2) {
        this.k = string;
        this.l = n2 == null ? this.k() : n2;
    }

    public static void a(d d2, n n2) {
        String string = d2.d();
        n n3 = d2.c();
        if (n2 != null && !n3.equals(n2)) {
            org.apache.logging.log4j.d.d.k().f("The Logger {} was created with the message factory {} and is now requested with the message factory {}, which may create log events with unexpected formatting.", string, n3, n2);
        } else if (n2 == null && !n3.getClass().equals(h)) {
            org.apache.logging.log4j.d.d.k().f("The Logger {} was created with the message factory {} and is now requested with a null message factory (defaults to {}), which may create log events with unexpected formatting.", string, n3, h.getName());
        }
    }

    @Override
    public void a(b b2, Throwable throwable) {
        this.a(a, b2, throwable);
    }

    @Override
    public void a(Throwable throwable) {
        this.a(a, org.apache.logging.log4j.b.c, throwable);
    }

    protected void a(String string, b b2, Throwable throwable) {
        if (this.b(b2, g, (Object)null, null)) {
            this.a(g, string, b2, this.l.a(j), throwable);
        }
    }

    private n k() {
        try {
            return (n)h.newInstance();
        }
        catch (InstantiationException instantiationException) {
            throw new IllegalStateException(instantiationException);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new IllegalStateException(illegalAccessException);
        }
    }

    @Override
    public void a(f f2, m m2) {
        if (this.b(org.apache.logging.log4j.b.f, f2, m2, null)) {
            this.a(f2, a, org.apache.logging.log4j.b.f, m2, null);
        }
    }

    @Override
    public void a(f f2, m m2, Throwable throwable) {
        if (this.b(org.apache.logging.log4j.b.f, f2, m2, throwable)) {
            this.a(f2, a, org.apache.logging.log4j.b.f, m2, throwable);
        }
    }

    @Override
    public void a(f f2, Object object) {
        if (this.b(org.apache.logging.log4j.b.f, f2, object, null)) {
            this.a(f2, a, org.apache.logging.log4j.b.f, this.l.a(object), null);
        }
    }

    @Override
    public void a(f f2, Object object, Throwable throwable) {
        if (this.b(org.apache.logging.log4j.b.f, f2, object, throwable)) {
            this.a(f2, a, org.apache.logging.log4j.b.f, this.l.a(object), throwable);
        }
    }

    @Override
    public void a(f f2, String string) {
        if (this.b(org.apache.logging.log4j.b.f, f2, string)) {
            this.a(f2, a, org.apache.logging.log4j.b.f, this.l.a(string), null);
        }
    }

    @Override
    public void a(f f2, String string, Object ... arrobject) {
        if (this.c(org.apache.logging.log4j.b.f, f2, string, arrobject)) {
            m m2 = this.l.a(string, arrobject);
            this.a(f2, a, org.apache.logging.log4j.b.f, m2, m2.d());
        }
    }

    @Override
    public void a(f f2, String string, Throwable throwable) {
        if (this.b(org.apache.logging.log4j.b.f, f2, string, throwable)) {
            this.a(f2, a, org.apache.logging.log4j.b.f, this.l.a(string), throwable);
        }
    }

    @Override
    public void a(m m2) {
        if (this.b(org.apache.logging.log4j.b.f, null, m2, null)) {
            this.a(null, a, org.apache.logging.log4j.b.f, m2, null);
        }
    }

    @Override
    public void a(m m2, Throwable throwable) {
        if (this.b(org.apache.logging.log4j.b.f, null, m2, throwable)) {
            this.a(null, a, org.apache.logging.log4j.b.f, m2, throwable);
        }
    }

    @Override
    public void a(Object object) {
        if (this.b(org.apache.logging.log4j.b.f, null, object, null)) {
            this.a(null, a, org.apache.logging.log4j.b.f, this.l.a(object), null);
        }
    }

    @Override
    public void a(Object object, Throwable throwable) {
        if (this.b(org.apache.logging.log4j.b.f, null, object, throwable)) {
            this.a(null, a, org.apache.logging.log4j.b.f, this.l.a(object), throwable);
        }
    }

    @Override
    public void a(String string) {
        if (this.b(org.apache.logging.log4j.b.f, null, string)) {
            this.a(null, a, org.apache.logging.log4j.b.f, this.l.a(string), null);
        }
    }

    @Override
    public void a(String string, Object ... arrobject) {
        if (this.c(org.apache.logging.log4j.b.f, null, string, arrobject)) {
            m m2 = this.l.a(string, arrobject);
            this.a(null, a, org.apache.logging.log4j.b.f, m2, m2.d());
        }
    }

    @Override
    public void a(String string, Throwable throwable) {
        if (this.b(org.apache.logging.log4j.b.f, (f)null, string, throwable)) {
            this.a(null, a, org.apache.logging.log4j.b.f, this.l.a(string), throwable);
        }
    }

    @Override
    public void a() {
        this.g(a, new Object[0]);
    }

    @Override
    public void a(Object ... arrobject) {
        this.g(a, arrobject);
    }

    protected void g(String string, Object ... arrobject) {
        if (this.b(org.apache.logging.log4j.b.g, c, (Object)null, null)) {
            this.a(c, string, org.apache.logging.log4j.b.g, this.a(arrobject.length, arrobject), null);
        }
    }

    private m a(int n2, Object ... arrobject) {
        if (n2 == 0) {
            return this.l.a("entry");
        }
        StringBuilder stringBuilder = new StringBuilder("entry params(");
        int n3 = 0;
        for (Object object : arrobject) {
            if (object != null) {
                stringBuilder.append(object.toString());
            } else {
                stringBuilder.append("null");
            }
            if (++n3 >= arrobject.length) continue;
            stringBuilder.append(", ");
        }
        stringBuilder.append(")");
        return this.l.a(stringBuilder.toString());
    }

    @Override
    public void b(f f2, m m2) {
        if (this.b(org.apache.logging.log4j.b.c, f2, m2, null)) {
            this.a(f2, a, org.apache.logging.log4j.b.c, m2, null);
        }
    }

    @Override
    public void b(f f2, m m2, Throwable throwable) {
        if (this.b(org.apache.logging.log4j.b.c, f2, m2, throwable)) {
            this.a(f2, a, org.apache.logging.log4j.b.c, m2, throwable);
        }
    }

    @Override
    public void b(f f2, Object object) {
        if (this.b(org.apache.logging.log4j.b.c, f2, object, null)) {
            this.a(f2, a, org.apache.logging.log4j.b.c, this.l.a(object), null);
        }
    }

    @Override
    public void b(f f2, Object object, Throwable throwable) {
        if (this.b(org.apache.logging.log4j.b.c, f2, object, throwable)) {
            this.a(f2, a, org.apache.logging.log4j.b.c, this.l.a(object), throwable);
        }
    }

    @Override
    public void b(f f2, String string) {
        if (this.b(org.apache.logging.log4j.b.c, f2, string)) {
            this.a(f2, a, org.apache.logging.log4j.b.c, this.l.a(string), null);
        }
    }

    @Override
    public void b(f f2, String string, Object ... arrobject) {
        if (this.c(org.apache.logging.log4j.b.c, f2, string, arrobject)) {
            m m2 = this.l.a(string, arrobject);
            this.a(f2, a, org.apache.logging.log4j.b.c, m2, m2.d());
        }
    }

    @Override
    public void b(f f2, String string, Throwable throwable) {
        if (this.b(org.apache.logging.log4j.b.c, f2, string, throwable)) {
            this.a(f2, a, org.apache.logging.log4j.b.c, this.l.a(string), throwable);
        }
    }

    @Override
    public void b(m m2) {
        if (this.b(org.apache.logging.log4j.b.c, null, m2, null)) {
            this.a(null, a, org.apache.logging.log4j.b.c, m2, null);
        }
    }

    @Override
    public void b(m m2, Throwable throwable) {
        if (this.b(org.apache.logging.log4j.b.c, null, m2, throwable)) {
            this.a(null, a, org.apache.logging.log4j.b.c, m2, throwable);
        }
    }

    @Override
    public void b(Object object) {
        if (this.b(org.apache.logging.log4j.b.c, null, object, null)) {
            this.a(null, a, org.apache.logging.log4j.b.c, this.l.a(object), null);
        }
    }

    @Override
    public void b(Object object, Throwable throwable) {
        if (this.b(org.apache.logging.log4j.b.c, null, object, throwable)) {
            this.a(null, a, org.apache.logging.log4j.b.c, this.l.a(object), throwable);
        }
    }

    @Override
    public void b(String string) {
        if (this.b(org.apache.logging.log4j.b.c, null, string)) {
            this.a(null, a, org.apache.logging.log4j.b.c, this.l.a(string), null);
        }
    }

    @Override
    public void b(String string, Object ... arrobject) {
        if (this.c(org.apache.logging.log4j.b.c, null, string, arrobject)) {
            m m2 = this.l.a(string, arrobject);
            this.a(null, a, org.apache.logging.log4j.b.c, m2, m2.d());
        }
    }

    @Override
    public void b(String string, Throwable throwable) {
        if (this.b(org.apache.logging.log4j.b.c, (f)null, string, throwable)) {
            this.a(null, a, org.apache.logging.log4j.b.c, this.l.a(string), throwable);
        }
    }

    @Override
    public void b() {
        this.a(a, (Object)null);
    }

    @Override
    public Object c(Object object) {
        return this.a(a, object);
    }

    protected Object a(String string, Object object) {
        if (this.b(org.apache.logging.log4j.b.g, d, (Object)null, null)) {
            this.a(d, string, org.apache.logging.log4j.b.g, this.h(object), null);
        }
        return object;
    }

    @Override
    public void c(f f2, m m2) {
        if (this.b(org.apache.logging.log4j.b.b, f2, m2, null)) {
            this.a(f2, a, org.apache.logging.log4j.b.b, m2, null);
        }
    }

    @Override
    public void c(f f2, m m2, Throwable throwable) {
        if (this.b(org.apache.logging.log4j.b.b, f2, m2, throwable)) {
            this.a(f2, a, org.apache.logging.log4j.b.b, m2, throwable);
        }
    }

    @Override
    public void c(f f2, Object object) {
        if (this.b(org.apache.logging.log4j.b.b, f2, object, null)) {
            this.a(f2, a, org.apache.logging.log4j.b.b, this.l.a(object), null);
        }
    }

    @Override
    public void c(f f2, Object object, Throwable throwable) {
        if (this.b(org.apache.logging.log4j.b.b, f2, object, throwable)) {
            this.a(f2, a, org.apache.logging.log4j.b.b, this.l.a(object), throwable);
        }
    }

    @Override
    public void c(f f2, String string) {
        if (this.b(org.apache.logging.log4j.b.b, f2, string)) {
            this.a(f2, a, org.apache.logging.log4j.b.b, this.l.a(string), null);
        }
    }

    @Override
    public void c(f f2, String string, Object ... arrobject) {
        if (this.c(org.apache.logging.log4j.b.b, f2, string, arrobject)) {
            m m2 = this.l.a(string, arrobject);
            this.a(f2, a, org.apache.logging.log4j.b.b, m2, m2.d());
        }
    }

    @Override
    public void c(f f2, String string, Throwable throwable) {
        if (this.b(org.apache.logging.log4j.b.b, f2, string, throwable)) {
            this.a(f2, a, org.apache.logging.log4j.b.b, this.l.a(string), throwable);
        }
    }

    @Override
    public void c(m m2) {
        if (this.b(org.apache.logging.log4j.b.b, null, m2, null)) {
            this.a(null, a, org.apache.logging.log4j.b.b, m2, null);
        }
    }

    @Override
    public void c(m m2, Throwable throwable) {
        if (this.b(org.apache.logging.log4j.b.b, null, m2, throwable)) {
            this.a(null, a, org.apache.logging.log4j.b.b, m2, throwable);
        }
    }

    @Override
    public void d(Object object) {
        if (this.b(org.apache.logging.log4j.b.b, null, object, null)) {
            this.a(null, a, org.apache.logging.log4j.b.b, this.l.a(object), null);
        }
    }

    @Override
    public void c(Object object, Throwable throwable) {
        if (this.b(org.apache.logging.log4j.b.b, null, object, throwable)) {
            this.a(null, a, org.apache.logging.log4j.b.b, this.l.a(object), throwable);
        }
    }

    @Override
    public void c(String string) {
        if (this.b(org.apache.logging.log4j.b.b, null, string)) {
            this.a(null, a, org.apache.logging.log4j.b.b, this.l.a(string), null);
        }
    }

    @Override
    public void c(String string, Object ... arrobject) {
        if (this.c(org.apache.logging.log4j.b.b, null, string, arrobject)) {
            m m2 = this.l.a(string, arrobject);
            this.a(null, a, org.apache.logging.log4j.b.b, m2, m2.d());
        }
    }

    @Override
    public void c(String string, Throwable throwable) {
        if (this.b(org.apache.logging.log4j.b.b, (f)null, string, throwable)) {
            this.a(null, a, org.apache.logging.log4j.b.b, this.l.a(string), throwable);
        }
    }

    @Override
    public n c() {
        return this.l;
    }

    @Override
    public String d() {
        return this.k;
    }

    @Override
    public void d(f f2, m m2) {
        if (this.b(org.apache.logging.log4j.b.e, f2, m2, null)) {
            this.a(f2, a, org.apache.logging.log4j.b.e, m2, null);
        }
    }

    @Override
    public void d(f f2, m m2, Throwable throwable) {
        if (this.b(org.apache.logging.log4j.b.e, f2, m2, throwable)) {
            this.a(f2, a, org.apache.logging.log4j.b.e, m2, throwable);
        }
    }

    @Override
    public void d(f f2, Object object) {
        if (this.b(org.apache.logging.log4j.b.e, f2, object, null)) {
            this.a(f2, a, org.apache.logging.log4j.b.e, this.l.a(object), null);
        }
    }

    @Override
    public void d(f f2, Object object, Throwable throwable) {
        if (this.b(org.apache.logging.log4j.b.e, f2, object, throwable)) {
            this.a(f2, a, org.apache.logging.log4j.b.e, this.l.a(object), throwable);
        }
    }

    @Override
    public void d(f f2, String string) {
        if (this.b(org.apache.logging.log4j.b.e, f2, string)) {
            this.a(f2, a, org.apache.logging.log4j.b.e, this.l.a(string), null);
        }
    }

    @Override
    public void d(f f2, String string, Object ... arrobject) {
        if (this.c(org.apache.logging.log4j.b.e, f2, string, arrobject)) {
            m m2 = this.l.a(string, arrobject);
            this.a(f2, a, org.apache.logging.log4j.b.e, m2, m2.d());
        }
    }

    @Override
    public void d(f f2, String string, Throwable throwable) {
        if (this.b(org.apache.logging.log4j.b.e, f2, string, throwable)) {
            this.a(f2, a, org.apache.logging.log4j.b.e, this.l.a(string), throwable);
        }
    }

    @Override
    public void d(m m2) {
        if (this.b(org.apache.logging.log4j.b.e, null, m2, null)) {
            this.a(null, a, org.apache.logging.log4j.b.e, m2, null);
        }
    }

    @Override
    public void d(m m2, Throwable throwable) {
        if (this.b(org.apache.logging.log4j.b.e, null, m2, throwable)) {
            this.a(null, a, org.apache.logging.log4j.b.e, m2, throwable);
        }
    }

    @Override
    public void e(Object object) {
        if (this.b(org.apache.logging.log4j.b.e, null, object, null)) {
            this.a(null, a, org.apache.logging.log4j.b.e, this.l.a(object), null);
        }
    }

    @Override
    public void d(Object object, Throwable throwable) {
        if (this.b(org.apache.logging.log4j.b.e, null, object, throwable)) {
            this.a(null, a, org.apache.logging.log4j.b.e, this.l.a(object), throwable);
        }
    }

    @Override
    public void d(String string) {
        if (this.b(org.apache.logging.log4j.b.e, null, string)) {
            this.a(null, a, org.apache.logging.log4j.b.e, this.l.a(string), null);
        }
    }

    @Override
    public void d(String string, Object ... arrobject) {
        if (this.c(org.apache.logging.log4j.b.e, null, string, arrobject)) {
            m m2 = this.l.a(string, arrobject);
            this.a(null, a, org.apache.logging.log4j.b.e, m2, m2.d());
        }
    }

    @Override
    public void d(String string, Throwable throwable) {
        if (this.b(org.apache.logging.log4j.b.e, (f)null, string, throwable)) {
            this.a(null, a, org.apache.logging.log4j.b.e, this.l.a(string), throwable);
        }
    }

    @Override
    public boolean e() {
        return this.b(org.apache.logging.log4j.b.f, null, null);
    }

    @Override
    public boolean a(f f2) {
        return this.b(org.apache.logging.log4j.b.f, f2, (Object)null, null);
    }

    @Override
    public boolean a(b b2) {
        return this.b(b2, null, (Object)null, null);
    }

    protected abstract boolean b(b var1, f var2, m var3, Throwable var4);

    protected abstract boolean b(b var1, f var2, Object var3, Throwable var4);

    protected abstract boolean b(b var1, f var2, String var3);

    protected abstract boolean c(b var1, f var2, String var3, Object ... var4);

    protected abstract boolean b(b var1, f var2, String var3, Throwable var4);

    @Override
    public boolean f() {
        return this.b(org.apache.logging.log4j.b.c, null, (Object)null, null);
    }

    @Override
    public boolean b(f f2) {
        return this.b(org.apache.logging.log4j.b.c, f2, (Object)null, null);
    }

    @Override
    public boolean g() {
        return this.b(org.apache.logging.log4j.b.b, null, (Object)null, null);
    }

    @Override
    public boolean c(f f2) {
        return this.b(org.apache.logging.log4j.b.b, f2, (Object)null, null);
    }

    @Override
    public boolean h() {
        return this.b(org.apache.logging.log4j.b.e, null, (Object)null, null);
    }

    @Override
    public boolean d(f f2) {
        return this.b(org.apache.logging.log4j.b.e, f2, (Object)null, null);
    }

    @Override
    public boolean i() {
        return this.b(org.apache.logging.log4j.b.g, null, (Object)null, null);
    }

    @Override
    public boolean e(f f2) {
        return this.b(org.apache.logging.log4j.b.g, f2, (Object)null, null);
    }

    @Override
    public boolean j() {
        return this.b(org.apache.logging.log4j.b.d, null, (Object)null, null);
    }

    @Override
    public boolean f(f f2) {
        return this.b(org.apache.logging.log4j.b.d, f2, (Object)null, null);
    }

    @Override
    public boolean a(b b2, f f2) {
        return this.b(b2, f2, (Object)null, null);
    }

    @Override
    public void a(b b2, f f2, m m2) {
        if (this.b(b2, f2, m2, null)) {
            this.a(f2, a, b2, m2, null);
        }
    }

    @Override
    public void a(b b2, f f2, m m2, Throwable throwable) {
        if (this.b(b2, f2, m2, throwable)) {
            this.a(f2, a, b2, m2, throwable);
        }
    }

    @Override
    public void a(b b2, f f2, Object object) {
        if (this.b(b2, f2, object, null)) {
            this.a(f2, a, b2, this.l.a(object), null);
        }
    }

    @Override
    public void a(b b2, f f2, Object object, Throwable throwable) {
        if (this.b(b2, f2, object, throwable)) {
            this.a(f2, a, b2, this.l.a(object), throwable);
        }
    }

    @Override
    public void a(b b2, f f2, String string) {
        if (this.b(b2, f2, string)) {
            this.a(f2, a, b2, this.l.a(string), null);
        }
    }

    @Override
    public void a(b b2, f f2, String string, Object ... arrobject) {
        if (this.c(b2, f2, string, arrobject)) {
            m m2 = this.l.a(string, arrobject);
            this.a(f2, a, b2, m2, m2.d());
        }
    }

    @Override
    public void a(b b2, f f2, String string, Throwable throwable) {
        if (this.b(b2, f2, string, throwable)) {
            this.a(f2, a, b2, this.l.a(string), throwable);
        }
    }

    @Override
    public void a(b b2, m m2) {
        if (this.b(b2, null, m2, null)) {
            this.a(null, a, b2, m2, null);
        }
    }

    @Override
    public void a(b b2, m m2, Throwable throwable) {
        if (this.b(b2, null, m2, throwable)) {
            this.a(null, a, b2, m2, throwable);
        }
    }

    @Override
    public void a(b b2, Object object) {
        if (this.b(b2, null, object, null)) {
            this.a(null, a, b2, this.l.a(object), null);
        }
    }

    @Override
    public void a(b b2, Object object, Throwable throwable) {
        if (this.b(b2, null, object, throwable)) {
            this.a(null, a, b2, this.l.a(object), throwable);
        }
    }

    @Override
    public void a(b b2, String string) {
        if (this.b(b2, null, string)) {
            this.a(null, a, b2, this.l.a(string), null);
        }
    }

    @Override
    public void a(b b2, String string, Object ... arrobject) {
        if (this.c(b2, null, string, arrobject)) {
            m m2 = this.l.a(string, arrobject);
            this.a(null, a, b2, m2, m2.d());
        }
    }

    @Override
    public void a(b b2, String string, Throwable throwable) {
        if (this.b(b2, (f)null, string, throwable)) {
            this.a(null, a, b2, this.l.a(string), throwable);
        }
    }

    @Override
    public void b(b b2, String string, Object ... arrobject) {
        if (this.c(b2, null, string, arrobject)) {
            v v2 = new v(string, arrobject);
            this.a(null, a, b2, v2, v2.d());
        }
    }

    @Override
    public void b(b b2, f f2, String string, Object ... arrobject) {
        if (this.c(b2, f2, string, arrobject)) {
            v v2 = new v(string, arrobject);
            this.a(f2, a, b2, v2, v2.d());
        }
    }

    public abstract void a(f var1, String var2, b var3, m var4, Throwable var5);

    @Override
    public Throwable b(b b2, Throwable throwable) {
        return this.b(a, b2, throwable);
    }

    @Override
    public Throwable b(Throwable throwable) {
        return this.b(a, org.apache.logging.log4j.b.c, throwable);
    }

    protected Throwable b(String string, b b2, Throwable throwable) {
        if (this.b(b2, f, (Object)null, null)) {
            this.a(f, string, b2, this.l.a("throwing"), throwable);
        }
        return throwable;
    }

    private m h(Object object) {
        if (object == null) {
            return this.l.a("exit");
        }
        return this.l.a("exit with(" + object + ")");
    }

    public String toString() {
        return this.k;
    }

    @Override
    public void e(f f2, m m2) {
        if (this.b(org.apache.logging.log4j.b.g, f2, m2, null)) {
            this.a(f2, a, org.apache.logging.log4j.b.g, m2, null);
        }
    }

    @Override
    public void e(f f2, m m2, Throwable throwable) {
        if (this.b(org.apache.logging.log4j.b.g, f2, m2, throwable)) {
            this.a(f2, a, org.apache.logging.log4j.b.g, m2, throwable);
        }
    }

    @Override
    public void e(f f2, Object object) {
        if (this.b(org.apache.logging.log4j.b.g, f2, object, null)) {
            this.a(f2, a, org.apache.logging.log4j.b.g, this.l.a(object), null);
        }
    }

    @Override
    public void e(f f2, Object object, Throwable throwable) {
        if (this.b(org.apache.logging.log4j.b.g, f2, object, throwable)) {
            this.a(f2, a, org.apache.logging.log4j.b.g, this.l.a(object), throwable);
        }
    }

    @Override
    public void e(f f2, String string) {
        if (this.b(org.apache.logging.log4j.b.g, f2, string)) {
            this.a(f2, a, org.apache.logging.log4j.b.g, this.l.a(string), null);
        }
    }

    @Override
    public void e(f f2, String string, Object ... arrobject) {
        if (this.c(org.apache.logging.log4j.b.g, f2, string, arrobject)) {
            m m2 = this.l.a(string, arrobject);
            this.a(f2, a, org.apache.logging.log4j.b.g, m2, m2.d());
        }
    }

    @Override
    public void e(f f2, String string, Throwable throwable) {
        if (this.b(org.apache.logging.log4j.b.g, f2, string, throwable)) {
            this.a(f2, a, org.apache.logging.log4j.b.g, this.l.a(string), throwable);
        }
    }

    @Override
    public void e(m m2) {
        if (this.b(org.apache.logging.log4j.b.g, null, m2, null)) {
            this.a(null, a, org.apache.logging.log4j.b.g, m2, null);
        }
    }

    @Override
    public void e(m m2, Throwable throwable) {
        if (this.b(org.apache.logging.log4j.b.g, null, m2, throwable)) {
            this.a(null, a, org.apache.logging.log4j.b.g, m2, throwable);
        }
    }

    @Override
    public void f(Object object) {
        if (this.b(org.apache.logging.log4j.b.g, null, object, null)) {
            this.a(null, a, org.apache.logging.log4j.b.g, this.l.a(object), null);
        }
    }

    @Override
    public void e(Object object, Throwable throwable) {
        if (this.b(org.apache.logging.log4j.b.g, null, object, throwable)) {
            this.a(null, a, org.apache.logging.log4j.b.g, this.l.a(object), throwable);
        }
    }

    @Override
    public void e(String string) {
        if (this.b(org.apache.logging.log4j.b.g, null, string)) {
            this.a(null, a, org.apache.logging.log4j.b.g, this.l.a(string), null);
        }
    }

    @Override
    public void e(String string, Object ... arrobject) {
        if (this.c(org.apache.logging.log4j.b.g, null, string, arrobject)) {
            m m2 = this.l.a(string, arrobject);
            this.a(null, a, org.apache.logging.log4j.b.g, m2, m2.d());
        }
    }

    @Override
    public void e(String string, Throwable throwable) {
        if (this.b(org.apache.logging.log4j.b.g, (f)null, string, throwable)) {
            this.a(null, a, org.apache.logging.log4j.b.g, this.l.a(string), throwable);
        }
    }

    @Override
    public void f(f f2, m m2) {
        if (this.b(org.apache.logging.log4j.b.d, f2, m2, null)) {
            this.a(f2, a, org.apache.logging.log4j.b.d, m2, null);
        }
    }

    @Override
    public void f(f f2, m m2, Throwable throwable) {
        if (this.b(org.apache.logging.log4j.b.d, f2, m2, throwable)) {
            this.a(f2, a, org.apache.logging.log4j.b.d, m2, throwable);
        }
    }

    @Override
    public void f(f f2, Object object) {
        if (this.b(org.apache.logging.log4j.b.d, f2, object, null)) {
            this.a(f2, a, org.apache.logging.log4j.b.d, this.l.a(object), null);
        }
    }

    @Override
    public void f(f f2, Object object, Throwable throwable) {
        if (this.b(org.apache.logging.log4j.b.d, f2, object, throwable)) {
            this.a(f2, a, org.apache.logging.log4j.b.d, this.l.a(object), throwable);
        }
    }

    @Override
    public void f(f f2, String string) {
        if (this.b(org.apache.logging.log4j.b.d, f2, string)) {
            this.a(f2, a, org.apache.logging.log4j.b.d, this.l.a(string), null);
        }
    }

    @Override
    public void f(f f2, String string, Object ... arrobject) {
        if (this.c(org.apache.logging.log4j.b.d, f2, string, arrobject)) {
            m m2 = this.l.a(string, arrobject);
            this.a(f2, a, org.apache.logging.log4j.b.d, m2, m2.d());
        }
    }

    @Override
    public void f(f f2, String string, Throwable throwable) {
        if (this.b(org.apache.logging.log4j.b.d, f2, string, throwable)) {
            this.a(f2, a, org.apache.logging.log4j.b.d, this.l.a(string), throwable);
        }
    }

    @Override
    public void f(m m2) {
        if (this.b(org.apache.logging.log4j.b.d, null, m2, null)) {
            this.a(null, a, org.apache.logging.log4j.b.d, m2, null);
        }
    }

    @Override
    public void f(m m2, Throwable throwable) {
        if (this.b(org.apache.logging.log4j.b.d, null, m2, throwable)) {
            this.a(null, a, org.apache.logging.log4j.b.d, m2, throwable);
        }
    }

    @Override
    public void g(Object object) {
        if (this.b(org.apache.logging.log4j.b.d, null, object, null)) {
            this.a(null, a, org.apache.logging.log4j.b.d, this.l.a(object), null);
        }
    }

    @Override
    public void f(Object object, Throwable throwable) {
        if (this.b(org.apache.logging.log4j.b.d, null, object, throwable)) {
            this.a(null, a, org.apache.logging.log4j.b.d, this.l.a(object), throwable);
        }
    }

    @Override
    public void f(String string) {
        if (this.b(org.apache.logging.log4j.b.d, null, string)) {
            this.a(null, a, org.apache.logging.log4j.b.d, this.l.a(string), null);
        }
    }

    @Override
    public void f(String string, Object ... arrobject) {
        if (this.c(org.apache.logging.log4j.b.d, null, string, arrobject)) {
            m m2 = this.l.a(string, arrobject);
            this.a(null, a, org.apache.logging.log4j.b.d, m2, m2.d());
        }
    }

    @Override
    public void f(String string, Throwable throwable) {
        if (this.b(org.apache.logging.log4j.b.d, (f)null, string, throwable)) {
            this.a(null, a, org.apache.logging.log4j.b.d, this.l.a(string), throwable);
        }
    }
}

