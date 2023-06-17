/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a.b;

import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.a.j;
import org.apache.logging.log4j.a.m;
import org.apache.logging.log4j.core.a.b.c;
import org.apache.logging.log4j.core.a.b.f;
import org.apache.logging.log4j.core.d.o;
import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.d;

public final class a
implements f {
    protected static final d a = org.apache.logging.log4j.d.d.k();
    private final Map b;
    private final c c;

    private a(Map map, c c2) {
        this.b = map;
        this.c = c2;
    }

    @Override
    public h a(h h2) {
        m m2 = h2.d();
        if (m2 == null || !(m2 instanceof j)) {
            return h2;
        }
        HashMap hashMap = new HashMap(((j)m2).f());
        switch (this.c) {
            case a: {
                hashMap.putAll(this.b);
                break;
            }
            default: {
                for (Map.Entry entry : this.b.entrySet()) {
                    if (!hashMap.containsKey(entry.getKey())) continue;
                    hashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        j j2 = ((j)m2).b(hashMap);
        if (h2 instanceof org.apache.logging.log4j.core.e.d) {
            Map.Entry entry;
            entry = (org.apache.logging.log4j.core.e.d)h2;
            return org.apache.logging.log4j.core.e.d.a(((org.apache.logging.log4j.core.e.d)((Object)entry)).b(), ((org.apache.logging.log4j.core.e.d)((Object)entry)).e(), ((org.apache.logging.log4j.core.e.d)((Object)entry)).k(), ((org.apache.logging.log4j.core.e.d)((Object)entry)).a(), j2, ((org.apache.logging.log4j.core.e.d)((Object)entry)).n(), ((org.apache.logging.log4j.core.e.d)((Object)entry)).i(), ((org.apache.logging.log4j.core.e.d)((Object)entry)).j(), ((org.apache.logging.log4j.core.e.d)((Object)entry)).f(), ((org.apache.logging.log4j.core.e.d)((Object)entry)).c(), ((org.apache.logging.log4j.core.e.d)((Object)entry)).g());
        }
        return new org.apache.logging.log4j.core.e.d(h2.b(), h2.e(), h2.k(), h2.a(), (m)j2, h2.h(), h2.i(), h2.j(), h2.f(), h2.c(), h2.g());
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("mode=").append((Object)this.c);
        stringBuilder.append(" {");
        boolean bl2 = true;
        for (Map.Entry entry : this.b.entrySet()) {
            if (!bl2) {
                stringBuilder.append(", ");
            }
            stringBuilder.append((String)entry.getKey()).append("=").append((String)entry.getValue());
            bl2 = false;
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static a a(String string, o[] arro) {
        c c2;
        if (string == null) {
            c2 = org.apache.logging.log4j.core.a.b.c.a;
        } else {
            c2 = org.apache.logging.log4j.core.a.b.c.valueOf(string);
            if (c2 == null) {
                a.b("Undefined mode " + string);
                return null;
            }
        }
        if (arro == null || arro.length == 0) {
            a.b("keys and values must be specified for the MapRewritePolicy");
            return null;
        }
        HashMap<String, String> hashMap = new HashMap<String, String>();
        for (o o2 : arro) {
            String string2 = o2.a();
            if (string2 == null) {
                a.b("A null key is not valid in MapRewritePolicy");
                continue;
            }
            String string3 = o2.b();
            if (string3 == null) {
                a.b("A null value for key " + string2 + " is not allowed in MapRewritePolicy");
                continue;
            }
            hashMap.put(o2.a(), o2.b());
        }
        if (hashMap.size() == 0) {
            a.b("MapRewritePolicy is not configured with any valid key value pairs");
            return null;
        }
        return new a(hashMap, c2);
    }
}

