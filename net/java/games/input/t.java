/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;
import net.java.games.input.ae;
import net.java.games.input.q;
import net.java.games.input.u;
import net.java.games.input.v;

public abstract class t {
    private static t d;
    protected final ArrayList a = new ArrayList();
    static Class b;
    static final boolean c;

    static void a(String string) {
        t.b(string + "\n");
    }

    static void b(String string) {
        Logger.getLogger((b == null ? (b = t.c("net.java.games.input.t")) : b).getName()).info(string);
    }

    protected t() {
    }

    public abstract q[] a();

    public void a(v v2) {
        if (!c && v2 == null) {
            throw new AssertionError();
        }
        this.a.add(v2);
    }

    public abstract boolean b();

    public void b(v v2) {
        if (!c && v2 == null) {
            throw new AssertionError();
        }
        this.a.remove(v2);
    }

    protected void a(q q2) {
        u u2 = new u(q2);
        Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((v)iterator.next()).b(u2);
        }
    }

    protected void b(q q2) {
        u u2 = new u(q2);
        Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((v)iterator.next()).a(u2);
        }
    }

    public static t c() {
        return d;
    }

    static Class c(String string) {
        try {
            return Class.forName(string);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new NoClassDefFoundError().initCause(classNotFoundException);
        }
    }

    static {
        c = !(b == null ? (b = t.c("net.java.games.input.t")) : b).desiredAssertionStatus();
        d = new ae();
    }
}

