/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a.b;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.core.a.b.f;
import org.apache.logging.log4j.core.config.ab;
import org.apache.logging.log4j.core.h;

public final class d
implements f {
    protected static final org.apache.logging.log4j.d a = org.apache.logging.log4j.d.d.k();
    private final Map b;
    private final org.apache.logging.log4j.core.config.d c;

    private d(org.apache.logging.log4j.core.config.d d2, List list) {
        this.c = d2;
        this.b = new HashMap(list.size());
        for (ab ab2 : list) {
            Boolean bl2 = ab2.b().contains("${");
            this.b.put(ab2, bl2);
        }
    }

    @Override
    public h a(h h2) {
        HashMap<String, String> hashMap = new HashMap<String, String>(h2.i());
        for (Map.Entry entry : this.b.entrySet()) {
            ab ab2 = (ab)entry.getKey();
            hashMap.put(ab2.a(), (Boolean)entry.getValue() != false ? this.c.l().a(ab2.b()) : ab2.b());
        }
        return new org.apache.logging.log4j.core.e.d(h2.b(), h2.e(), h2.k(), h2.a(), h2.d(), h2.h(), hashMap, h2.j(), h2.f(), h2.c(), h2.g());
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" {");
        boolean bl2 = true;
        for (Map.Entry entry : this.b.entrySet()) {
            if (!bl2) {
                stringBuilder.append(", ");
            }
            ab ab2 = (ab)entry.getKey();
            stringBuilder.append(ab2.a()).append("=").append(ab2.b());
            bl2 = false;
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static d a(org.apache.logging.log4j.core.config.d d2, ab[] arrab) {
        if (arrab == null || arrab.length == 0) {
            a.b("Properties must be specified for the PropertiesRewritePolicy");
            return null;
        }
        List<ab> list = Arrays.asList(arrab);
        return new d(d2, list);
    }
}

