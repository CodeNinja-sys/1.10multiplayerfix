/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.c;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.a.j;
import org.apache.logging.log4j.a.m;
import org.apache.logging.log4j.b;
import org.apache.logging.log4j.core.c.a;
import org.apache.logging.log4j.core.d.o;
import org.apache.logging.log4j.core.e;
import org.apache.logging.log4j.core.i;
import org.apache.logging.log4j.f;

public class h
extends a {
    private final Map d;
    private final boolean e;

    protected h(Map map, boolean bl2, e e2, e e3) {
        super(e2, e3);
        if (map == null) {
            throw new NullPointerException("key cannot be null");
        }
        this.e = bl2;
        this.d = map;
    }

    @Override
    public e a(i i2, b b2, f f2, m m2, Throwable throwable) {
        if (m2 instanceof j) {
            return this.a(((j)m2).f()) ? this.b : this.c;
        }
        return org.apache.logging.log4j.core.e.b;
    }

    @Override
    public e a(org.apache.logging.log4j.core.h h2) {
        m m2 = h2.d();
        if (m2 instanceof j) {
            return this.a(((j)m2).f()) ? this.b : this.c;
        }
        return org.apache.logging.log4j.core.e.b;
    }

    protected boolean a(Map map) {
        boolean bl2 = false;
        for (Map.Entry entry : this.d.entrySet()) {
            String string = (String)map.get(entry.getKey());
            bl2 = string != null ? ((List)entry.getValue()).contains(string) : false;
            if ((this.e || !bl2) && (!this.e || bl2)) continue;
            break;
        }
        return bl2;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("isAnd=").append(this.e);
        if (this.d.size() > 0) {
            stringBuilder.append(", {");
            boolean bl2 = true;
            for (Map.Entry entry : this.d.entrySet()) {
                if (!bl2) {
                    stringBuilder.append(", ");
                }
                bl2 = false;
                List list = (List)entry.getValue();
                String string = list.size() > 1 ? (String)list.get(0) : list.toString();
                stringBuilder.append((String)entry.getKey()).append("=").append(string);
            }
            stringBuilder.append("}");
        }
        return stringBuilder.toString();
    }

    protected boolean c() {
        return this.e;
    }

    protected Map d() {
        return this.d;
    }

    public static h a(o[] arro, String string, String string2, String string3) {
        if (arro == null || arro.length == 0) {
            a.b("keys and values must be specified for the MapFilter");
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
            a.b("MapFilter is not configured with any valid key value pairs");
            return null;
        }
        boolean bl2 = string == null || !string.equalsIgnoreCase("or");
        e e2 = org.apache.logging.log4j.core.e.a(string2);
        e e3 = org.apache.logging.log4j.core.e.a(string3);
        return new h(hashMap, bl2, e2, e3);
    }
}

