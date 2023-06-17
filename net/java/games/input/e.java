/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import java.awt.AWTEvent;
import java.awt.Toolkit;
import java.awt.event.AWTEventListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.util.ArrayList;
import java.util.List;
import net.java.games.input.ar;
import net.java.games.input.cf;
import net.java.games.input.dj;
import net.java.games.input.f;
import net.java.games.input.g;
import net.java.games.input.k;
import net.java.games.input.m;
import net.java.games.input.n;
import net.java.games.input.q;

final class e
extends cf
implements AWTEventListener {
    private static final int a = 1;
    private static final int c = 2;
    private static final int d = 4;
    private final List e = new ArrayList();
    private final List f = new ArrayList();
    private int g = 1;

    protected e() {
        super("AWTMouse", net.java.games.input.e.z(), new q[0], new dj[0]);
        Toolkit.getDefaultToolkit().addAWTEventListener(this, 131120L);
    }

    private static final k[] z() {
        return new k[]{new f(m.a), new f(m.b), new f(m.c), new g(n.aw), new g(n.ax), new g(n.ay)};
    }

    private final void a(int n2, float f2) {
        g g2 = this.c(n2);
        if (g2 != null) {
            g2.a(f2);
        }
    }

    private final g c(int n2) {
        switch (n2) {
            case 1: {
                return (g)this.q();
            }
            case 2: {
                return (g)this.s();
            }
            case 3: {
                return (g)this.r();
            }
        }
        return null;
    }

    private final void a(AWTEvent aWTEvent) {
        if (aWTEvent instanceof MouseWheelEvent) {
            MouseWheelEvent mouseWheelEvent = (MouseWheelEvent)aWTEvent;
            f f2 = (f)this.m();
            f2.a(f2.a() + (float)mouseWheelEvent.getWheelRotation());
        } else if (aWTEvent instanceof MouseEvent) {
            MouseEvent mouseEvent = (MouseEvent)aWTEvent;
            f f3 = (f)this.k();
            f f4 = (f)this.l();
            f3.a(mouseEvent.getX());
            f4.a(mouseEvent.getY());
            switch (mouseEvent.getID()) {
                case 501: {
                    this.a(mouseEvent.getButton(), 1.0f);
                    break;
                }
                case 502: {
                    this.a(mouseEvent.getButton(), 0.0f);
                    break;
                }
            }
        }
    }

    public final synchronized void a() {
        f f2 = (f)this.m();
        f2.a(0.0f);
        for (int i2 = 0; i2 < this.e.size(); ++i2) {
            AWTEvent aWTEvent = (AWTEvent)this.e.get(i2);
            this.a(aWTEvent);
            this.f.add(aWTEvent);
        }
        this.e.clear();
    }

    protected final synchronized boolean a(ar ar2) {
        block9: while (true) {
            long l2;
            MouseEvent mouseEvent;
            if (this.f.isEmpty()) {
                return false;
            }
            AWTEvent aWTEvent = (AWTEvent)this.f.get(0);
            if (aWTEvent instanceof MouseWheelEvent) {
                mouseEvent = (MouseWheelEvent)aWTEvent;
                l2 = mouseEvent.getWhen() * 1000000L;
                ar2.a(this.m(), ((MouseWheelEvent)mouseEvent).getWheelRotation(), l2);
                this.f.remove(0);
                continue;
            }
            if (!(aWTEvent instanceof MouseEvent)) continue;
            mouseEvent = (MouseEvent)aWTEvent;
            l2 = mouseEvent.getWhen() * 1000000L;
            switch (this.g) {
                case 1: {
                    this.g = 2;
                    ar2.a(this.k(), mouseEvent.getX(), l2);
                    return true;
                }
                case 2: {
                    this.g = 4;
                    ar2.a(this.l(), mouseEvent.getY(), l2);
                    return true;
                }
                case 4: {
                    this.f.remove(0);
                    this.g = 1;
                    g g2 = this.c(mouseEvent.getButton());
                    if (g2 == null) continue block9;
                    switch (mouseEvent.getID()) {
                        case 501: {
                            ar2.a(g2, 1.0f, l2);
                            return true;
                        }
                        case 502: {
                            ar2.a(g2, 0.0f, l2);
                            return true;
                        }
                    }
                    continue block9;
                }
            }
            break;
        }
        throw new RuntimeException("Unknown event state: " + this.g);
    }

    public final synchronized void eventDispatched(AWTEvent aWTEvent) {
        this.e.add(aWTEvent);
    }
}

