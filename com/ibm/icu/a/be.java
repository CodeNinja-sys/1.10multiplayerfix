/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.bd;
import com.ibm.icu.a.iw;
import com.ibm.icu.util.dn;
import java.util.List;

class be
implements iw {
    final /* synthetic */ List a;
    final /* synthetic */ bd b;

    be(bd bd2, List list) {
        this.b = bd2;
        this.a = list;
    }

    public void a(String string) {
        if (string.endsWith(".res")) {
            String string2 = string.substring(0, string.length() - 4);
            if (string2.contains("_") && !string2.equals("res_index")) {
                this.a.add(string2);
            } else if (string2.length() == 2 || string2.length() == 3) {
                this.a.add(string2);
            } else if (string2.equalsIgnoreCase("root")) {
                this.a.add(dn.v.toString());
            }
        }
    }
}

