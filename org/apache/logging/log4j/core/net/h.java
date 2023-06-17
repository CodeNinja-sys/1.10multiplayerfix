/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.net;

import java.net.InetAddress;
import java.net.UnknownHostException;
import org.apache.logging.log4j.core.a.x;
import org.apache.logging.log4j.core.net.e;
import org.apache.logging.log4j.core.net.f;
import org.apache.logging.log4j.core.net.g;
import org.apache.logging.log4j.core.net.i;

class h
implements x {
    private h() {
    }

    public f a(String string, i i2) {
        InetAddress inetAddress;
        e e2 = new e(i.a(i2), i.b(i2), i.c(i2).b(), i.c(i2).a());
        try {
            inetAddress = InetAddress.getByName(i.a(i2));
        }
        catch (UnknownHostException unknownHostException) {
            f.f().b("Could not find address of " + i.a(i2), (Throwable)unknownHostException);
            return null;
        }
        return new f(string, e2, inetAddress, i.a(i2), i.b(i2), i.c(i2));
    }

    /* synthetic */ h(g g2) {
        this();
    }
}

