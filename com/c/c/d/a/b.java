/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

import com.c.c.a.m;
import com.c.c.b.w;
import com.c.c.d.a.a;
import com.c.c.d.a.c;
import com.c.c.d.a.e;
import com.c.c.d.a.g;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

class b
extends Thread {
    final /* synthetic */ a a;

    b(a a2) {
        this.a = a2;
    }

    @Override
    public void run() {
        m m2 = m.a();
        try {
            g g2;
            String string;
            w w2 = m2.b(com.c.c.d.a.a.a((a)this.a).a);
            com.c.c.d.a.a.a(this.a, com.c.c.d.a.a.a(this.a, w2));
            ArrayList<g> arrayList = new ArrayList<g>();
            for (e e2 : com.c.c.d.a.a.b(this.a)) {
                for (c c2 : e2.b) {
                    string = new SimpleDateFormat("dd/MM").format(new Date(c2.b));
                    g2 = new g(string, c2.b);
                    if (arrayList.contains(g2)) continue;
                    arrayList.add(g2);
                }
            }
            Collections.sort(arrayList);
            for (e e2 : com.c.c.d.a.a.b(this.a)) {
                for (c c2 : e2.b) {
                    string = new SimpleDateFormat("dd/MM").format(new Date(c2.b));
                    g2 = new g(string, c2.b);
                    c2.d = arrayList.indexOf(g2) + 1;
                }
            }
            com.c.c.d.a.a.b(this.a, arrayList);
        }
        catch (com.c.c.c.b b2) {
            b2.printStackTrace();
        }
    }
}

