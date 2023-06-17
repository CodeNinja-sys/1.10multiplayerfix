/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.jh;
import com.ibm.icu.d.ji;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Vector;

class jj {
    private Vector a = new Vector();
    private Hashtable b = new Hashtable();

    public int a() {
        return this.a.size();
    }

    public jh a(int n2) {
        jh jh2 = (jh)this.a.elementAt(n2);
        return jh2;
    }

    public jh a(String string) {
        jh jh2 = (jh)this.b.get(string);
        if (jh2 == null) {
            jh2 = new jh(string);
            this.b.put(string, jh2);
            this.a.addElement(jh2);
        }
        return jh2;
    }

    public void b() {
        Collections.sort(this.a, new ji(null));
    }
}

