/*
 * Decompiled with CFR 0.150.
 */
package d;

import com.sun.jna.ax;
import d.b.a.a.a;

public class b {
    private d.b.a.a a = null;
    private d.a.a b = null;
    private d.a c = ax.e() ? d.a.a : (ax.c() ? d.a.b : (ax.b() ? d.a.c : d.a.d));

    public d.b.a.a a() {
        if (this.a == null) {
            switch (this.c) {
                case a: {
                    this.a = new d.b.a.c.b();
                    break;
                }
                case b: {
                    this.a = new d.b.a.a.b();
                    break;
                }
                case c: {
                    this.a = new d.b.a.b.b();
                    break;
                }
                default: {
                    throw new RuntimeException("Operating system not supported: " + ax.a());
                }
            }
        }
        return this.a;
    }

    public d.a.a b() {
        if (this.b == null) {
            switch (this.c) {
                case a: {
                    this.b = new d.b.a.c.a();
                    break;
                }
                case b: {
                    this.b = new a();
                    break;
                }
                case c: {
                    this.b = new d.b.a.b.a();
                    break;
                }
                default: {
                    throw new RuntimeException("Operating system not supported: " + ax.a());
                }
            }
        }
        return this.b;
    }
}

