/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.b;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import javax.net.ssl.SSLException;
import org.apache.a.c.e.c;
import org.apache.a.c.k;
import org.apache.a.i.b.aw;
import org.apache.a.n.g;
import org.apache.a.o;
import org.apache.a.o.a;
import org.apache.a.u;

public class t
implements k {
    public static final t a = new t();
    private final int b;
    private final boolean c;
    private final Set d;

    protected t(int n2, boolean bl2, Collection collection) {
        this.b = n2;
        this.c = bl2;
        this.d = new HashSet();
        for (Class class_ : collection) {
            this.d.add(class_);
        }
    }

    public t(int n2, boolean bl2) {
        this(n2, bl2, Arrays.asList(InterruptedIOException.class, UnknownHostException.class, ConnectException.class, SSLException.class));
    }

    public t() {
        this(3, false);
    }

    public boolean a(IOException iOException, int n2, g g2) {
        Object object2;
        org.apache.a.o.a.a(iOException, "Exception parameter");
        org.apache.a.o.a.a(g2, "HTTP context");
        if (n2 > this.b) {
            return false;
        }
        if (this.d.contains(iOException.getClass())) {
            return false;
        }
        for (Object object2 : this.d) {
            if (!((Class)object2).isInstance(iOException)) continue;
            return false;
        }
        c c2 = org.apache.a.c.e.c.a(g2);
        object2 = c2.q();
        if (this.b((u)object2)) {
            return false;
        }
        if (this.a((u)object2)) {
            return true;
        }
        return !c2.r() || this.c;
    }

    public boolean a() {
        return this.c;
    }

    public int b() {
        return this.b;
    }

    protected boolean a(u u2) {
        return !(u2 instanceof o);
    }

    protected boolean b(u u2) {
        u u3 = u2;
        if (u2 instanceof aw) {
            u3 = ((aw)u2).l();
        }
        return u3 instanceof org.apache.a.c.c.u && ((org.apache.a.c.c.u)u3).h();
    }
}

