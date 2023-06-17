/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a;

import com.sun.jna.a.q;
import com.sun.jna.a.y;
import java.awt.Rectangle;
import java.awt.geom.Area;

class ab
implements q {
    final /* synthetic */ Area a;
    final /* synthetic */ y b;

    ab(y y2, Area area) {
        this.b = y2;
        this.a = area;
    }

    public boolean a(int n2, int n3, int n4, int n5) {
        this.a.add(new Area(new Rectangle(n2, n3, n4, n5)));
        return true;
    }
}

