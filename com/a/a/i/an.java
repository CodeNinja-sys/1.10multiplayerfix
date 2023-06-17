/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.d.j;
import com.a.a.i.al;
import com.a.a.i.am;
import java.util.Iterator;

class an
extends j {
    Iterator a;
    final /* synthetic */ am b;

    an(am am2) {
        this.b = am2;
        this.a = al.j().a(al.a(this.b.a)).iterator();
    }

    protected String d() {
        if (this.a.hasNext()) {
            String string = (String)this.a.next();
            if (this.a.hasNext() || !string.isEmpty()) {
                return string;
            }
        }
        return (String)this.b();
    }

    @Override
    protected /* synthetic */ Object a() {
        return this.d();
    }
}

