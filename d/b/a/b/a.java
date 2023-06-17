/*
 * Decompiled with CFR 0.150.
 */
package d.b.a.b;

import d.a.c;
import d.b.a.b.a.b;
import java.util.ArrayList;

public class a
implements d.a.a {
    private c[] a;
    private d.a.b b;

    public c[] a() {
        if (this.a == null) {
            ArrayList<d.b.a.b.a.a> arrayList = new ArrayList<d.b.a.b.a.a>();
            int n2 = new Integer(d.c.a.b("sysctl -n hw.logicalcpu"));
            for (int i2 = 0; i2 < n2; ++i2) {
                arrayList.add(new d.b.a.b.a.a());
            }
            this.a = arrayList.toArray(new c[0]);
        }
        return this.a;
    }

    public d.a.b b() {
        if (this.b == null) {
            this.b = new b();
        }
        return this.b;
    }
}

