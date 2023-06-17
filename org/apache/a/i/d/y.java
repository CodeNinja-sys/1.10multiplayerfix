/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.d;

import java.util.ArrayList;
import org.apache.a.ag;
import org.apache.a.g;
import org.apache.a.k.c;
import org.apache.a.k.n;
import org.apache.a.k.x;
import org.apache.a.n.f;
import org.apache.a.o.a;
import org.apache.a.o.d;

public class y {
    public static final y a = new y();

    public g a(d d2, x x2) {
        org.apache.a.o.a.a(d2, "Char array buffer");
        org.apache.a.o.a.a(x2, "Parser cursor");
        ag ag2 = this.b(d2, x2);
        ArrayList<ag> arrayList = new ArrayList<ag>();
        while (!x2.d()) {
            ag ag3 = this.b(d2, x2);
            arrayList.add(ag3);
        }
        return new c(ag2.a(), ag2.b(), arrayList.toArray(new ag[arrayList.size()]));
    }

    private ag b(d d2, x x2) {
        int n2;
        char c2;
        int n3;
        boolean bl2 = false;
        int n4 = x2.c();
        int n5 = x2.b();
        String string = null;
        for (n3 = x2.c(); n3 < n5 && (c2 = d2.a(n3)) != '='; ++n3) {
            if (c2 != ';') continue;
            bl2 = true;
            break;
        }
        if (n3 == n5) {
            bl2 = true;
            string = d2.b(n4, n5);
        } else {
            string = d2.b(n4, n3);
            ++n3;
        }
        if (bl2) {
            x2.a(n3);
            return new n(string, null);
        }
        String string2 = null;
        int n6 = n3;
        while (n3 < n5) {
            n2 = d2.a(n3);
            if (n2 == 59) {
                bl2 = true;
                break;
            }
            ++n3;
        }
        n2 = n3;
        while (n6 < n2 && f.a(d2.a(n6))) {
            ++n6;
        }
        while (n2 > n6 && f.a(d2.a(n2 - 1))) {
            --n2;
        }
        string2 = d2.a(n6, n2);
        if (bl2) {
            ++n3;
        }
        x2.a(n3);
        return new n(string, string2);
    }
}

