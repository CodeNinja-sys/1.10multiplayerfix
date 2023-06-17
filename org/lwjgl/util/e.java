/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util;

import java.util.Comparator;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.util.d;

class e
implements Comparator {
    final d[] a;
    final /* synthetic */ String[] b;

    e(String[] arrstring) {
        this.b = arrstring;
        this.a = new d[this.b.length];
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            int n2 = this.b[i2].indexOf(61);
            this.a[i2] = n2 > 0 ? new d(this.b[i2].substring(0, n2), 0, Integer.parseInt(this.b[i2].substring(n2 + 1, this.b[i2].length())), true) : (this.b[i2].charAt(0) == '-' ? new d(this.b[i2].substring(1), -1, 0, false) : new d(this.b[i2], 1, 0, false));
        }
    }

    public int a(DisplayMode displayMode, DisplayMode displayMode2) {
        for (d d2 : this.a) {
            int n2 = d2.a(displayMode);
            int n3 = d2.a(displayMode2);
            if (d2.d && n2 != n3) {
                int n4;
                if (n2 == d2.c) {
                    return -1;
                }
                if (n3 == d2.c) {
                    return 1;
                }
                int n5 = Math.abs(n2 - d2.c);
                if (n5 < (n4 = Math.abs(n3 - d2.c))) {
                    return -1;
                }
                if (n5 <= n4) continue;
                return 1;
            }
            if (n2 < n3) {
                return d2.b;
            }
            if (n2 == n3) continue;
            return -d2.b;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((DisplayMode)object, (DisplayMode)object2);
    }
}

