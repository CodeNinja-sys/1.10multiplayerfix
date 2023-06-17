/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.er;
import com.a.a.n.a.et;
import com.a.a.n.a.eu;
import com.a.a.n.a.fb;
import com.a.a.n.a.fg;
import com.a.a.n.a.fi;
import java.lang.ref.WeakReference;
import java.util.logging.Level;

final class fh
extends et {
    final er a;
    final WeakReference b;

    fh(er er2, WeakReference weakReference) {
        this.a = er2;
        this.b = weakReference;
    }

    @Override
    public void a() {
        fi fi2 = (fi)this.b.get();
        if (fi2 != null) {
            fi2.a(this.a, eu.a, eu.b);
            if (!(this.a instanceof fg)) {
                fb.h().log(Level.FINE, "Starting {0}.", this.a);
            }
        }
    }

    @Override
    public void b() {
        fi fi2 = (fi)this.b.get();
        if (fi2 != null) {
            fi2.a(this.a, eu.b, eu.c);
        }
    }

    @Override
    public void b(eu eu2) {
        fi fi2 = (fi)this.b.get();
        if (fi2 != null) {
            fi2.a(this.a, eu2, eu.d);
        }
    }

    @Override
    public void a(eu eu2) {
        fi fi2 = (fi)this.b.get();
        if (fi2 != null) {
            if (!(this.a instanceof fg)) {
                fb.h().log(Level.FINE, "Service {0} has terminated. Previous state was: {1}", new Object[]{this.a, eu2});
            }
            fi2.a(this.a, eu2, eu.e);
        }
    }

    @Override
    public void a(eu eu2, Throwable throwable) {
        fi fi2 = (fi)this.b.get();
        if (fi2 != null) {
            if (!(this.a instanceof fg)) {
                fb.h().log(Level.SEVERE, "Service " + this.a + " has failed in the " + (Object)((Object)eu2) + " state.", throwable);
            }
            fi2.a(this.a, eu2, eu.f);
        }
    }
}

