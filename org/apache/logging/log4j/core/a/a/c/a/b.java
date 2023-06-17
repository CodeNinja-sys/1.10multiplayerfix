/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a.a.c.a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.core.a.a.c.g;

public final class b
implements g {
    private final Map a = new HashMap();

    @Override
    public void a(String string, Object object) {
        this.a.put(string, object);
    }

    @Override
    public void a(String string, g g2) {
        this.a.put(string, g2.a());
    }

    @Override
    public void a(String string, Object[] arrobject) {
        this.a.put(string, Arrays.asList(arrobject));
    }

    @Override
    public void a(String string, g[] arrg) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        for (g g2 : arrg) {
            arrayList.add(g2.a());
        }
        this.a.put(string, arrayList);
    }

    public Map b() {
        return this.a;
    }

    @Override
    public /* synthetic */ Object a() {
        return this.b();
    }
}

