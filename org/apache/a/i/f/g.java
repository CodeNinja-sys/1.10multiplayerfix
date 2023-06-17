/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.f;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.apache.a.c.c.e;
import org.apache.a.i.f.c;
import org.apache.a.i.f.j;
import org.apache.a.i.f.l;
import org.apache.a.n;
import org.apache.a.o;
import org.apache.a.u;
import org.apache.a.x;

class g {
    g() {
    }

    static void a(o o2) {
        n n2 = o2.b();
        if (n2 != null && !n2.a() && !g.a(n2)) {
            n n3 = (n)Proxy.newProxyInstance(n.class.getClassLoader(), new Class[]{n.class}, (InvocationHandler)new j(n2));
            o2.a(n3);
        }
    }

    static boolean a(n n2) {
        if (n2 != null && Proxy.isProxyClass(n2.getClass())) {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(n2);
            return invocationHandler instanceof j;
        }
        return false;
    }

    static boolean a(u u2) {
        n n2;
        if (u2 instanceof o && (n2 = ((o)u2).b()) != null) {
            j j2;
            if (g.a(n2) && !(j2 = (j)Proxy.getInvocationHandler(n2)).b()) {
                return true;
            }
            return n2.a();
        }
        return true;
    }

    public static e a(x x2, c c2) {
        return (e)Proxy.newProxyInstance(l.class.getClassLoader(), new Class[]{e.class}, (InvocationHandler)new l(x2, c2));
    }
}

