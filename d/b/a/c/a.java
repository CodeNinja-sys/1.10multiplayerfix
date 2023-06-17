/*
 * Decompiled with CFR 0.150.
 */
package d.b.a.c;

import com.sun.jna.a.d.hi;
import d.a.c;
import d.b.a.c.a.b;
import java.util.ArrayList;

public class a
implements d.a.a {
    private c[] a = null;
    private d.a.b b = null;

    public d.a.b b() {
        if (this.b == null) {
            this.b = new b();
        }
        return this.b;
    }

    public c[] a() {
        if (this.a == null) {
            String[] arrstring;
            String string = "HARDWARE\\DESCRIPTION\\System\\CentralProcessor";
            ArrayList<d.b.a.c.a.a> arrayList = new ArrayList<d.b.a.c.a.a>();
            for (String string2 : arrstring = com.sun.jna.a.d.b.e(hi.i, "HARDWARE\\DESCRIPTION\\System\\CentralProcessor")) {
                String string3 = "HARDWARE\\DESCRIPTION\\System\\CentralProcessor\\" + string2;
                d.b.a.c.a.a a2 = new d.b.a.c.a.a();
                a2.c(com.sun.jna.a.d.b.b(hi.i, string3, "Identifier"));
                a2.b(com.sun.jna.a.d.b.b(hi.i, string3, "ProcessorNameString"));
                a2.a(com.sun.jna.a.d.b.b(hi.i, string3, "VendorIdentifier"));
                arrayList.add(a2);
            }
            this.a = arrayList.toArray(new c[0]);
        }
        return this.a;
    }
}

