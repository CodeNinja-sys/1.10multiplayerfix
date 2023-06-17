/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import java.awt.AWTEvent;
import java.awt.Toolkit;
import java.awt.event.AWTEventListener;
import java.awt.event.KeyEvent;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import net.java.games.input.ar;
import net.java.games.input.au;
import net.java.games.input.b;
import net.java.games.input.d;
import net.java.games.input.dj;
import net.java.games.input.k;
import net.java.games.input.l;
import net.java.games.input.o;
import net.java.games.input.q;

final class c
extends au
implements AWTEventListener {
    private final List c = new ArrayList();
    private ar[] d;
    private int e;
    static Class a;

    protected c() {
        super("AWTKeyboard", net.java.games.input.c.k(), new q[0], new dj[0]);
        Toolkit.getDefaultToolkit().addAWTEventListener(this, 8L);
        this.c(32);
    }

    private static final k[] k() {
        ArrayList<d> arrayList = new ArrayList<d>();
        Field[] arrfield = (a == null ? (a = net.java.games.input.c.a("java.awt.event.KeyEvent")) : a).getFields();
        for (int i2 = 0; i2 < arrfield.length; ++i2) {
            Field field = arrfield[i2];
            try {
                int n2;
                o o2;
                if (!Modifier.isStatic(field.getModifiers()) || field.getType() != Integer.TYPE || !field.getName().startsWith("VK_") || (o2 = net.java.games.input.b.a(n2 = field.getInt(null))) == o.bu) continue;
                arrayList.add(new d(o2));
                continue;
            }
            catch (IllegalAccessException illegalAccessException) {
                throw new RuntimeException(illegalAccessException);
            }
        }
        arrayList.add(new d(o.aZ));
        arrayList.add(new d(o.D));
        arrayList.add(new d(o.ac));
        arrayList.add(new d(o.Q));
        arrayList.add(new d(o.bd));
        arrayList.add(new d(o.ae));
        arrayList.add(new d(o.aY));
        arrayList.add(new d(o.C));
        arrayList.add(new d(o.ba));
        arrayList.add(new d(o.Z));
        return arrayList.toArray(new k[0]);
    }

    private final void c(int n2) {
        this.d = new ar[n2];
        for (int i2 = 0; i2 < this.d.length; ++i2) {
            this.d[i2] = new ar();
        }
        this.e = 0;
    }

    protected final void a(int n2) {
        this.c(n2);
    }

    public final synchronized void eventDispatched(AWTEvent aWTEvent) {
        if (aWTEvent instanceof KeyEvent) {
            this.c.add(aWTEvent);
        }
    }

    public final synchronized void a() {
        for (int i2 = 0; i2 < this.c.size(); ++i2) {
            KeyEvent keyEvent = (KeyEvent)this.c.get(i2);
            this.a(keyEvent);
        }
        this.c.clear();
    }

    private final void a(KeyEvent keyEvent) {
        KeyEvent keyEvent2;
        o o2 = net.java.games.input.b.a(keyEvent);
        if (o2 == null) {
            return;
        }
        d d2 = (d)this.a((l)o2);
        if (d2 == null) {
            return;
        }
        long l2 = keyEvent.getWhen() * 1000000L;
        if (keyEvent.getID() == 401) {
            this.a(d2, 1.0f, l2);
        } else if (keyEvent.getID() == 402 && ((keyEvent2 = (KeyEvent)Toolkit.getDefaultToolkit().getSystemEventQueue().peekEvent(401)) == null || keyEvent2.getWhen() != keyEvent.getWhen())) {
            this.a(d2, 0.0f, l2);
        }
    }

    private final void a(d d2, float f2, long l2) {
        d2.a(f2);
        if (this.e < this.d.length) {
            this.d[this.e++].a(d2, f2, l2);
        }
    }

    protected final synchronized boolean a(ar ar2) {
        if (this.e == 0) {
            return false;
        }
        --this.e;
        ar2.a(this.d[0]);
        ar ar3 = this.d[0];
        this.d[0] = this.d[this.e];
        this.d[this.e] = ar3;
        return true;
    }

    static Class a(String string) {
        try {
            return Class.forName(string);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new NoClassDefFoundError().initCause(classNotFoundException);
        }
    }
}

