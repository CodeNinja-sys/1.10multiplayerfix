/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a.a.a;

import java.util.ArrayList;
import org.apache.logging.log4j.core.a.a.a.a;
import org.apache.logging.log4j.core.a.a.a.h;
import org.apache.logging.log4j.core.a.a.a.i;
import org.apache.logging.log4j.core.a.a.a.j;
import org.apache.logging.log4j.core.a.a.a.k;
import org.apache.logging.log4j.core.a.x;

final class l
implements x {
    private l() {
    }

    public h a(String string, k k2) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        ArrayList<j> arrayList = new ArrayList<j>();
        int n2 = 0;
        for (a a2 : k.a(k2)) {
            if (n2++ > 0) {
                stringBuilder.append(',');
                stringBuilder2.append(',');
            }
            stringBuilder.append(a2.a());
            if (a2.c() != null) {
                stringBuilder2.append(a2.c());
                continue;
            }
            arrayList.add(new j(a2.b(), a2.d(), a2.e(), a2.f(), null));
            stringBuilder2.append('?');
        }
        String string2 = "INSERT INTO " + k.b(k2) + " (" + stringBuilder + ") VALUES (" + stringBuilder2 + ")";
        return new h(string, k2.a(), k.c(k2), string2, arrayList, null);
    }

    /* synthetic */ l(i i2) {
        this();
    }
}

