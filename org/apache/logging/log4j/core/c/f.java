/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.c;

import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.a.m;
import org.apache.logging.log4j.b;
import org.apache.logging.log4j.core.c.a;
import org.apache.logging.log4j.core.d.o;
import org.apache.logging.log4j.core.e;
import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.i;

public final class f
extends a {
    private Map d = new HashMap();
    private b e = org.apache.logging.log4j.b.c;
    private final String f;

    private f(String string, Map map, b b2, e e2, e e3) {
        super(e2, e3);
        if (string == null) {
            throw new NullPointerException("key cannot be null");
        }
        this.f = string;
        this.d = map;
        this.e = b2;
    }

    public String c() {
        return this.f;
    }

    @Override
    public e a(org.apache.logging.log4j.core.i i2, b b2, org.apache.logging.log4j.f f2, String string, Object ... arrobject) {
        return this.a(b2);
    }

    @Override
    public e a(org.apache.logging.log4j.core.i i2, b b2, org.apache.logging.log4j.f f2, Object object, Throwable throwable) {
        return this.a(b2);
    }

    @Override
    public e a(org.apache.logging.log4j.core.i i2, b b2, org.apache.logging.log4j.f f2, m m2, Throwable throwable) {
        return this.a(b2);
    }

    @Override
    public e a(h h2) {
        return this.a(h2.a());
    }

    private e a(b b2) {
        String string = i.a(this.f);
        if (string != null) {
            b b3 = (b)((Object)this.d.get(string));
            if (b3 == null) {
                b3 = this.e;
            }
            return b2.a(b3) ? this.b : this.c;
        }
        return org.apache.logging.log4j.core.e.b;
    }

    public Map d() {
        return this.d;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("key=").append(this.f);
        stringBuilder.append(", default=").append((Object)this.e);
        if (this.d.size() > 0) {
            stringBuilder.append("{");
            boolean bl2 = true;
            for (Map.Entry entry : this.d.entrySet()) {
                if (!bl2) {
                    stringBuilder.append(", ");
                    bl2 = false;
                }
                stringBuilder.append((String)entry.getKey()).append("=").append(entry.getValue());
            }
            stringBuilder.append("}");
        }
        return stringBuilder.toString();
    }

    public static f a(String string, o[] arro, String string2, String string3, String string4) {
        e e2 = org.apache.logging.log4j.core.e.a(string3);
        e e3 = org.apache.logging.log4j.core.e.a(string4);
        HashMap<String, b> hashMap = new HashMap<String, b>();
        for (o o2 : arro) {
            hashMap.put(o2.a(), org.apache.logging.log4j.b.a(o2.b()));
        }
        b b2 = org.apache.logging.log4j.b.a(string2, org.apache.logging.log4j.b.c);
        return new f(string, hashMap, b2, e2, e3);
    }
}

