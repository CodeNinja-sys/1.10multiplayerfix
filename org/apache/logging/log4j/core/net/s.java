/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.net;

import javax.naming.Context;
import javax.naming.NamingException;
import org.apache.logging.log4j.core.a.x;
import org.apache.logging.log4j.core.net.a;
import org.apache.logging.log4j.core.net.p;
import org.apache.logging.log4j.core.net.q;
import org.apache.logging.log4j.core.net.r;
import org.apache.logging.log4j.core.net.t;

class s
implements x {
    private s() {
    }

    public p a(String string, r r2) {
        try {
            Context context = a.a(r.a(r2), r.b(r2), r.c(r2), r.d(r2), r.e(r2));
            t t2 = p.a(context, r.f(r2), r.g(r2), r.h(r2), r.i(r2), true);
            return new p(string, context, r.f(r2), r.g(r2), r.h(r2), r.i(r2), t2);
        }
        catch (NamingException namingException) {
            p.f().b("Unable to locate resource", (Throwable)namingException);
        }
        catch (Exception exception) {
            p.g().b("Unable to connect", (Throwable)exception);
        }
        return null;
    }

    /* synthetic */ s(q q2) {
        this();
    }
}

