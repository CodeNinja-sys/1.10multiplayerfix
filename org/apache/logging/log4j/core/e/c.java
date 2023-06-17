/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.e;

import java.net.URI;
import org.apache.logging.log4j.c.f;
import org.apache.logging.log4j.c.g;
import org.apache.logging.log4j.core.d.p;
import org.apache.logging.log4j.core.f.i;
import org.apache.logging.log4j.core.j.b;
import org.apache.logging.log4j.core.j.e;
import org.apache.logging.log4j.core.k;
import org.apache.logging.log4j.core.m;
import org.apache.logging.log4j.d.d;

public class c
implements g {
    private static final d a = d.k();
    private e b;

    public c() {
        String string = org.apache.logging.log4j.e.b.a().a("Log4jContextSelector");
        if (string != null) {
            try {
                Class class_ = p.a(string);
                if (class_ != null && e.class.isAssignableFrom(class_)) {
                    this.b = (e)class_.newInstance();
                }
            }
            catch (Exception exception) {
                a.b("Unable to create context " + string, (Throwable)exception);
            }
        }
        if (this.b == null) {
            this.b = new b();
        }
        try {
            i.a(this.b);
        }
        catch (Exception exception) {
            a.b("Could not start JMX", (Throwable)exception);
        }
    }

    public e a() {
        return this.b;
    }

    public k a(String string, ClassLoader classLoader, boolean bl2) {
        k k2 = this.b.a(string, classLoader, bl2);
        if (k2.b() == m.a) {
            k2.e();
        }
        return k2;
    }

    public k a(String string, ClassLoader classLoader, boolean bl2, URI uRI) {
        k k2 = this.b.a(string, classLoader, bl2, uRI);
        if (k2.b() == m.a) {
            k2.e();
        }
        return k2;
    }

    @Override
    public void a(f f2) {
        if (f2 instanceof k) {
            this.b.a((k)f2);
        }
    }

    @Override
    public /* synthetic */ f b(String string, ClassLoader classLoader, boolean bl2, URI uRI) {
        return this.a(string, classLoader, bl2, uRI);
    }

    @Override
    public /* synthetic */ f b(String string, ClassLoader classLoader, boolean bl2) {
        return this.a(string, classLoader, bl2);
    }
}

