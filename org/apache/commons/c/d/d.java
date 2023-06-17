/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.d;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.commons.c.am;
import org.apache.commons.c.d.e;
import org.apache.commons.c.d.f;
import org.apache.commons.c.j.a;

public class d
implements Serializable,
e {
    private static final long a = 20110706L;
    private final List b = new ArrayList();

    public d a(String string, Object object) {
        this.b.add(new a(string, object));
        return this;
    }

    public d b(String string, Object object) {
        Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            org.apache.commons.c.j.e e2 = (org.apache.commons.c.j.e)iterator.next();
            if (!am.a((CharSequence)string, (CharSequence)e2.getKey())) continue;
            iterator.remove();
        }
        this.a(string, object);
        return this;
    }

    @Override
    public List a(String string) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        for (org.apache.commons.c.j.e e2 : this.b) {
            if (!am.a((CharSequence)string, (CharSequence)e2.getKey())) continue;
            arrayList.add(e2.getValue());
        }
        return arrayList;
    }

    @Override
    public Object b(String string) {
        for (org.apache.commons.c.j.e e2 : this.b) {
            if (!am.a((CharSequence)string, (CharSequence)e2.getKey())) continue;
            return e2.getValue();
        }
        return null;
    }

    @Override
    public Set b() {
        HashSet<Object> hashSet = new HashSet<Object>();
        for (org.apache.commons.c.j.e e2 : this.b) {
            hashSet.add(e2.getKey());
        }
        return hashSet;
    }

    @Override
    public List a() {
        return this.b;
    }

    @Override
    public String c(String string) {
        StringBuilder stringBuilder = new StringBuilder(256);
        if (string != null) {
            stringBuilder.append(string);
        }
        if (this.b.size() > 0) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append('\n');
            }
            stringBuilder.append("Exception Context:\n");
            int n2 = 0;
            for (org.apache.commons.c.j.e e2 : this.b) {
                stringBuilder.append("\t[");
                stringBuilder.append(++n2);
                stringBuilder.append(':');
                stringBuilder.append((String)e2.getKey());
                stringBuilder.append("=");
                Object object = e2.getValue();
                if (object == null) {
                    stringBuilder.append("null");
                } else {
                    String string2;
                    try {
                        string2 = object.toString();
                    }
                    catch (Exception exception) {
                        string2 = "Exception thrown on toString(): " + f.h(exception);
                    }
                    stringBuilder.append(string2);
                }
                stringBuilder.append("]\n");
            }
            stringBuilder.append("---------------------------------");
        }
        return stringBuilder.toString();
    }

    @Override
    public /* synthetic */ e c(String string, Object object) {
        return this.b(string, object);
    }

    @Override
    public /* synthetic */ e d(String string, Object object) {
        return this.a(string, object);
    }
}

