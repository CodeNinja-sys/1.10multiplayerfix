/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.a;

import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import org.apache.a.b.b;
import org.apache.a.b.c;
import org.apache.a.b.d;
import org.apache.a.b.j;
import org.apache.a.b.k;
import org.apache.a.b.n;
import org.apache.a.b.o;
import org.apache.a.b.q;
import org.apache.a.f;
import org.apache.a.n.g;
import org.apache.a.r;
import org.apache.a.u;
import org.apache.a.x;
import org.apache.commons.d.a;

public class i {
    private final a a;

    public i(a a2) {
        this.a = a2 != null ? a2 : org.apache.commons.d.c.b(this.getClass());
    }

    public i() {
        this(null);
    }

    public boolean a(r r2, x x2, org.apache.a.c.c c2, j j2, g g2) {
        if (c2.a(r2, x2, g2)) {
            this.a.b("Authentication required");
            if (j2.b() == c.e) {
                c2.b(r2, j2.c(), g2);
            }
            return true;
        }
        switch (j2.b()) {
            case b: 
            case c: {
                this.a.b("Authentication succeeded");
                j2.a(c.e);
                c2.a(r2, j2.c(), g2);
                break;
            }
            case e: {
                break;
            }
            default: {
                j2.a(c.a);
            }
        }
        return false;
    }

    public boolean b(r r2, x x2, org.apache.a.c.c c2, j j2, g g2) {
        try {
            Object object;
            Map map;
            if (this.a.a()) {
                this.a.b(r2.f() + " requested authentication");
            }
            if ((map = c2.b(r2, x2, g2)).isEmpty()) {
                this.a.b("Response contains no authentication challenges");
                return false;
            }
            d d2 = j2.c();
            switch (j2.b()) {
                case d: {
                    return false;
                }
                case e: {
                    j2.a();
                    break;
                }
                case b: 
                case c: {
                    if (d2 == null) {
                        this.a.b("Auth scheme is null");
                        c2.b(r2, (d)null, g2);
                        j2.a();
                        j2.a(c.d);
                        return false;
                    }
                }
                case a: {
                    if (d2 == null) break;
                    object = d2.a();
                    f f2 = (f)map.get(((String)object).toLowerCase(Locale.US));
                    if (f2 != null) {
                        this.a.b("Authorization challenge processed");
                        d2.a(f2);
                        if (d2.d()) {
                            this.a.b("Authentication failed");
                            c2.b(r2, j2.c(), g2);
                            j2.a();
                            j2.a(c.d);
                            return false;
                        }
                        j2.a(c.c);
                        return true;
                    }
                    j2.a();
                }
            }
            object = c2.a(map, r2, x2, g2);
            if (object != null && !object.isEmpty()) {
                if (this.a.a()) {
                    this.a.b("Selected authentication options: " + object);
                }
                j2.a(c.b);
                j2.a((Queue)object);
                return true;
            }
            return false;
        }
        catch (q q2) {
            if (this.a.f()) {
                this.a.d("Malformed challenge: " + q2.getMessage());
            }
            j2.a();
            return false;
        }
    }

    public void a(u u2, j j2, g g2) {
        block13: {
            Object object;
            d d2 = j2.c();
            o o2 = j2.d();
            switch (j2.b()) {
                case d: {
                    return;
                }
                case e: {
                    this.a(d2);
                    if (!d2.c()) break;
                    return;
                }
                case b: {
                    object = j2.e();
                    if (object != null) {
                        while (!object.isEmpty()) {
                            b b2 = (b)object.remove();
                            d2 = b2.a();
                            o2 = b2.b();
                            j2.a(d2, o2);
                            if (this.a.a()) {
                                this.a.b("Generating response to an authentication challenge using " + d2.a() + " scheme");
                            }
                            try {
                                f f2 = this.a(d2, o2, u2, g2);
                                u2.a(f2);
                                break;
                            }
                            catch (k k2) {
                                if (!this.a.f()) continue;
                                this.a.d(d2 + " authentication error: " + k2.getMessage());
                            }
                        }
                        return;
                    }
                    this.a(d2);
                }
            }
            if (d2 != null) {
                try {
                    object = this.a(d2, o2, u2, g2);
                    u2.a((f)object);
                }
                catch (k k3) {
                    if (!this.a.b()) break block13;
                    this.a.e(d2 + " authentication error: " + k3.getMessage());
                }
            }
        }
    }

    private void a(d d2) {
        org.apache.a.o.b.a(d2, "Auth scheme");
    }

    private f a(d d2, o o2, u u2, g g2) {
        if (d2 instanceof n) {
            return ((n)d2).a(o2, u2, g2);
        }
        return d2.a(o2, u2);
    }
}

