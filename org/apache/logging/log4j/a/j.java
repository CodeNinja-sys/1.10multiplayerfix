/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.a;

import java.util.Collections;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.apache.logging.log4j.a.l;
import org.apache.logging.log4j.a.q;
import org.apache.logging.log4j.e.a;

public class j
implements q {
    private static final long a = -5031471831131487120L;
    private final SortedMap b;

    public j() {
        this.b = new TreeMap();
    }

    public j(Map map) {
        this.b = map instanceof SortedMap ? (SortedMap)map : new TreeMap(map);
    }

    @Override
    public String[] e() {
        String[] arrstring = new String[l.values().length];
        int n2 = 0;
        for (l l2 : l.values()) {
            arrstring[n2++] = l2.name();
        }
        return arrstring;
    }

    @Override
    public Object[] c() {
        return this.b.values().toArray();
    }

    @Override
    public String b() {
        return "";
    }

    public Map f() {
        return Collections.unmodifiableMap(this.b);
    }

    public void g() {
        this.b.clear();
    }

    public void a(String string, String string2) {
        if (string2 == null) {
            throw new IllegalArgumentException("No value provided for key " + string);
        }
        this.b(string, string2);
        this.b.put(string, string2);
    }

    protected void b(String string, String string2) {
    }

    public void a(Map map) {
        this.b.putAll(map);
    }

    public String a(String string) {
        return (String)this.b.get(string);
    }

    public String b(String string) {
        return (String)this.b.remove(string);
    }

    public String h() {
        return this.a((l)null);
    }

    public String c(String string) {
        try {
            return this.a((l)org.apache.logging.log4j.e.a.a(l.class, string));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return this.h();
        }
    }

    private String a(l l2) {
        StringBuilder stringBuilder = new StringBuilder();
        if (l2 == null) {
            this.b(stringBuilder);
        } else {
            switch (l2) {
                case a: {
                    this.a(stringBuilder);
                    break;
                }
                case b: {
                    this.c(stringBuilder);
                    break;
                }
                case c: {
                    this.d(stringBuilder);
                    break;
                }
                default: {
                    this.b(stringBuilder);
                }
            }
        }
        return stringBuilder.toString();
    }

    public void a(StringBuilder stringBuilder) {
        stringBuilder.append("<Map>\n");
        for (Map.Entry entry : this.b.entrySet()) {
            stringBuilder.append("  <Entry key=\"").append((String)entry.getKey()).append("\">").append((String)entry.getValue()).append("</Entry>\n");
        }
        stringBuilder.append("</Map>");
    }

    @Override
    public String a() {
        return this.h();
    }

    @Override
    public String a(String[] arrstring) {
        if (arrstring == null || arrstring.length == 0) {
            return this.h();
        }
        for (String string : arrstring) {
            for (l l2 : l.values()) {
                if (!l2.name().equalsIgnoreCase(string)) continue;
                return this.a(l2);
            }
        }
        return this.h();
    }

    protected void b(StringBuilder stringBuilder) {
        boolean bl2 = true;
        for (Map.Entry entry : this.b.entrySet()) {
            if (!bl2) {
                stringBuilder.append(" ");
            }
            bl2 = false;
            stringBuilder.append((String)entry.getKey()).append("=\"").append((String)entry.getValue()).append("\"");
        }
    }

    protected void c(StringBuilder stringBuilder) {
        boolean bl2 = true;
        stringBuilder.append("{");
        for (Map.Entry entry : this.b.entrySet()) {
            if (!bl2) {
                stringBuilder.append(", ");
            }
            bl2 = false;
            stringBuilder.append("\"").append((String)entry.getKey()).append("\":");
            stringBuilder.append("\"").append((String)entry.getValue()).append("\"");
        }
        stringBuilder.append("}");
    }

    protected void d(StringBuilder stringBuilder) {
        boolean bl2 = true;
        stringBuilder.append("{");
        for (Map.Entry entry : this.b.entrySet()) {
            if (!bl2) {
                stringBuilder.append(", ");
            }
            bl2 = false;
            stringBuilder.append((String)entry.getKey()).append("=\"").append((String)entry.getValue()).append("\"");
        }
        stringBuilder.append("}");
    }

    public j b(Map map) {
        return new j(map);
    }

    public String toString() {
        return this.h();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        j j2 = (j)object;
        return this.b.equals(j2.b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    @Override
    public Throwable d() {
        return null;
    }
}

