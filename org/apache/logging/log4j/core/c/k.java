/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.c;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.a.m;
import org.apache.logging.log4j.a.y;
import org.apache.logging.log4j.b;
import org.apache.logging.log4j.core.c.h;
import org.apache.logging.log4j.core.d.o;
import org.apache.logging.log4j.core.e;
import org.apache.logging.log4j.core.i;
import org.apache.logging.log4j.f;

public final class k
extends h {
    private k(Map map, boolean bl2, e e2, e e3) {
        super(map, bl2, e2, e3);
    }

    @Override
    public e a(i i2, b b2, f f2, m m2, Throwable throwable) {
        if (m2 instanceof y) {
            return this.a((y)m2);
        }
        return e.b;
    }

    @Override
    public e a(org.apache.logging.log4j.core.h h2) {
        m m2 = h2.d();
        if (m2 instanceof y) {
            return this.a((y)m2);
        }
        return super.a(h2);
    }

    protected e a(y y2) {
        boolean bl2 = false;
        for (Map.Entry entry : this.d().entrySet()) {
            String string = this.a(y2, (String)entry.getKey());
            bl2 = string != null ? ((List)entry.getValue()).contains(string) : false;
            if ((this.c() || !bl2) && (!this.c() || bl2)) continue;
            break;
        }
        return bl2 ? this.b : this.c;
    }

    private String a(y y2, String string) {
        if (string.equalsIgnoreCase("id")) {
            return y2.i().toString();
        }
        if (string.equalsIgnoreCase("id.name")) {
            return y2.i().c();
        }
        if (string.equalsIgnoreCase("type")) {
            return y2.j();
        }
        if (string.equalsIgnoreCase("message")) {
            return y2.a();
        }
        return (String)y2.f().get(string);
    }

    public static k b(o[] arro, String string, String string2, String string3) {
        if (arro == null || arro.length == 0) {
            a.b("keys and values must be specified for the StructuredDataFilter");
            return null;
        }
        HashMap<String, ArrayList<String>> hashMap = new HashMap<String, ArrayList<String>>();
        for (o o2 : arro) {
            String string4 = o2.a();
            if (string4 == null) {
                a.b("A null key is not valid in MapFilter");
                continue;
            }
            String string5 = o2.b();
            if (string5 == null) {
                a.b("A null value for key " + string4 + " is not allowed in MapFilter");
                continue;
            }
            ArrayList<String> arrayList = (ArrayList<String>)hashMap.get(o2.a());
            if (arrayList != null) {
                arrayList.add(string5);
                continue;
            }
            arrayList = new ArrayList<String>();
            arrayList.add(string5);
            hashMap.put(o2.a(), arrayList);
        }
        if (hashMap.size() == 0) {
            a.b("StructuredDataFilter is not configured with any valid key value pairs");
            return null;
        }
        boolean bl2 = string == null || !string.equalsIgnoreCase("or");
        e e2 = e.a(string2);
        e e3 = e.a(string3);
        return new k(hashMap, bl2, e2, e3);
    }
}

