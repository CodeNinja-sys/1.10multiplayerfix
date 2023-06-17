/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.net;

import javax.naming.Context;
import javax.naming.NamingException;
import org.apache.logging.log4j.core.a.x;
import org.apache.logging.log4j.core.net.a;
import org.apache.logging.log4j.core.net.k;
import org.apache.logging.log4j.core.net.l;
import org.apache.logging.log4j.core.net.m;
import org.apache.logging.log4j.core.net.o;

class n
implements x {
    private n() {
    }

    public k a(String string, m m2) {
        try {
            Context context = a.a(m.a(m2), m.b(m2), m.c(m2), m.d(m2), m.e(m2));
            o o2 = k.a(context, m.f(m2), m.g(m2), m.h(m2), m.i(m2), true);
            return new k(string, context, m.f(m2), m.g(m2), m.h(m2), m.i(m2), o2);
        }
        catch (NamingException namingException) {
            k.f().b("Unable to locate resource", (Throwable)namingException);
        }
        catch (Exception exception) {
            k.g().b("Unable to connect", (Throwable)exception);
        }
        return null;
    }

    /* synthetic */ n(l l2) {
        this();
    }
}

