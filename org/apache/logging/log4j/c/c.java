/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.c;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.c.d;
import org.apache.logging.log4j.c.j;

public class c
implements j {
    private final boolean a;
    private final ThreadLocal b = new d(this);

    public c(boolean bl2) {
        this.a = bl2;
    }

    @Override
    public void a(String string, String string2) {
        if (!this.a) {
            return;
        }
        HashMap<String, String> hashMap = (HashMap<String, String>)this.b.get();
        hashMap = hashMap == null ? new HashMap<String, String>() : new HashMap(hashMap);
        hashMap.put(string, string2);
        this.b.set(Collections.unmodifiableMap(hashMap));
    }

    @Override
    public String a(String string) {
        Map map = (Map)this.b.get();
        return map == null ? null : (String)map.get(string);
    }

    @Override
    public void b(String string) {
        Map map = (Map)this.b.get();
        if (map != null) {
            HashMap hashMap = new HashMap(map);
            hashMap.remove(string);
            this.b.set(Collections.unmodifiableMap(hashMap));
        }
    }

    @Override
    public void a() {
        this.b.remove();
    }

    @Override
    public boolean c(String string) {
        Map map = (Map)this.b.get();
        return map != null && map.containsKey(string);
    }

    @Override
    public Map b() {
        Map map = (Map)this.b.get();
        return map == null ? new HashMap() : new HashMap(map);
    }

    @Override
    public Map c() {
        return (Map)this.b.get();
    }

    @Override
    public boolean d() {
        Map map = (Map)this.b.get();
        return map == null || map.size() == 0;
    }

    public String toString() {
        Map map = (Map)this.b.get();
        return map == null ? "{}" : map.toString();
    }

    static /* synthetic */ boolean a(c c2) {
        return c2.a;
    }
}

