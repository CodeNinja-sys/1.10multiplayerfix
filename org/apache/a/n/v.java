/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.n;

import java.util.List;
import org.apache.a.n.g;
import org.apache.a.n.k;
import org.apache.a.n.r;
import org.apache.a.n.s;
import org.apache.a.u;
import org.apache.a.w;
import org.apache.a.x;
import org.apache.a.z;

public final class v
implements k {
    private final w[] a;
    private final z[] b;

    public v(w[] arrw, z[] arrz) {
        int n2;
        if (arrw != null) {
            n2 = arrw.length;
            this.a = new w[n2];
            System.arraycopy(arrw, 0, this.a, 0, n2);
        } else {
            this.a = new w[0];
        }
        if (arrz != null) {
            n2 = arrz.length;
            this.b = new z[n2];
            System.arraycopy(arrz, 0, this.b, 0, n2);
        } else {
            this.b = new z[0];
        }
    }

    public v(List list, List list2) {
        int n2;
        if (list != null) {
            n2 = list.size();
            this.a = list.toArray(new w[n2]);
        } else {
            this.a = new w[0];
        }
        if (list2 != null) {
            n2 = list2.size();
            this.b = list2.toArray(new z[n2]);
        } else {
            this.b = new z[0];
        }
    }

    public v(r r2, s s2) {
        int n2;
        int n3;
        if (r2 != null) {
            n3 = r2.a();
            this.a = new w[n3];
            for (n2 = 0; n2 < n3; ++n2) {
                this.a[n2] = r2.a(n2);
            }
        } else {
            this.a = new w[0];
        }
        if (s2 != null) {
            n3 = s2.c();
            this.b = new z[n3];
            for (n2 = 0; n2 < n3; ++n2) {
                this.b[n2] = s2.b(n2);
            }
        } else {
            this.b = new z[0];
        }
    }

    public v(w ... arrw) {
        this(arrw, (z[])null);
    }

    public v(z ... arrz) {
        this((w[])null, arrz);
    }

    public void a(u u2, g g2) {
        for (w w2 : this.a) {
            w2.a(u2, g2);
        }
    }

    public void a(x x2, g g2) {
        for (z z2 : this.b) {
            z2.a(x2, g2);
        }
    }
}

