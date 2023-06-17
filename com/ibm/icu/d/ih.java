/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.a;
import com.ibm.icu.d.hy;
import java.util.ArrayList;
import java.util.List;

class ih {
    int a;
    int b;
    int c;
    List d;
    ih e;

    ih() {
        this.d = new ArrayList();
    }

    ih(ih ih2) {
        this.a = ih2.a;
        this.b = ih2.b;
        this.c = ih2.c;
        this.d = new ArrayList(ih2.d);
    }

    void a(int n2) {
        com.ibm.icu.a.a.a(n2 > this.a && n2 <= this.b);
        ih ih2 = new ih(this);
        ih2.a = n2;
        this.b = n2 - 1;
        ih2.e = this.e;
        this.e = ih2;
    }

    void a() {
        for (int i2 = 0; i2 < this.d.size(); ++i2) {
            hy hy2;
            hy hy3 = (hy)this.d.get(i2);
            String string = "";
            hy hy4 = hy3.y;
            if (hy4 != null && (hy2 = hy4.y) != null && hy2.x == 2) {
                string = hy2.D;
            }
            if (!string.equals("dictionary")) continue;
            this.c |= 0x4000;
            break;
        }
    }
}

