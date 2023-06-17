/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.c;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.a.m;
import org.apache.logging.log4j.b;
import org.apache.logging.log4j.core.c.h;
import org.apache.logging.log4j.core.d.o;
import org.apache.logging.log4j.core.e;
import org.apache.logging.log4j.f;
import org.apache.logging.log4j.i;

public class l
extends h {
    private final String d;
    private final String e;
    private final boolean f;

    public l(Map map, boolean bl2, e e2, e e3) {
        super(map, bl2, e2, e3);
        if (map.size() == 1) {
            Iterator iterator = map.entrySet().iterator();
            Map.Entry entry = iterator.next();
            if (((List)entry.getValue()).size() == 1) {
                this.d = (String)entry.getKey();
                this.e = (String)((List)entry.getValue()).get(0);
                this.f = false;
            } else {
                this.d = null;
                this.e = null;
                this.f = true;
            }
        } else {
            this.d = null;
            this.e = null;
            this.f = true;
        }
    }

    @Override
    public e a(org.apache.logging.log4j.core.i i2, b b2, f f2, String string, Object ... arrobject) {
        return this.h();
    }

    @Override
    public e a(org.apache.logging.log4j.core.i i2, b b2, f f2, Object object, Throwable throwable) {
        return this.h();
    }

    @Override
    public e a(org.apache.logging.log4j.core.i i2, b b2, f f2, m m2, Throwable throwable) {
        return this.h();
    }

    private e h() {
        boolean bl2 = false;
        if (this.f) {
            for (Map.Entry entry : this.d().entrySet()) {
                String string = i.a((String)entry.getKey());
                bl2 = string != null ? ((List)entry.getValue()).contains(string) : false;
                if ((this.c() || !bl2) && (!this.c() || bl2)) continue;
                break;
            }
        } else {
            bl2 = this.e.equals(i.a(this.d));
        }
        return bl2 ? this.b : this.c;
    }

    @Override
    public e a(org.apache.logging.log4j.core.h h2) {
        return super.a(h2.i()) ? this.b : this.c;
    }

    public static l b(o[] arro, String string, String string2, String string3) {
        if (arro == null || arro.length == 0) {
            a.b("key and value pairs must be specified for the ThreadContextMapFilter");
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
            a.b("ThreadContextMapFilter is not configured with any valid key value pairs");
            return null;
        }
        boolean bl2 = string == null || !string.equalsIgnoreCase("or");
        e e2 = org.apache.logging.log4j.core.e.a(string2);
        e e3 = org.apache.logging.log4j.core.e.a(string3);
        return new l(hashMap, bl2, e2, e3);
    }
}

