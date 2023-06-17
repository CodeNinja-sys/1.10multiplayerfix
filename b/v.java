/*
 * Decompiled with CFR 0.150.
 */
package b;

import b.a;
import b.a.f;
import b.j;
import b.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

public class v {
    private final List a = new ArrayList();
    private final Map b = new HashMap();
    private final Map c = new IdentityHashMap();
    private final Map d;
    private final Map e;

    v(Map map) {
        this.e = v.a(map);
        this.d = map;
    }

    public boolean a() {
        return !this.b.isEmpty();
    }

    public boolean a(String string) {
        return this.b.containsKey(string);
    }

    public boolean a(w w2) {
        return this.c.containsKey(w2);
    }

    public boolean b(String string) {
        a a2 = (a)this.b.get(string);
        return a2 != null && this.b(a2);
    }

    public boolean b(w w2) {
        f.a(w2);
        List list = (List)this.c.get(w2);
        return list != null && !list.isEmpty();
    }

    public Object c(String string) {
        f.a(string);
        a a2 = (a)this.b.get(string);
        if (a2 == null) {
            List list = this.e(string);
            return list.isEmpty() ? null : list.get(0);
        }
        return this.c(a2);
    }

    public Object c(w w2) {
        f.a(w2);
        List list = this.d(w2);
        switch (list.size()) {
            case 0: {
                return null;
            }
            case 1: {
                return list.get(0);
            }
        }
        throw new j(w2.a());
    }

    public List d(String string) {
        f.a(string);
        a a2 = (a)this.b.get(string);
        return a2 == null ? this.e(string) : this.d(a2);
    }

    public List d(w w2) {
        f.a(w2);
        List list = (List)this.c.get(w2);
        if (list == null || list.isEmpty()) {
            return this.e(w2);
        }
        a a2 = (a)w2;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        for (String string : list) {
            arrayList.add(a2.a(string));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public List b() {
        List list = this.a;
        list.remove(this.b.get("[arguments]"));
        return Collections.unmodifiableList(list);
    }

    public Map c() {
        HashMap<a, List> hashMap = new HashMap<a, List>();
        for (a a2 : this.d.values()) {
            if (a2.e()) continue;
            hashMap.put(a2, this.d(a2));
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public List d() {
        return Collections.unmodifiableList(this.d((w)this.b.get("[arguments]")));
    }

    void a(a a2) {
        this.a(a2, null);
    }

    void a(a a2, String string) {
        this.a.add(a2);
        for (String string2 : a2.a()) {
            this.b.put(string2, a2);
        }
        List<String> list = (List)this.c.get(a2);
        if (list == null) {
            list = new ArrayList<String>();
            this.c.put(a2, list);
        }
        if (string != null) {
            list.add(string);
        }
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || !this.getClass().equals(object.getClass())) {
            return false;
        }
        v v2 = (v)object;
        HashMap hashMap = new HashMap(this.c);
        HashMap hashMap2 = new HashMap(v2.c);
        return ((Object)this.b).equals(v2.b) && ((Object)hashMap).equals(hashMap2);
    }

    public int hashCode() {
        HashMap hashMap = new HashMap(this.c);
        return ((Object)this.b).hashCode() ^ ((Object)hashMap).hashCode();
    }

    private List e(String string) {
        if (this.e.containsKey(string)) {
            return (List)this.e.get(string);
        }
        return Collections.emptyList();
    }

    private List e(w w2) {
        return this.e((String)w2.a().iterator().next());
    }

    private static Map a(Map map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            hashMap.put(entry.getKey(), ((a)entry.getValue()).m());
        }
        return hashMap;
    }
}

