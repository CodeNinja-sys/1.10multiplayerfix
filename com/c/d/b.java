/*
 * Decompiled with CFR 0.150.
 */
package com.c.d;

import com.a.b.an;
import com.a.b.d.a;
import com.a.b.d.e;
import java.util.UUID;

public class b
extends an {
    public void a(e e2, UUID uUID) {
        e2.b(b.a(uUID));
    }

    public UUID b(a a2) {
        return b.b(a2.h());
    }

    public static String a(UUID uUID) {
        return uUID.toString().replace("-", "");
    }

    public static UUID b(String string) {
        return UUID.fromString(string.replaceFirst("(\\w{8})(\\w{4})(\\w{4})(\\w{4})(\\w{12})", "$1-$2-$3-$4-$5"));
    }

    @Override
    public /* synthetic */ Object a(a a2) {
        return this.b(a2);
    }
}

