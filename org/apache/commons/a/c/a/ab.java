/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.c.a;

import java.util.Comparator;
import org.apache.commons.a.c.a.aa;

final class ab
implements Comparator {
    ab() {
    }

    public int a(aa aa2, aa aa3) {
        for (int i2 = 0; i2 < aa.b(aa2).length(); ++i2) {
            if (i2 >= aa.b(aa3).length()) {
                return 1;
            }
            int n2 = aa.b(aa2).charAt(i2) - aa.b(aa3).charAt(i2);
            if (n2 == 0) continue;
            return n2;
        }
        if (aa.b(aa2).length() < aa.b(aa3).length()) {
            return -1;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((aa)object, (aa)object2);
    }
}

