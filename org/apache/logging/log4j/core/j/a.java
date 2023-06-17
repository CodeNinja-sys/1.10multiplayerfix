/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.j;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.logging.log4j.core.j.e;
import org.apache.logging.log4j.core.k;

public class a
implements e {
    private static final k a = new k("Default");

    @Override
    public k a(String string, ClassLoader classLoader, boolean bl2) {
        k k2 = (k)org.apache.logging.log4j.core.e.a.a.get();
        return k2 != null ? k2 : a;
    }

    @Override
    public k a(String string, ClassLoader classLoader, boolean bl2, URI uRI) {
        k k2 = (k)org.apache.logging.log4j.core.e.a.a.get();
        return k2 != null ? k2 : a;
    }

    public k a(String string, String string2) {
        return a;
    }

    @Override
    public void a(k k2) {
    }

    @Override
    public List a() {
        ArrayList<k> arrayList = new ArrayList<k>();
        arrayList.add(a);
        return Collections.unmodifiableList(arrayList);
    }
}

