/*
 * Decompiled with CFR 0.150.
 */
package b.a;

import java.util.Map;
import java.util.TreeMap;

public class a {
    private String a;
    private Object b;
    private final Map c = new TreeMap();
    private int d;

    public boolean a(String string) {
        return this.b(string) != null;
    }

    public Object b(String string) {
        char[] arrc = b.a.a.d(string);
        a a2 = this;
        for (char c2 : arrc) {
            a2 = (a)a2.c.get(Character.valueOf(c2));
            if (a2 != null) continue;
            return null;
        }
        return a2.b;
    }

    public void a(String string, Object object) {
        if (object == null) {
            throw new NullPointerException();
        }
        if (string.length() == 0) {
            throw new IllegalArgumentException();
        }
        char[] arrc = b.a.a.d(string);
        this.a(arrc, object, 0, arrc.length);
    }

    public void a(Iterable iterable, Object object) {
        for (String string : iterable) {
            this.a(string, object);
        }
    }

    private boolean a(char[] arrc, Object object, int n2, int n3) {
        boolean bl2;
        if (n2 == n3) {
            this.b = object;
            boolean bl3 = this.a != null;
            this.a = new String(arrc);
            return !bl3;
        }
        char c2 = arrc[n2];
        a a2 = (a)this.c.get(Character.valueOf(c2));
        if (a2 == null) {
            a2 = new a();
            this.c.put(Character.valueOf(c2), a2);
        }
        if (bl2 = a2.a(arrc, object, n2 + 1, n3)) {
            ++this.d;
        }
        if (this.a == null) {
            this.b = this.d > 1 ? null : object;
        }
        return bl2;
    }

    public void c(String string) {
        if (string.length() == 0) {
            throw new IllegalArgumentException();
        }
        char[] arrc = b.a.a.d(string);
        this.a(arrc, 0, arrc.length);
    }

    private boolean a(char[] arrc, int n2, int n3) {
        if (n2 == n3) {
            return this.c();
        }
        char c2 = arrc[n2];
        a a2 = (a)this.c.get(Character.valueOf(c2));
        if (a2 == null || !a2.a(arrc, n2 + 1, n3)) {
            return false;
        }
        --this.d;
        if (a2.d == 0) {
            this.c.remove(Character.valueOf(c2));
        }
        if (this.d == 1 && this.a == null) {
            this.b();
        }
        return true;
    }

    private void b() {
        Map.Entry entry = this.c.entrySet().iterator().next();
        a a2 = (a)entry.getValue();
        this.b = a2.b;
    }

    private boolean c() {
        if (this.a == null) {
            return false;
        }
        this.a = null;
        if (this.d == 1) {
            this.b();
        } else {
            this.b = null;
        }
        return true;
    }

    public Map a() {
        TreeMap treeMap = new TreeMap();
        this.a(treeMap);
        return treeMap;
    }

    private void a(Map map) {
        if (this.a != null) {
            map.put(this.a, this.b);
        }
        for (a a2 : this.c.values()) {
            a2.a(map);
        }
    }

    private static char[] d(String string) {
        char[] arrc = new char[string.length()];
        string.getChars(0, string.length(), arrc, 0);
        return arrc;
    }
}

