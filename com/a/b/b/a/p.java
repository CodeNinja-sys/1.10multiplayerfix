/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b.a;

import com.a.b.an;
import com.a.b.ap;
import com.a.b.b.a.q;
import com.a.b.b.a.r;
import com.a.b.b.a.s;
import com.a.b.b.ae;
import com.a.b.b.af;
import com.a.b.b.b;
import com.a.b.b.f;
import com.a.b.c.a;
import com.a.b.j;
import com.a.b.k;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;

public final class p
implements ap {
    private final f a;
    private final j b;
    private final com.a.b.b.s c;

    public p(f f2, j j2, com.a.b.b.s s2) {
        this.a = f2;
        this.b = j2;
        this.c = s2;
    }

    public boolean a(Field field, boolean bl2) {
        return !this.c.a(field.getType(), bl2) && !this.c.a(field, bl2);
    }

    private String a(Field field) {
        com.a.b.a.b b2 = field.getAnnotation(com.a.b.a.b.class);
        return b2 == null ? this.b.a(field) : b2.a();
    }

    public an a(k k2, a a2) {
        Class class_ = a2.a();
        if (!Object.class.isAssignableFrom(class_)) {
            return null;
        }
        ae ae2 = this.a.a(a2);
        return new r(ae2, this.a(k2, a2, class_), null);
    }

    private s a(k k2, Field field, String string, a a2, boolean bl2, boolean bl3) {
        boolean bl4 = af.a((Type)a2.a());
        return new q(this, string, bl2, bl3, k2, a2, field, bl4);
    }

    private Map a(k k2, a a2, Class class_) {
        LinkedHashMap<String, s> linkedHashMap = new LinkedHashMap<String, s>();
        if (class_.isInterface()) {
            return linkedHashMap;
        }
        Type type = a2.b();
        while (class_ != Object.class) {
            Field[] arrfield;
            for (Field field : arrfield = class_.getDeclaredFields()) {
                boolean bl2 = this.a(field, true);
                boolean bl3 = this.a(field, false);
                if (!bl2 && !bl3) continue;
                field.setAccessible(true);
                Type type2 = com.a.b.b.b.a(a2.b(), class_, field.getGenericType());
                s s2 = this.a(k2, field, this.a(field), com.a.b.c.a.b(type2), bl2, bl3);
                s s3 = linkedHashMap.put(s2.g, s2);
                if (s3 == null) continue;
                throw new IllegalArgumentException(type + " declares multiple JSON fields named " + s3.g);
            }
            a2 = com.a.b.c.a.b(com.a.b.b.b.a(a2.b(), class_, class_.getGenericSuperclass()));
            class_ = a2.a();
        }
        return linkedHashMap;
    }
}

