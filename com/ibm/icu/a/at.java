/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.av;
import com.ibm.icu.a.bc;
import com.ibm.icu.a.cc;
import com.ibm.icu.a.jd;
import com.ibm.icu.util.dn;
import java.util.Map;
import java.util.Set;

public class at
extends av {
    protected final String a;

    public at() {
        this("com/ibm/icu/impl/data/icudt51b");
    }

    public at(String string) {
        super(true);
        this.a = string;
    }

    protected Set a() {
        return bc.b(this.a, this.b());
    }

    public void a(Map map) {
        Set set = bc.a(this.a, this.b());
        for (String string : set) {
            map.put(string, this);
        }
    }

    protected Object a(dn dn2, int n2, cc cc2) {
        return bc.a(this.a, dn2, this.b());
    }

    protected ClassLoader b() {
        ClassLoader classLoader = this.getClass().getClassLoader();
        if (classLoader == null) {
            classLoader = jd.a();
        }
        return classLoader;
    }

    public String toString() {
        return super.toString() + ", bundle: " + this.a;
    }
}

