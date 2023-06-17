/*
 * Decompiled with CFR 0.150.
 */
package e.a;

import e.a.f;
import e.a.p;
import java.util.ListIterator;

final class q
extends Thread {
    final /* synthetic */ String a;
    final /* synthetic */ int b;

    q(String string, int n2) {
        this.a = string;
        this.b = n2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void run() {
        Object object = p.s();
        synchronized (object) {
            if (p.t() == null) {
                return;
            }
            ListIterator listIterator = p.t().listIterator();
            while (listIterator.hasNext()) {
                f f2 = (f)listIterator.next();
                if (f2 == null) {
                    listIterator.remove();
                    continue;
                }
                f2.a(this.a, this.b);
            }
        }
    }
}

