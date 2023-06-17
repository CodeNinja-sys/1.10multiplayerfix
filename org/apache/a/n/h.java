/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.n;

import org.apache.a.k;
import org.apache.a.n.a;
import org.apache.a.n.g;
import org.apache.a.r;
import org.apache.a.u;
import org.apache.a.x;

public class h
implements g {
    public static final String o = "http.connection";
    public static final String p = "http.request";
    public static final String q = "http.response";
    public static final String r = "http.target_host";
    public static final String s = "http.request_sent";
    private final g a;

    public static h o() {
        return new h(new a());
    }

    public static h b(g g2) {
        org.apache.a.o.a.a(g2, "HTTP context");
        if (g2 instanceof h) {
            return (h)g2;
        }
        return new h(g2);
    }

    public h(g g2) {
        this.a = g2;
    }

    public h() {
        this.a = new a();
    }

    public Object a(String string) {
        return this.a.a(string);
    }

    public void a(String string, Object object) {
        this.a.a(string, object);
    }

    public Object b(String string) {
        return this.a.b(string);
    }

    public Object a(String string, Class class_) {
        org.apache.a.o.a.a(class_, "Attribute class");
        Object object = this.a(string);
        if (object == null) {
            return null;
        }
        return class_.cast(object);
    }

    public k b(Class class_) {
        return (k)this.a(o, class_);
    }

    public k p() {
        return (k)this.a(o, k.class);
    }

    public u q() {
        return (u)this.a(p, u.class);
    }

    public boolean r() {
        Boolean bl2 = (Boolean)this.a(s, Boolean.class);
        return bl2 != null && bl2 != false;
    }

    public x s() {
        return (x)this.a(q, x.class);
    }

    public void a(r r2) {
        this.a(r, r2);
    }

    public r t() {
        return (r)this.a(r, r.class);
    }
}

