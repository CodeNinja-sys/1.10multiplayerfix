/*
 * Decompiled with CFR 0.150.
 */
package e.a;

import e.a.l;
import e.a.p;
import e.a.t;
import e.a.u;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class v
extends l {
    private t a;
    private List b;
    private final Object c = new Object();

    public v() {
        this.a = p.b();
        this.b = new LinkedList();
    }

    protected void a() {
        this.d();
        super.a();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void run() {
        this.a(3600000L);
        while (!this.e()) {
            while (!this.e() && !this.b.isEmpty()) {
                Object object = this.c;
                synchronized (object) {
                    ListIterator listIterator = this.b.listIterator();
                    while (!this.e() && listIterator.hasNext()) {
                        u u2 = (u)listIterator.next();
                        if (u2 == null) {
                            listIterator.remove();
                            continue;
                        }
                        if (u2.u()) {
                            if (u2.b) continue;
                            listIterator.remove();
                            continue;
                        }
                        if (!u2.s()) {
                            if (u2.g || u2.b) {
                                u2.h = true;
                            }
                            listIterator.remove();
                            continue;
                        }
                        if (u2.v()) continue;
                        u2.b();
                        if (u2.k() || u2.b || u2.s != null && u2.s.d()) continue;
                        if (u2.v == null) {
                            u2.d();
                        }
                        if (u2.g) {
                            if (u2.t()) continue;
                            p.a(u2.i, u2.e());
                            if (u2.b()) {
                                u2.z = true;
                                continue;
                            }
                            u2.c();
                            u2.z = true;
                            continue;
                        }
                        if (u2.t()) continue;
                        p.a(u2.i, u2.e());
                        if (u2.b()) continue;
                        if (u2.c()) {
                            u2.z = true;
                            continue;
                        }
                        listIterator.remove();
                    }
                }
                if (this.e() || this.b.isEmpty()) continue;
                this.a(20L);
            }
            if (this.e() || !this.b.isEmpty()) continue;
            this.a(3600000L);
        }
        this.a();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(u u2) {
        if (u2 == null) {
            return;
        }
        if (this.b.contains(u2)) {
            return;
        }
        Object object = this.c;
        synchronized (object) {
            ListIterator listIterator = this.b.listIterator();
            while (listIterator.hasNext()) {
                u u3 = (u)listIterator.next();
                if (u3 == null) {
                    listIterator.remove();
                    continue;
                }
                if (u2.s != u3.s) continue;
                u3.n();
                listIterator.remove();
            }
            this.b.add(u2);
        }
    }

    private void a(String string) {
        this.a.a(string, 0);
    }

    private void b(String string) {
        this.a.b(string, 0);
    }

    private boolean a(boolean bl2, String string) {
        return this.a.a(bl2, "StreamThread", string, 0);
    }

    private void c(String string) {
        this.a.a("StreamThread", string, 0);
    }
}

