/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.a.fi;
import com.ibm.icu.util.ak;
import com.ibm.icu.util.am;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class al
implements fi {
    private ArrayList a;

    private al() {
    }

    public boolean a(int n2, Iterator iterator) {
        am am2;
        if (this.a == null) {
            this.a = new ArrayList();
        }
        while (iterator.hasNext() && (am2 = (am)iterator.next()) != null) {
            int n3;
            for (n3 = 0; n3 < this.a.size(); ++n3) {
                am am3 = (am)this.a.get(n3);
                if (!am.a(am2).equals(am.a(am3))) continue;
                if (n2 <= am.b(am3).length()) break;
                this.a.set(n3, am2);
                break;
            }
            if (n3 != this.a.size()) continue;
            this.a.add(am2);
        }
        return true;
    }

    List a() {
        if (this.a == null || this.a.size() == 0) {
            return null;
        }
        return this.a;
    }

    /* synthetic */ al(ak ak2) {
        this();
    }
}

