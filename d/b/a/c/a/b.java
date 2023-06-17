/*
 * Decompiled with CFR 0.150.
 */
package d.b.a.c.a;

import com.sun.jna.a.d.ac;
import com.sun.jna.a.d.dy;
import com.sun.jna.a.d.ec;

public class b
implements d.a.b {
    ec a = new ec();

    public b() {
        if (!ac.g.a(this.a)) {
            throw new dy(ac.g.f());
        }
    }

    public long b() {
        return this.a.F.longValue();
    }

    public long a() {
        return this.a.c.longValue();
    }
}

