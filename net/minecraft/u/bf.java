/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import com.a.a.d.sz;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class bf
implements Map {
    private final Map a = sz.d();

    @Override
    public int size() {
        return this.a.size();
    }

    @Override
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public boolean containsKey(Object object) {
        return this.a.containsKey(object.toString().toLowerCase());
    }

    @Override
    public boolean containsValue(Object object) {
        return this.a.containsKey(object);
    }

    public Object get(Object object) {
        return this.a.get(object.toString().toLowerCase());
    }

    public Object a(String string, Object object) {
        return this.a.put(string.toLowerCase(), object);
    }

    public Object remove(Object object) {
        return this.a.remove(object.toString().toLowerCase());
    }

    public void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.a((String)entry.getKey(), entry.getValue());
        }
    }

    @Override
    public void clear() {
        this.a.clear();
    }

    public Set keySet() {
        return this.a.keySet();
    }

    public Collection values() {
        return this.a.values();
    }

    public Set entrySet() {
        return this.a.entrySet();
    }

    public /* synthetic */ Object put(Object object, Object object2) {
        return this.a((String)object, object2);
    }
}

