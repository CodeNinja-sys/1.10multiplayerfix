/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.b;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.logging.log4j.core.b.k;
import org.apache.logging.log4j.core.j.e;

public class l
implements e {
    private static final k a = new k("AsyncLoggerContext");

    @Override
    public org.apache.logging.log4j.core.k a(String string, ClassLoader classLoader, boolean bl2) {
        return a;
    }

    @Override
    public List a() {
        ArrayList<k> arrayList = new ArrayList<k>();
        arrayList.add(a);
        return Collections.unmodifiableList(arrayList);
    }

    @Override
    public org.apache.logging.log4j.core.k a(String string, ClassLoader classLoader, boolean bl2, URI uRI) {
        return a;
    }

    @Override
    public void a(org.apache.logging.log4j.core.k k2) {
    }
}

