/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a;

import com.sun.jna.a.al;
import com.sun.jna.a.ar;
import com.sun.jna.a.c.f;
import com.sun.jna.a.c.k;
import com.sun.jna.a.c.o;
import java.awt.image.Raster;

class aq
implements ar {
    final /* synthetic */ Raster a;
    final /* synthetic */ al b;

    aq(al al2, Raster raster) {
        this.b = al2;
        this.a = raster;
    }

    public k a(f f2, o o2) {
        return this.a != null ? al.a(f2, o2, this.a) : null;
    }
}

